package com.programmingtechie.inventoryservice.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.programmingtechie.inventoryservice.repository.InventoryRepository;

import lombok.RequiredArgsConstructor;

// @Service
// @RequiredArgsConstructor
// public class InventoryService {
//     //@Autowired
//     private final InventoryRepository inventoryRepository;
    
//     @Transactional(readOnly=true)
//     public boolean isInStock(List<String> skuCode){
//         return inventoryRepository.findBySkuCode(skuCode).isPresent();
//     }
// }
