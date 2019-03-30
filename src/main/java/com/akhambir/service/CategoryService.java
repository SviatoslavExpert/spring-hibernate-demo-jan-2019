package com.akhambir.service;

import com.akhambir.model.Category;

import java.util.List;

public interface CategoryService {

    List<Category> getAll();

    Category getById(Long id);

    Category reduceCategoryPriceByPercents(Category category, int percents);
}
