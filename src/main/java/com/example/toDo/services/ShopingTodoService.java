package com.example.toDo.services;

import com.example.toDo.dao.ShopingtoDoDao;
import com.example.toDo.domain.ShopingTodo;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ShopingTodoService {

    //Primeras pruebas
    List<ShopingTodo> getTodoShopingList();

    //Se puede craer una lista nueva
    public void  saveShopingTodo(ShopingTodo shopingTodo);

    //Se puede actualizar una lista
    public void updateShopingTodo(ShopingTodo shopingTodo);

    //Se puede eliminar una lista
    public void deleteShooingTodo(int id);

    //Obtiene lista detoDo
    public ShopingtoDoDao gettoDoList();

    public ShopingTodo findShopingTodo(ShopingTodo persona);
}
