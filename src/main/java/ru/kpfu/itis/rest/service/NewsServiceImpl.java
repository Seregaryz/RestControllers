package ru.kpfu.itis.rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.kpfu.itis.rest.models.News;
import ru.kpfu.itis.rest.repository.NewsRepository;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsRepository newsRepository;

    @Override
    public List<News> showNews() {
        return newsRepository.findAll();
    }

}
