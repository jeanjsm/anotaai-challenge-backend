package com.jeanjsm.anotaaichallengebackend.app.entrypoint.http.category;

import com.jeanjsm.anotaaichallengebackend.app.provider.mongo.model.CategoryModel;
import com.jeanjsm.anotaaichallengebackend.domain.usecase.category.dto.CreateCategoryRequest;
import com.jeanjsm.anotaaichallengebackend.domain.usecase.category.CreateCategoryUseCase;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/category")
public class CategoryController {

    private final CreateCategoryUseCase createCategoryUseCase;

    public CategoryController(CreateCategoryUseCase createCategoryUseCase) {
        this.createCategoryUseCase = createCategoryUseCase;
    }

    @PostMapping
    public CategoryModel create(@RequestBody CreateCategoryRequest createCategoryRequest) {
        return createCategoryUseCase.create(createCategoryRequest);
    }


}
