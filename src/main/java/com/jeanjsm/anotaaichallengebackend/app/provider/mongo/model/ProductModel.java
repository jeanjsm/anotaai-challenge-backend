package com.jeanjsm.anotaaichallengebackend.app.provider.mongo.model;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("product")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ProductModel {
    @Id
    private String id;
    private String title;
    private String ownerId;
    private String categoryId;
    private BigDecimal price;
    private String description;
}
