package sk.xidex.inloopxrestapi.repository;

import org.springframework.data.repository.CrudRepository;
import sk.xidex.inloopxrestapi.model.Product;

public interface ProductRepository extends CrudRepository<Product, Long> {
}
