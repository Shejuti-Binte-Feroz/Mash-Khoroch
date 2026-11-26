package com.shejuti.mash_khoroch.dto;

import com.shejuti.mash_khoroch.model.Category;

public record CategoryResponse(Long id, String name) {

    public static CategoryResponse from(Category c) {
        return new CategoryResponse(c.getId(), c.getName());
    }
}