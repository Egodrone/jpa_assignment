package se.lexicon.jpa_assignment.repository;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import se.lexicon.jpa_assignment.entity.Ingredient;
import se.lexicon.jpa_assignment.entity.Measurement;
import se.lexicon.jpa_assignment.entity.Recipe;
import se.lexicon.jpa_assignment.entity.RecipeIngredient;

import java.util.List;
import java.util.Optional;


@DataJpaTest
public class RecipeIngredientRepositoryTest {
    @Autowired
    RecipeIngredientRepository testObject;
    RecipeIngredient recipeIngredient;
    RecipeIngredient recipeIngredient2;
    Ingredient ingredient;
    Ingredient ingredient2;
    Recipe recipe;
    Recipe recipe2;


    @BeforeEach
    public void setup() {
        ingredient = new Ingredient(1, "Ketchup");
        ingredient2 = new Ingredient(2, "Meat");
        recipe = new Recipe(1, "Recipe Name");
        recipe2 = new Recipe(2, "Recipe Name 2");
        recipeIngredient = new RecipeIngredient("123e4567-e89b-12d3-a456-556642440000", ingredient, 10.6, Measurement.DL, recipe);
        recipeIngredient2 = new RecipeIngredient("123e4567-e89b-12d3-a456-556642499999", ingredient2, 10.6, Measurement.DL, recipe2);
        testObject.save(recipeIngredient);
        testObject.save(recipeIngredient2);
    }


    @Test
    @DisplayName("Test of the RecipeIngredientRepository")
    public void test_recipe_ingredient_repository() {
        List<RecipeIngredient> recipeIngredientList = testObject.findAll();
        Assertions.assertEquals(2, recipeIngredientList.size());
    }



    @Test
    @DisplayName("Test find by id")
    public void test_find_by_id() {
        List<RecipeIngredient> recipeIngredientList = testObject.findAll();

        Optional<RecipeIngredient> findById = testObject.findById(recipeIngredientList.get(1).getRecipeIngredientId());
        Assertions.assertEquals("Meat", findById.get().getIngredient().getIngredientName());
    }


    @Test
    @DisplayName("Delete test")
    public void test_delete() {
        List<RecipeIngredient> recipeIngredientList = testObject.findAll();
        Assertions.assertEquals(2, recipeIngredientList.size());
        testObject.delete(recipeIngredient);
        //testObject.delete(recipeIngredient2);
        //recipeIngredientList = testObject.findAll();
        //Assertions.assertEquals(0, recipeIngredientList.size());
    }


}
