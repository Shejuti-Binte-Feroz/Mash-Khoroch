package com.shejuti.mash_khoroch.model;

import jakarta.persistence.*;

@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id")
    private User user;

    @Column(nullable = false)
    private String name;

    protected Category() {}

    public Category(User user, String name) {
        this.user = user;
        this.name = name;
    }

    public Long getId() { return id; }
    public User getUser() { return user; }
    public String getName() { return name; }
}