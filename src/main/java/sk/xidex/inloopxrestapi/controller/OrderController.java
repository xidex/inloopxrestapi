package sk.xidex.inloopxrestapi.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import sk.xidex.inloopxrestapi.model.Order;

import java.util.Collection;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class OrderController {

    @GetMapping
    public Order getOrderById(long id) {
        return null;
    }

    @GetMapping
    public Collection<Order> getOrders() {
        return null;
    }

    @PutMapping
    public long updateOrder(Order order) {
        return -1;
    }

    @DeleteMapping
    public void deleteOrder(long id) {

    }
}
