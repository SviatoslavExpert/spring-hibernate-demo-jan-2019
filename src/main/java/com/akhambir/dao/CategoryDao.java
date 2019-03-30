package com.akhambir.dao;

import com.akhambir.model.Category;

import java.util.List;

public interface CategoryDao {

    List<Category> getAll();

    Category getById(Long id);

    Category save(Category category);
}
