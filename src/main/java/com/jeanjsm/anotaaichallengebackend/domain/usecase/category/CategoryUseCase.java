package com.jeanjsm.anotaaichallengebackend.domain.usecase.category;

import com.jeanjsm.anotaaichallengebackend.app.provider.mongo.model.CategoryModel;
import com.jeanjsm.anotaaichallengebackend.domain.usecase.category.dto.CreateCategoryRequest;
import java.util.List;

public interface CategoryUseCase {

    CategoryModel create(CreateCategoryRequest createCategoryRequest);

    void delete(String id);

    CategoryModel getById(String id);

    CategoryModel update(String id, String ownerId, CreateCategoryRequest createCategoryRequest);

    List<CategoryModel> getAll(String ownerId);
}
