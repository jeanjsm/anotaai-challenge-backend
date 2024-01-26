package com.jeanjsm.anotaaichallengebackend.domain.usecase.category.dto;

import com.jeanjsm.anotaaichallengebackend.app.provider.mongo.model.CategoryModel;
import lombok.Builder;

@Builder
public record CreateCategoryRequest(
    String title,
    String description,
    String ownerId
) {

    public CategoryModel toModel() {
        return CategoryModel.builder()
            .title(this.title)
            .description(this.description)
            .ownerId(this.ownerId)
            .build();
    }

}
