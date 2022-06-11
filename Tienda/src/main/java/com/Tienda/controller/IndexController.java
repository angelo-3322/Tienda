package com.Tienda.controller;

import com.Tienda.dao.ClienteDao;
import com.Tienda.domain.Cliente;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@Slf4j
public class IndexController {
    
    @Autowired
    private ClienteDao clienteDao;
    
    @GetMapping("/")
    
    public String inicio(Model model){
         log.info("Ahora se usa arquitectura MVC");
        
//        String mensaje = "Estamos en la semana 4, Saludos.";
//        model.addAttribute("texto",mensaje);
//        
//       Cliente cliente = new Cliente("Jonathan", "Brenes", "jbrenesbl@gmail.com","8820-2655");
//        model.addAttribute("cliente", cliente);
//        
//        Cliente cliente2 = new Cliente("Juan", "Lopez", "jbrenesbl@gmail.com","8820-2655");
//        Cliente cliente3 = new Cliente("pedro", "Lopez", "jbrenesbl@gmail.com","8820-2655");
//        var clientes = Arrays.asList(cliente, cliente2, cliente3);
        var clientes = clienteDao.findAll();
        
        model.addAttribute("clientes", clientes);
        return "index";
    }
}
