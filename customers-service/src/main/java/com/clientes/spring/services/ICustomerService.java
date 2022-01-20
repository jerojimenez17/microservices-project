package com.clientes.spring.services;
import java.util.List;
import com.clientes.spring.entities.Customer;

public interface ICustomerService {
    List<Customer> getAll();

    Customer getById(Long id);
    void remove(Long id);
    void save(Customer customer);
}
