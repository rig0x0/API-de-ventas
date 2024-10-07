package com.upiiz.eje_02.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/ventas")
public class VentaController {

    //Respuesta para todas las ventas       GET
    @GetMapping
    public String listarVentas() {
        return "Listado de todas las Ventas - Get";
    }

    //Respuesta para una venta por su id -  GET
    @GetMapping("/{id}")
    public String listarVentaPorId(@PathVariable int id) {
        return "Obtener una venta por id - GET " + id;
    }

    //Agrega una venta -                    POST
    @PostMapping
    public String agregarVenta(@RequestBody String venta) {
        return "Agregar una venta - POST: " + venta;
    }

    //Actualizar una ventas -               PUT
    @PutMapping("/{id}")
    public String actualizarVenta(@PathVariable int id, @RequestBody String venta) {
        return "Editar una venta por id - PUT: " + venta + " Con id: " + id;
    }

    //Eliminar una venta -                  DELETE
    @DeleteMapping("/{id}")
    public String eliminarVenta(@PathVariable int id) {
        return "Eliminar una venta por id - DELETE: " + id;
    }

}
