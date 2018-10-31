package sk.xidex.inloopxrestapi.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import sk.xidex.inloopxrestapi.model.Customer;

import java.util.Collection;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class CustomerController {

    @GetMapping
    public Customer getCustomerById(long id) {
        return null;
    }

    @GetMapping
    public Collection<Customer> getCustomers() {
        return null;
    }

    @PutMapping
    public long updateCustomer(Customer customer) {
        return -1;
    }

    @DeleteMapping
    public void deleteCustomer(long id) {

    }

}
