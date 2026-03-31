package com.example.demoRest.model;

public class Item {
    private static Long idCounter = 1L;
    private Long id;
    private String name;
    private String description;
    private Double price;
    
    public Item() {}
    
    public Item(String name, String description, Double price) {
        this.id = idCounter++;  // This sets the ID when creating new item
        this.name = name;
        this.description = description;
        this.price = price;
    }
    
    // Getters
    public Long getId() { return id; }
    public String getName() { return name; }
    public String getDescription() { return description; }
    public Double getPrice() { return price; }
    
    // Setters
    public void setId(Long id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setDescription(String description) { this.description = description; }
    public void setPrice(Double price) { this.price = price; }
}
