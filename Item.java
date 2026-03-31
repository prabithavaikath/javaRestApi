package com.demoapi.model;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import java.util.concurrent.atomic.AtomicLong;

public class Item {
    private static final AtomicLong idCounter = new AtomicLong(); // Auto-generate IDs

    private Long id;

    @NotBlank(message = "Name is mandatory") // Ensures name is not null/empty
    private String name;

    private String description;

    @NotNull(message = "Price cannot be null")
    @Positive(message = "Price must be greater than 0")
    private Double price;

    // --- Constructors ---
    public Item() {}

    public Item(String name, String description, Double price) {
        this.id = idCounter.incrementAndGet();
        this.name = name;
        this.description = description;
        this.price = price;
    }

    // --- Getters and Setters (Required for JSON conversion) ---
    // (If not using Lombok, generate these via IDE)
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }
}