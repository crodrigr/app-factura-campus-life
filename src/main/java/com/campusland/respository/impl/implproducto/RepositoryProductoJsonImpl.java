package com.campusland.respository.impl.implproducto;

import java.util.List;

import com.campusland.respository.RepositoryProducto;
import com.campusland.respository.models.Producto;
import com.campusland.utils.conexionesdb.conexiondbjson.ConexionDBJsonProductos;

public class RepositoryProductoJsonImpl implements RepositoryProducto{

    ConexionDBJsonProductos conexion = ConexionDBJsonProductos.getConexion();

    @Override
    public List<Producto> listar() {
        return conexion.getData(Producto.class);        
    }

    @Override
    public Producto porCodigo(int codigo) {
        Producto resultado = null;
        for (Producto producto : conexion.getData(Producto.class)) {
            if (producto.getCodigo() == codigo) {
                resultado = producto;
                break;
            }
        }
        return resultado;
        
    }

    @Override
    public void crear(Producto producto) {
        List<Producto> listProducto=conexion.getData(Producto.class);
        listProducto.add(producto);
        conexion.saveData(listProducto);
        
    }

    @Override
    public void editar(Producto producto) {
        List<Producto> listProducto=conexion.getData(Producto.class); 
        boolean change=false;  
        for(Producto prod: listProducto){
            if (prod.getCodigo()==producto.getCodigo()) {
               prod.setNombre(producto.getNombre());
               prod.setPrecioVenta(producto.getPrecioVenta());
               prod.setPrecioCompra(producto.getPrecioCompra());
               prod.setDescripcion(prod.getDescripcion()); 
               change=true;               
               break;
           }
       } 
       if(change) conexion.saveData(listProducto);    
        
    }

    @Override
    public void eliminar(int codigo) {
        List<Producto> listProducto=conexion.getData(Producto.class); 
        boolean change=false;  
        for (Producto producto : listProducto) {
            if (producto.getCodigo() == codigo) {
                conexion.getData(Producto.class).remove(producto);
                change=true; 
                break;
            }
        }
        if(change) conexion.saveData(listProducto);  
    }
    
}
