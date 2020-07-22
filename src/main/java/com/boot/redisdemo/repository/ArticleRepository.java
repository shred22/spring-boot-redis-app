package com.boot.redisdemo.repository;

import com.boot.redisdemo.entity.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article, Long>  {
}
