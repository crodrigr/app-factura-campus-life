package com.campusland.utils.conexionesdb.conexiondbjson;

import com.campusland.respository.models.Producto;
import com.campusland.utils.Configuracion;

public class ConexionDBJsonProductos extends ConexionBDJsonBase<Producto> {

    private static ConexionDBJsonProductos conexionProductos;

    protected ConexionDBJsonProductos() {
        super(Configuracion.obtenerValor("json.producto"));

    }

    public static ConexionDBJsonProductos getConexion() {
        if (conexionProductos != null) {
            return conexionProductos;
        } else {
            conexionProductos = new ConexionDBJsonProductos();
            return conexionProductos;
        }
    }
    
}
