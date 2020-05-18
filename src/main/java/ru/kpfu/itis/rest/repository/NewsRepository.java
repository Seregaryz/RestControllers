package ru.kpfu.itis.rest.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.kpfu.itis.rest.models.News;

public interface NewsRepository extends JpaRepository<News, Long> {

    @Query("from News news where " +
            "(upper(news.header) like concat('%', upper(:query), '%') or " +
            "upper(news.preview) like concat('%', upper(:query), '%') or " +
            "upper(news.text) like concat('%', upper(:query), '%'))")
    Page<News> search(@Param("query") String query, Pageable pageable);
}
