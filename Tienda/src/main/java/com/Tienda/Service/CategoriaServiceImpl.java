
package com.Tienda.Service;

import com.Tienda.dao.CategoriaDao;
import com.Tienda.dao.CreditoDao;
import com.Tienda.domain.Categoria;
import com.Tienda.domain.Credito;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaDao categoriaDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Categoria> getCategorias(boolean activo) {
        var lista = (List<Categoria>) categoriaDao.findAll();
        
        if(activo){
            lista.removeIf(e -> !e.isActivo());
        }
         return lista;//cout4
    }

    @Override
    @Transactional(readOnly = true)
    public Categoria getCategoria(Categoria categoria) {
        return categoriaDao.findById(categoria.getIdCategoria()).orElse(null);
    }

    @Override
    @Transactional
    public void save(Categoria categoria) {

        categoriaDao.save(categoria);
    }

    @Override
    @Transactional
    public void delete(Categoria categoria) {
        categoriaDao.delete(categoria);
    }
    
}


