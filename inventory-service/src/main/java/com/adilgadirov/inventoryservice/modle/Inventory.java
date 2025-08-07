package com.adilgadirov.inventoryservice.modle;

import jakarta.persistence.*;
import lombok.*;

@Table(name ="t_inventory")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Inventory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String skuCode;
    private Integer quantity;
}
