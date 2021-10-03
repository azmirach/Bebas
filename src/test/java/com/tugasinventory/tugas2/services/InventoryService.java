/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tugasinventory.tugas2.services;

import com.tugasinventory.tugas2.interfaces.InventoryInterface;
import com.tugasinventory.tugas2.models.Inventory;
import com.tugasinventory.tugas2.repositories.InventoryRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author farha
 */
@Service
public class InventoryService implements InventoryInterface {
     @Autowired
    private InventoryRepository inventoryRepository;
    
    @Override
    public List<Inventory> getAll() {
        return inventoryRepository.findAll();
    }

    @Override
    public void store(Inventory inventory) {
        this.inventoryRepository.save(inventory);
    }
    
    @Override
    public Inventory getById(long id) {
        Optional < Inventory > optional = inventoryRepository.findById(id);

     if (!optional.isPresent()) {
        throw new RuntimeException(" Todo not found for id :: " + id);
    }

    Inventory inventory = optional.get();
    return inventory;
}

    @Override
    public void delete(long id) {
    this.inventoryRepository.deleteById(id);
}
}
