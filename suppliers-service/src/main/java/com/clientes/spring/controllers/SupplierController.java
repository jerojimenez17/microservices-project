package com.clientes.spring.controllers;

import com.clientes.spring.entities.Supplier;
import com.clientes.spring.services.ISupplierService;
import com.clientes.spring.services.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SupplierController {
    @Autowired
    private ISupplierService service;

    @GetMapping("/api/suppliers")
    public List<Supplier> getAll(){
        return service.getAll();
    }

    @GetMapping("/api/suppliers/{id}")
    public Supplier getById(@PathVariable String id){
        return service.getById(Long.parseLong(id));
    }

    @DeleteMapping("/api/suppliers/{id}")
    public void remove(@PathVariable String id){
        service.remove(Long.parseLong(id));
    }
    @PostMapping("api/suppliers")
    public void save(@RequestBody Supplier supplier){
        service.save(supplier);
    }

}
