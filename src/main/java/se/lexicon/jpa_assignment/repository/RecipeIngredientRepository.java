package se.lexicon.jpa_assignment.repository;


import org.springframework.data.repository.CrudRepository;
import se.lexicon.jpa_assignment.entity.RecipeIngredient;
import java.util.List;
import java.util.Optional;


public interface RecipeIngredientRepository extends CrudRepository<RecipeIngredient, String> {

    Optional<RecipeIngredient> findById(String recipeIngredientId);
    List<RecipeIngredient> findAll();
    void delete(RecipeIngredient recipeIngredient);
}
