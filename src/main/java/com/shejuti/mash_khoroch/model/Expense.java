package com.shejuti.mash_khoroch.model;

import jakarta.persistence.*;
import java.time.Instant;
import java.time.LocalDate;

@Entity
@Table(name = "expenses")
public class Expense {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "category_id")
    private Category category;

    @Column(name = "amount", nullable = false)
    private long amount;

    @Column(name = "expense_date", nullable = false)
    private LocalDate expenseDate;

    @Column(length = 500)
    private String note;

    @Column(name = "created_at", nullable = false, updatable = false)
    private Instant createdAt = Instant.now();

    protected Expense() {}

    public Expense(User user, Category category, long amount,
                   LocalDate expenseDate, String note) {
        this.user = user;
        this.category = category;
        this.amount = amount;
        this.expenseDate = expenseDate;
        this.note = note;
    }

    public Long getId() { return id; }
    public User getUser() { return user; }
    public Category getCategory() { return category; }
    public long getAmountPaisa() { return amount; }
    public LocalDate getExpenseDate() { return expenseDate; }
    public String getNote() { return note; }
    public Instant getCreatedAt() { return createdAt; }
}