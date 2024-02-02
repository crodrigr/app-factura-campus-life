package com.campusland.utils.conexionesdb.conexiondbjson;

import com.campusland.respository.models.Factura;
import com.campusland.utils.Configuracion;

public class ConexionDBJsonFacturas extends ConexionBDJsonBase<Factura> {

    private static ConexionDBJsonFacturas conexionFacturas;

    protected ConexionDBJsonFacturas() {
        super(Configuracion.obtenerValor("json.factura"));

    }

    public static ConexionDBJsonFacturas getConexion() {
        if (conexionFacturas != null) {
            return conexionFacturas;
        } else {
            conexionFacturas = new ConexionDBJsonFacturas();
            return conexionFacturas;
        }
    }
    
}
