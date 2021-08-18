package com.example.kodfirst.repository;

import com.example.kodfirst.entity.WeddingOrder;
import org.springframework.data.repository.CrudRepository;

import java.util.Collection;
import java.util.List;

public interface WeddingRepository extends CrudRepository<WeddingOrder, Long> {


}
