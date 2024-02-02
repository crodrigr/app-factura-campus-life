package com.campusland.utils.conexionesdb.conexiondbjson;

import com.campusland.respository.models.Cliente;
import com.campusland.utils.Configuracion;

public class ConexionBDJsonClientes extends ConexionBDJsonBase<Cliente> {

    private static ConexionBDJsonClientes conexionClientes;

    protected ConexionBDJsonClientes() {
        super(Configuracion.obtenerValor("json.cliente"));

    }

    public static ConexionBDJsonClientes getConexion() {
        if (conexionClientes != null) {
            return conexionClientes;
        } else {
            conexionClientes = new ConexionBDJsonClientes();
            return conexionClientes;
        }
    }

}
