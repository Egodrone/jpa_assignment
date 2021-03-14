package se.lexicon.jpa_assignment.repository;


import org.springframework.data.repository.CrudRepository;
import se.lexicon.jpa_assignment.entity.RecipeCategory;
import java.util.List;
import java.util.Optional;


public interface RecipeCategoryRepository extends CrudRepository<RecipeCategory, Integer> {
    List<RecipeCategory> findAll();
    Optional<RecipeCategory> findById(int categoryId);
}
