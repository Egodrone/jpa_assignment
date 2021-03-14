package se.lexicon.jpa_assignment.repository;


import org.springframework.data.repository.CrudRepository;
import se.lexicon.jpa_assignment.entity.Recipe;
import se.lexicon.jpa_assignment.entity.RecipeCategory;

import java.util.List;


public interface RecipeRepository extends CrudRepository<Recipe, Integer> {
    List<Recipe> findAll();
}
