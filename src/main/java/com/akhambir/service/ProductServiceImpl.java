package com.akhambir.service;

import com.akhambir.model.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Override
    public Product reducePriceByPercents(Product product, int percents) {
        double newPrice = product.getPrice() - (product.getPrice() * (percents / 100.0));
        product.setPrice(newPrice);
        return product;
    }
}
