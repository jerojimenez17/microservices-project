package com.clientes.spring.services;

import com.clientes.spring.entities.Supplier;

import java.util.List;

public interface ISupplierService {
    List<Supplier> getAll();

    Supplier getById(Long id);
    void remove(Long id);
    void save(Supplier supplier);

}
