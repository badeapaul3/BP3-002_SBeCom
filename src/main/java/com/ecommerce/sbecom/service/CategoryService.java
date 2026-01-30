package com.ecommerce.sbecom.service;

import com.ecommerce.sbecom.model.Category;
import java.util.List;

public interface CategoryService {
    List<Category> getAllCategories();
    void createCategory(Category category);
}
