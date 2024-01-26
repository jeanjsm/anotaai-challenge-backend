package com.jeanjsm.anotaaichallengebackend.app.provider.mongo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("category")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CategoryModel {
    @Id
    private String id;
    private String title;
    private String description;
    private String ownerId;

}
