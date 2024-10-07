package com.upiiz.eje_02.controllers;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/clientes")
public class ClienteController {

    //Respuesta para todas las clientes       GET
    @GetMapping
    public String listarClientes() {
        return "Listado de todos las Clientes - Get";
    }

    //Respuesta para una cliente por su id -  GET
    @GetMapping("/{id}")
    public String listarClientePorId(@PathVariable int id) {
        return "Obtener un cliente por id - GET " + id;
    }

    //Agrega una cliente -                    POST
    @PostMapping
    public String agregarCliente(@RequestBody String cliente) {
        return "Agregar un cliente - POST: " + cliente;
    }

    //Actualizar una clientes -               PUT
    @PutMapping("/{id}")
    public String actualizarCliente(@PathVariable int id, @RequestBody String cliente) {
        return "Editar un cliente por id - PUT: " + cliente + " Con id: " + id;
    }

    //Eliminar una categoría -                  DELETE
    @DeleteMapping("/{id}")
    public String eliminarCliente(@PathVariable int id) {
        return "Eliminar un cliente por id - DELETE: " + id;
    }

    @GetMapping("/{id}/facturas")
    public String listarFacturas(@PathVariable int id) {
        return "Obtener todas las facturas del cliente con id: " + id;
    }

    @GetMapping("/{id}/facturas/{idFactura}")
    public String listarFacturas(@PathVariable int id, @PathVariable int idFactura) {
        return "Obtener la factura con id: " + idFactura + " del cliente id: " + id;
    }

}