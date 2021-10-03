/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tugasinventory.tugas2.repositories;

import com.tugasinventory.tugas2.models.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
/**
 *
 * @author farha
 */
@Repository
public interface InventoryRepository extends JpaRepository<Inventory, Long> {
    
}