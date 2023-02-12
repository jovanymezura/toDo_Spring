package com.example.toDo.web;


import com.example.toDo.services.ShopingTodoServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
//Para poder escribir los logs en terminal
@Slf4j
public class PrincipalControlador {

    @Autowired
    private ShopingTodoServiceImpl shopingTodoServiceImpl;
    //Controlador se obtienen todos los registros
    @GetMapping("/")
    public String start(){
        var re = shopingTodoServiceImpl.getTodoShopingList();
        log.info("corriendo controlador-start"+ re);
        return "index";
    }

}
