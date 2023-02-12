package com.example.toDo.services;

import com.example.toDo.dao.ShopingtoDoDao;
import com.example.toDo.domain.ShopingTodo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

//Si no se pone el @Service no funciona
@Service
public class ShopingTodoServiceImpl implements ShopingTodoService{

    @Autowired
    private ShopingtoDoDao shopingtoDoDao;

    @Override
    @Transactional(readOnly = true)
    public List<ShopingTodo> getTodoShopingList() {
        return (List<ShopingTodo>) shopingtoDoDao.findAll();
    }

    @Override
    public void saveShopingTodo(ShopingTodo shopingTodo) {

    }

    @Override
    public void updateShopingTodo(ShopingTodo shopingTodo) {

    }

    @Override
    public void deleteShooingTodo(int id) {

    }

    @Override
    public ShopingtoDoDao gettoDoList() {
        return null;
    }

    @Override
    public ShopingTodo findShopingTodo(ShopingTodo persona) {
        return null;
    }
}
