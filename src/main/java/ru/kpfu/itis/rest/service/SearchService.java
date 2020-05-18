package ru.kpfu.itis.rest.service;

import ru.kpfu.itis.rest.dto.NewsSearchResult;

public interface SearchService {
    NewsSearchResult searchNews(String query, Integer page, Integer size);
}
