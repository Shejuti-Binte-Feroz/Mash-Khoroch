package com.shejuti.mash_khoroch.dto;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

import java.time.LocalDate;

public record ExpenseRequest(
        @NotNull @Positive Long amount,
        @NotNull LocalDate expenseDate,
        @NotNull Long categoryId,
        @Size(max = 500) String note) {
}