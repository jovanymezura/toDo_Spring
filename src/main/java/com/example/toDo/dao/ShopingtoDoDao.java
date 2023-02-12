package com.example.toDo.dao;

import com.example.toDo.domain.ShopingTodo;
import org.springframework.data.repository.CrudRepository;

public interface ShopingtoDoDao extends CrudRepository<ShopingTodo, Long> {
}
