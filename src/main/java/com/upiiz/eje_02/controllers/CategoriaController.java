package com.upiiz.eje_02.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/categorias")
public class CategoriaController {
    //Respuesta para todas las categorias       GET
    @GetMapping
    public String listarCategorias() {
        return "Listado de todas las Categorias - Get";
    }

    //Respuesta para una categoria por su id -  GET
    @GetMapping("/{id}")
    public String listarCategoriaPorId(@PathVariable int id) {
        return "Obtener una categoria por id - GET " + id;
    }

    //Agrega una categoria -                    POST
    @PostMapping
    public String agregarCategoria(@RequestBody String categoria) {
        return "Agregar una categoria - POST: " + categoria;
    }

    //Actualizar una categorias -               PUT
    @PutMapping("/{id}")
    public String actualizarCategoria(@PathVariable int id, @RequestBody String categoria) {
        return "Editar una categoria por id - PUT: " + categoria + " Con id: " + id;
    }

    //Eliminar una categoría -                  DELETE
    @DeleteMapping("/{id}")
    public String eliminarCategoria(@PathVariable int id) {
        return "Eliminar una categoria por id - DELETE: " + id;
    }

}
