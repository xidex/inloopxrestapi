package sk.xidex.inloopxrestapi.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import sk.xidex.inloopxrestapi.model.Product;

import java.util.Collection;

@RestController("/product")
@RequestMapping(produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class ProductController {

    @GetMapping()
    public Product getProductById(long id) {
        return null;
    }

    @GetMapping
    public Collection<Product> getProducts() {
        return null;
    }

    @PutMapping
    public long updateProduct(Product product) {
        return -1;
    }

    @DeleteMapping
    public void deleteProduct(long id) {

    }
}
