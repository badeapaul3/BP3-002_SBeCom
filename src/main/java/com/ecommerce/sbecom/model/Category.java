package com.ecommerce.sbecom.model;


public class Category {
    private Long categoryId;
    private String categoryName;

    public Long getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(Long categoryId) {}

    public Category(Long categoryId, String categoryName) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
    }
}
