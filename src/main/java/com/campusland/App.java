package com.campusland;

import com.campusland.respository.models.Cliente;

public class App {
    public static void main(String[] args) {
        Cliente cliente=new Cliente("1","camilo","crodrigr@gmail.com","12345","xxx");
        System.out.println(cliente.getNombre());
    }
}