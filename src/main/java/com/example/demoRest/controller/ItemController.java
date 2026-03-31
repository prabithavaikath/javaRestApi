package com.example.demoRest.controller;

import com.example.demoRest.model.Item;
import com.example.demoRest.service.ItemService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/items")
public class ItemController {
    
    private final ItemService itemService;
    
    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }
    
    @PostMapping
    public ResponseEntity<Item> createItem(@RequestBody Item item) {
        // Basic validation
        if (item.getName() == null || item.getName().trim().isEmpty()) {
            return ResponseEntity.badRequest().build();
        }
        if (item.getPrice() == null || item.getPrice() <= 0) {
            return ResponseEntity.badRequest().build();
        }
        
        Item savedItem = itemService.addItem(item);
        return new ResponseEntity<>(savedItem, HttpStatus.CREATED);
    }
    
    @GetMapping("/{id}")
    public ResponseEntity<Item> getItemById(@PathVariable Long id) {
        return itemService.getItemById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    
    @GetMapping
    public List<Item> getAllItems() {
        return itemService.getAllItems();
    }
}
