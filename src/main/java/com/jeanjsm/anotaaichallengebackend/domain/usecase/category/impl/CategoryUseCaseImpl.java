package com.jeanjsm.anotaaichallengebackend.domain.usecase.category.impl;

import com.jeanjsm.anotaaichallengebackend.app.provider.mongo.model.CategoryModel;
import com.jeanjsm.anotaaichallengebackend.app.provider.mongo.repository.CategoryRepository;
import com.jeanjsm.anotaaichallengebackend.domain.usecase.category.CategoryUseCase;
import com.jeanjsm.anotaaichallengebackend.domain.usecase.category.dto.CreateCategoryRequest;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryUseCaseImpl implements CategoryUseCase {

    private final CategoryRepository repository;

    @Override
    public CategoryModel create(CreateCategoryRequest createCategoryRequest) {
        return repository.save(createCategoryRequest.toModel());
    }

    @Override
    public void delete(String id) {
        repository.findById(id).ifPresent(repository::delete);
    }

    @Override
    public CategoryModel getById(String id) {
        return repository.findById(id).orElseThrow(() -> new IllegalArgumentException("Category not found"));
    }

    @Override
    public CategoryModel update(String id, String ownerId, CreateCategoryRequest createCategoryRequest) {
        repository.findByIdAndOwnerId(id, ownerId).ifPresent(category -> {
            category.setDescription(createCategoryRequest.description());
            category.setTitle(createCategoryRequest.title());
           repository.save(category);
        });
        return null;
    }

    @Override
    public List<CategoryModel> getAll(String ownerId) {
        return repository.findByOwnerId(ownerId);
    }
}
