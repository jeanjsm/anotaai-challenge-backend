package com.jeanjsm.anotaaichallengebackend.domain.usecase.category;

import com.jeanjsm.anotaaichallengebackend.app.provider.mongo.model.CategoryModel;
import com.jeanjsm.anotaaichallengebackend.app.provider.mongo.repository.CategoryRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GetAllCategoryUseCase {

    private final CategoryRepository categoryRepository;

    public List<CategoryModel> getAll() {
        return categoryRepository.findAll();
    }

}
