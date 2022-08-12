
package com.Tienda.Service;

import com.Tienda.domain.Carrito;


public interface CarritoService {
    public Carrito getCarrito(Carrito carrito);
    
    public Carrito getCarritoCliente(long idCliente);
}
