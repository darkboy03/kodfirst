package com.example.kodfirst.controller;

import com.example.kodfirst.dto.ArticleForm;
import com.example.kodfirst.entity.Article;
import com.example.kodfirst.repository.ArticleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class ArticleController {

    @Autowired // 스프링부트가 미리생성해놓은 객체를 가져다가 자동연결;
    private ArticleRepository articleRepository;

    @GetMapping("/article/new")
    public String newArticleForm() {

        return "article/new";
    }

    @PostMapping("/article/create")
    public String createArticle(ArticleForm form){

        log.info(form.toString());
        //1. DTO 변환
        Article article = form.toEntity();
        log.info(article.toString());
        //2. Repository에게 Entity 를 디비안에저장
        Article saved = articleRepository.save(article);
        log.info(saved.toString());
        return "";
    }
}
