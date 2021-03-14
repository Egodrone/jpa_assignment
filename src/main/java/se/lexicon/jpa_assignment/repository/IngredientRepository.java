package se.lexicon.jpa_assignment.repository;


import org.springframework.data.repository.CrudRepository;
import se.lexicon.jpa_assignment.entity.Ingredient;

import java.util.List;
import java.util.Optional;


public interface IngredientRepository extends CrudRepository<Ingredient, Integer> {

    //save

    //@Override
    //<S extends Ingredient> S save(S s);

    //findByIngredientId
    Optional<Ingredient> findById(int id);

    //ingredientName
    Optional<Ingredient> findByIngredientName(String ingredientName);

    //find all
    List<Ingredient> findAll();


}
