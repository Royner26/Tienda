
package com.Tienda.service;

import com.Tienda.domain.Categoria;
import java.util.List;


public interface CategoriaService {
    
    //Metodo para consultar las categorias. El parámetro define si se muestran activos o no
    public List<Categoria> getCategorias(boolean activos);
}
