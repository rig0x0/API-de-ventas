package com.upiiz.eje_02.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/facturas")
public class FacturaController {
    //Respuesta para todas las facturas       GET
    @GetMapping
    public String listarFacturas() {
        return "Listado de todas las Facturas - Get";
    }

    //Respuesta para una factura por su id -  GET
    @GetMapping("/{id}")
    public String listarFacturaPorId(@PathVariable int id) {
        return "Obtener una factura por id - GET " + id;
    }

    //Agrega una factura -                    POST
    @PostMapping
    public String agregarFactura(@RequestBody String factura) {
        return "Agregar una factura - POST: " + factura;
    }

    //Actualizar una facturas -               PUT
    @PutMapping("/{id}")
    public String actualizarFactura(@PathVariable int id, @RequestBody String factura) {
        return "Editar una factura por id - PUT: " + factura + " Con id: " + id;
    }

    //Eliminar una categoría -                  DELETE
    @DeleteMapping("/{id}")
    public String eliminarFactura(@PathVariable int id) {
        return "Eliminar una factura por id - DELETE: " + id;
    }
}
