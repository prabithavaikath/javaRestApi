package com.example.demoRest.service;

import com.example.demoRest.model.Item;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ItemService {
    private final List<Item> itemStore = new ArrayList<>();
    private static Long nextId = 1L;
    
    public Item addItem(Item item) {
        // Set the ID if it's null
        if (item.getId() == null) {
            item.setId(nextId++);
        }
        itemStore.add(item);
        System.out.println("✅ Added: " + item.getName() + " (ID: " + item.getId() + ", Total: " + itemStore.size() + ")");
        return item;
    }
    
    public Optional<Item> getItemById(Long id) {
        return itemStore.stream()
                .filter(item -> item.getId().equals(id))
                .findFirst();
    }
    
    public List<Item> getAllItems() {
        return new ArrayList<>(itemStore);
    }
}
