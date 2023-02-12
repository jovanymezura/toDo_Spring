package com.example.toDo.domain;


import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import jakarta.persistence.Entity;
import javax.persistence.Table;


//Declaracion de la clase ShopingTodo
@Data
@Entity
//Annotation para no tener problemas con los querys
@Table(name = "shoping_todo")
public class ShopingTodo {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idshopings_list;
    private String name;
    private int type;
    private String description;

    private String shopingList;

}
