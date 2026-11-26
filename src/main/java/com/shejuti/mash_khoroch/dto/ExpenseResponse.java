package com.shejuti.mash_khoroch.dto;

import com.shejuti.mash_khoroch.model.Expense;

import java.time.Instant;
import java.time.LocalDate;

public record ExpenseResponse(
        Long id,
        long amount,
        LocalDate expenseDate,
        Long categoryId,
        String categoryName,
        String note,
        Instant createdAt) {

    public static ExpenseResponse from(Expense e) {
        return new ExpenseResponse(
                e.getId(),
                e.getAmount(),
                e.getExpenseDate(),
                e.getCategory().getId(),
                e.getCategory().getName(),
                e.getNote(),
                e.getCreatedAt());
    }
}