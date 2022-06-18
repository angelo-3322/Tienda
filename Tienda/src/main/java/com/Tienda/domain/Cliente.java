package com.Tienda.domain;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="cliente")
public class Cliente implements Serializable{

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    private long idCliente; //hibernet lo transforma en id_cliente    
    String nombre; 
    String apellidos;
    String correo;
    String telefono;

    public Cliente() {
    }

    public Cliente(long idCliente, String nombre, String apellidos, String correo, String telefono, String provincia) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
    }

    
    
    
}
