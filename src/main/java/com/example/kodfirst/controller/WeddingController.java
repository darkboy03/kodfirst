package com.example.kodfirst.controller;

import com.example.kodfirst.dto.WeddingDto;
import com.example.kodfirst.entity.WeddingOrder;
import com.example.kodfirst.service.WeddingService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Controller
@Slf4j
public class WeddingController {

    @Autowired
    WeddingService weddingService;

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("userName","kod");
        return "/index";
    }

    @GetMapping("/orderList")
    public String orderList(Model model){

        model.addAttribute("orders",  weddingService.findAllDesc());
        return "wedding/orderList";
    }
    @GetMapping("/orders/save")
    public String orderSave(Model model) {

        return "wedding/orderSave";
    }

    @PostMapping("/api/v1/orders")
    public Long save(@RequestBody WeddingDto weddingDto){
        return weddingService.save(weddingDto);
    }

    //@PostMapping("/api/v1/orders")
    //public Long save(@RequestBody PostsSaveRequestDto requestDto) {
     //   return postsService.save(requestDto);
    //}

}
