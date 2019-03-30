package com.akhambir.service;

import com.akhambir.model.Product;

public interface ProductService {

    Product reducePriceByPercents(Product product, int percents);

}
