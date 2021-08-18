package com.example.kodfirst.entity;

import lombok.*;

import javax.persistence.*;


@Getter
@NoArgsConstructor
@Entity
public class WeddingOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userName;

    private String title;

    private String content;

    @Builder
    public WeddingOrder(Long id, String userName, String title, String content) {
        this.id = id;
        this.userName = userName;
        this.title = title;
        this.content = content;
    }
}



