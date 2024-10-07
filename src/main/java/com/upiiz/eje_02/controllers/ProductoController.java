package com.upiiz.eje_02.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/productos")
public class ProductoController {
    //Respuesta para todos los productos       GET
    @GetMapping
    public String listarProductos() {
        return "Listado de todos los Productos - Get";
    }

    //Respuesta para un producto por su id -  GET
    @GetMapping("/{id}")
    public String listarProductoPorId(@PathVariable int id) {
        return "Obtener un producto por su id - GET " + id;
    }

    //Agregar un producto -                    POST
    @PostMapping
    public String agregarProducto(@RequestBody String producto) {
        return "Agregar un producto - POST: " + producto;
    }

    //Actualizar un producto -               PUT
    @PutMapping("/{id}")
    public String actualizarProducto(@PathVariable int id, @RequestBody String producto) {
        return "Editar un producto por id - PUT: " + producto + ", con id: " + id;
    }

    //Eliminar un producto -                  DELETE
    @DeleteMapping("/{id}")
    public String eliminarProducto(@PathVariable int id) {
        return "Eliminar un producto por id - DELETE: " + id;
    }
}
