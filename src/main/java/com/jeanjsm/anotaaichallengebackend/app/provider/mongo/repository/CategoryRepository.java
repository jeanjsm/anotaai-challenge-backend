package com.jeanjsm.anotaaichallengebackend.app.provider.mongo.repository;

import com.jeanjsm.anotaaichallengebackend.app.provider.mongo.model.CategoryModel;
import java.util.List;
import java.util.Optional;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryRepository extends MongoRepository<CategoryModel, String> {
    List<CategoryModel> findByOwnerId(String ownerId);

    Optional<CategoryModel> findByIdAndOwnerId(String id, String ownerId);

}
