package ru.kpfu.itis.rest.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.kpfu.itis.rest.dto.NewsSearchResult;
import ru.kpfu.itis.rest.service.SearchService;

@RestController
@RequestMapping("/search")
public class SearchController {

    @Autowired
    private SearchService service;

    @GetMapping("/news")
    public NewsSearchResult searchNews(@RequestParam("q") String query,
                                        @RequestParam("page") Integer page,
                                        @RequestParam("size") Integer size) {
        return service.searchNews(query, page, size);
    }
}

