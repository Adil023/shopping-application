package com.adilgadirov.inventoryservice.repository;

import com.adilgadirov.inventoryservice.modle.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface InventoryRepository extends JpaRepository<Inventory, Long>{
    Optional<Inventory>  findBySkuCode(String skuCode);
}
