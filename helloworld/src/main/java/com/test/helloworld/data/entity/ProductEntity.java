package com.test.helloworld.data.entity;

import com.test.helloworld.data.dto.ProductDto;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "product")
public class ProductEntity {

    @Id
    String productId;
    String productName;
    Integer productPrice;
    Integer productStock;

    public ProductDto toDto(){
        return ProductDto.builder()
                .productId(productId)
                .productName(productName)
                .productPrice(productPrice)
                .productStock(productStock)
                .build();
    }



}
