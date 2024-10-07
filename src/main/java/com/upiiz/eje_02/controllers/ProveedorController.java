package com.upiiz.eje_02.controllers;

import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/v1/proveedor")
@RestController
public class ProveedorController {
    //Respuesta para todos los proveedores       GET
    @GetMapping
    public String listarProveedores() {
        return "Listado de todos las Proveedores - Get";
    }

    //Respuesta para un proveedor por su id -  GET
    @GetMapping("/{id}")
    public String listarProveedorPorId(@PathVariable int id) {
        return "Obtener un proveedor por id - GET " + id;
    }

    //Agregar un proveedor -                    POST
    @PostMapping
    public String agregarProveedor(@RequestBody String proveedor) {
        return "Agregar un proveedor - POST: " + proveedor;
    }

    //Actualizar una proveedores -               PUT
    @PutMapping("/{id}")
    public String actualizarProveedor(@PathVariable int id, @RequestBody String proveedore) {
        return "Editar un proveedor por id - PUT: " + proveedore + " Con id: " + id;
    }

    //Eliminar una proveedor -                  DELETE
    @DeleteMapping("/{id}")
    public String eliminarProveedor(@PathVariable int id) {
        return "Eliminar una proveedor por id - DELETE: " + id;
    }
}
