
package com.Tienda.service;

import com.Tienda.domain.Categoria;
import java.util.List;


public interface CategoriaService {
    
    //Metodo para consultar las categorias. El parámetro define si se muestran activos o no
    public List<Categoria> getCategorias(boolean activos);
    
    //Se obtiene una categoría por su id
    public Categoria getcategoria(Categoria categoria);
    
    //Insertar: Se inserta cuando el IdCategoria está vacío (valor 0 o null)
    //Modificar: Se modifica cuando el IdCategoria NO está vacío
    public void save(Categoria categoria);
    
    //Se elimina un registro por su IdCategoria
    public void delete(Categoria categoria);

    public Categoria getCategoria(Categoria categoria);
}
