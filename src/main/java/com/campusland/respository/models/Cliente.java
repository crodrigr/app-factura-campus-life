package com.campusland.respository.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {

    private String documento;
    private String nombre;
    private String email;
    private String celular;
    private String direccion;
    

    
}
