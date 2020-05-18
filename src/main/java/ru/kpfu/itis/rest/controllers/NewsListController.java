package ru.kpfu.itis.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.kpfu.itis.rest.dto.NewsSearchResult;
import ru.kpfu.itis.rest.models.News;
import ru.kpfu.itis.rest.service.NewsService;
import ru.kpfu.itis.rest.service.SearchService;

import java.util.List;

@RestController
public class NewsListController {

    @Autowired
    private NewsService service;

    @GetMapping("/newsList")
    public List<News> searchNews() {
        return service.showNews();
    }
}