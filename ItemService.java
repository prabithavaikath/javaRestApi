package com.demoapi.service;

import com.demoapi.model.Item;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service // Tells Spring to manage this class
public class ItemService {

    private final List<Item> itemStore = new ArrayList<>();

    // Add a new item to the list
    public Item addItem(Item item) {
        itemStore.add(item);
        return item;
    }

    // Find an item by its ID
    public Optional<Item> getItemById(Long id) {
        return itemStore.stream()
                .filter(item -> item.getId().equals(id))
                .findFirst();
    }
    
    // Optional: Get all items (useful for testing)
    public List<Item> getAllItems() {
        return new ArrayList<>(itemStore);
    }
}