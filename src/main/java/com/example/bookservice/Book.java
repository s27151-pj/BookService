package com.example.bookservice;

import jakarta.persistence.*;


@Entity
@Table(name = "books")
public class Book {
    @Id
    @Column(name = "id", nullable = false, unique = true)
    private long id;
    @Column(name = "title", nullable = false)
    private String title;
    @Enumerated(EnumType.STRING)
    @Column(name = "category", nullable = false)
    private Category category;
    @Column(name = "pages", nullable = false)
    private long pages;

    public Book() {}
    public Book(long id, String title, Category category, long pages) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.pages = pages;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public long getPages() {
        return pages;
    }

    public void setPages(long pages) {
        this.pages = pages;
    }
}

