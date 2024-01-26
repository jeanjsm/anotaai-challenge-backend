package com.jeanjsm.anotaaichallengebackend.domain.usecase.category;

import com.jeanjsm.anotaaichallengebackend.app.provider.mongo.model.CategoryModel;
import com.jeanjsm.anotaaichallengebackend.app.provider.mongo.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

@Service
@RequiredArgsConstructor
public class GetByIdCategoryUseCase {

    private final CategoryRepository categoryRepository;

    public CategoryModel getById(String id) {
        return categoryRepository.findById(id).orElseThrow(() -> new NotFoundException("Category not found"));
    }

}
