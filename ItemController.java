package com.demoapi.controller;

import java.util.List;
import com.demoapi.model.Item;
import com.demoapi.service.ItemService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController // Marks this class as a REST API controller
@RequestMapping("/api/items") // Base path for all endpoints in this class
public class ItemController {

    private final ItemService itemService;

    // Constructor Injection (Best practice)
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    // 1. Add a new item (POST request)
    @PostMapping
    public ResponseEntity<Item> createItem(@Valid @RequestBody Item item) {
        // The @Valid annotation triggers the validation we defined in the Item class
        // The @RequestBody tells Spring to convert the incoming JSON into an Item object
        Item savedItem = itemService.addItem(item);
        return new ResponseEntity<>(savedItem, HttpStatus.CREATED); // Returns HTTP 201
    }

    // 2. Get a single item by ID (GET request)
    @GetMapping("/{id}")
    public ResponseEntity<Item> getItemById(@PathVariable Long id) {
        // @PathVariable extracts the ID from the URL
        return itemService.getItemById(id)
                .map(ResponseEntity::ok) // If found, return HTTP 200 with the item
                .orElse(ResponseEntity.notFound().build()); // If not found, return HTTP 404
    }
}