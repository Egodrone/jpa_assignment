package se.lexicon.jpa_assignment.repository;


import org.springframework.data.repository.CrudRepository;
import se.lexicon.jpa_assignment.entity.Ingredient;
import java.util.Optional;


public interface IngredientRepository extends CrudRepository<Ingredient, Integer> {


    //findByIngredientId
    Optional<Ingredient> findById(int id);

    //ingredientName
    Optional<Ingredient> findByIngredientName(String ingredientName);


}
