package com.jeanjsm.anotaaichallengebackend.domain.usecase.category;

import com.jeanjsm.anotaaichallengebackend.app.provider.mongo.model.CategoryModel;
import com.jeanjsm.anotaaichallengebackend.app.provider.mongo.repository.CategoryRepository;
import com.jeanjsm.anotaaichallengebackend.domain.usecase.category.dto.CreateCategoryRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CreateCategoryUseCase {

    private final CategoryRepository repository;

    public CategoryModel create(CreateCategoryRequest createCategoryRequest) {
        return repository.save(createCategoryRequest.toModel());
    }

}
