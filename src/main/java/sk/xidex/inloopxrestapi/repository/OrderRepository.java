package sk.xidex.inloopxrestapi.repository;

import org.springframework.data.repository.CrudRepository;
import sk.xidex.inloopxrestapi.model.Order;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
