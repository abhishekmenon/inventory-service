package com.programmingtechie.inventoryservice;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.programmingtechie.inventoryservice.model.Inventory;
import com.programmingtechie.inventoryservice.repository.InventoryRepository;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	
	}
	@Bean
	public CommandLineRunner loadData(InventoryRepository inventoryRepository){
		return args->{
			Inventory inventory=new Inventory();
			inventory.setSkuCode("iphone_14");
			inventory.setQuantity(100);

			Inventory inventory1=new Inventory();
			inventory1.setSkuCode("iphone_13_Reds");
			inventory1.setQuantity(100);

			
			inventoryRepository.save(inventory);
			inventoryRepository.save(inventory1);


		};
		
	}
	public static boolean isInStock(List<String> skuCode) {
		return false;
	}
}


