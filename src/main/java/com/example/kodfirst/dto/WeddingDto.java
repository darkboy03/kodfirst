package com.example.kodfirst.dto;

import com.example.kodfirst.entity.WeddingOrder;
import lombok.*;


@Getter
@NoArgsConstructor
public class WeddingDto {

    private Long id;
    private String userName;
    private String title;
    private String content;

    @Builder
    public WeddingDto(String userName, String title, String content) {
        this.userName = userName;
        this.title = title;
        this.content = content;
    }

    public WeddingOrder toEntity(){
        return WeddingOrder.builder()
                .title(title)
                .userName(userName)
                .content(content)
                .build();
    }
}
