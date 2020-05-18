package ru.kpfu.itis.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.rest.dto.NewsSearchResult;
import ru.kpfu.itis.rest.models.News;
import ru.kpfu.itis.rest.repository.NewsRepository;

import java.util.List;

@Service
public class SearchServiceImpl implements SearchService {

    @Autowired
    private NewsRepository newsRepository;

    @Override
    public NewsSearchResult searchNews(String query, Integer page, Integer size) {
        PageRequest pageRequest = PageRequest.of(page, size);
        Page<News> pageResult = newsRepository.search(query, pageRequest);
        List<News> newsList = pageResult.getContent();
        return NewsSearchResult.builder()
                .news(newsList)
                .count(pageResult.getTotalPages())
                .build();
    }
}
