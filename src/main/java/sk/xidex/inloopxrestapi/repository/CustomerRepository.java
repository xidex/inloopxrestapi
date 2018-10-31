package sk.xidex.inloopxrestapi.repository;

import org.springframework.data.repository.CrudRepository;
import sk.xidex.inloopxrestapi.model.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {
}
