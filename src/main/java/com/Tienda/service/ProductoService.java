package com.Tienda.service;

import com.Tienda.domain.Producto;
import java.util.List;

public interface ProductoService {

    //Metodo para consultar las productos. El parámetro define si se muestran activos o no
    public List<Producto> getProductos(boolean activos);

    //Se obtiene una categoría por su id
    public Producto getproducto(Producto producto);

    //Insertar: Se inserta cuando el IdProducto está vacío (valor 0 o null)
    //Modificar: Se modifica cuando el IdProducto NO está vacío
    public void save(Producto producto);

    //Se elimina un registro por su IdProducto
    public void delete(Producto producto);

    public Producto getProducto(Producto producto);

    // Lista de productos con precio entre ordendados por descripción ConsultaAmpliada
    public List<Producto> findByPrecioBetweenOrderByDescripcion(double precioInf, double precioSup);

    //Lista de productos utilizando consultas con JPQL    
    public List<Producto> metodoJPQL(double precioInf, double precioSup);

    //Lista de productos utilizando consultas con SQL Nativo
    public List<Producto> metodoNativo(double precioInf, double precioSup);

}
