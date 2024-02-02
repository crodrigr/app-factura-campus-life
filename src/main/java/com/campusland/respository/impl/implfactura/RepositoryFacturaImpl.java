package com.campusland.respository.impl.implfactura;

import java.util.List;

import com.campusland.respository.RepositoryFactura;
import com.campusland.respository.models.Factura;
import com.campusland.utils.conexionesdb.conexiondbjson.ConexionDBJsonFacturas;

public class RepositoryFacturaImpl implements RepositoryFactura {

    ConexionDBJsonFacturas conexion = ConexionDBJsonFacturas.getConexion();

    @Override
    public List<Factura> listar() {
        return conexion.getData(Factura.class);
        
    }

    @Override
    public void crear(Factura factura) {
       List<Factura> listFactura=conexion.getData(Factura.class);
       listFactura.add(factura);
       conexion.saveData(listFactura);
        
    }

}
