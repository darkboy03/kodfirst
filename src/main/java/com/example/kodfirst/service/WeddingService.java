package com.example.kodfirst.service;

import com.example.kodfirst.dto.WeddingDto;
import com.example.kodfirst.entity.WeddingOrder;
import com.example.kodfirst.repository.WeddingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class WeddingService {

    @Autowired
    private WeddingRepository weddingRepository;

    public List<WeddingOrder> findAllDesc() {
       List<WeddingOrder> orders = new ArrayList<>();
       weddingRepository.findAll().forEach(e -> orders.add(e));

       return orders;
    }

    @Transactional
    public Long save(WeddingDto weddingDto){
        return weddingRepository.save(weddingDto.toEntity()).getId();
    }
//    public Long save(PostsSaveRequestDto requestDto) {
//        return postsRepository.save(requestDto.toEntity()).getId();
//    }
}
