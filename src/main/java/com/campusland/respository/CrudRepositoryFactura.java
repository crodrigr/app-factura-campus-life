package com.campusland.respository;

public interface CrudRepositoryFactura {

    List<Factura> listar();

    void crear(Factura factura);
    
}
