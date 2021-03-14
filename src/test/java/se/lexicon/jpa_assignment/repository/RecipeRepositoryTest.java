package se.lexicon.jpa_assignment.repository;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import se.lexicon.jpa_assignment.entity.*;

import java.util.ArrayList;
import java.util.List;


@DataJpaTest
public class RecipeRepositoryTest {
    @Autowired
    RecipeRepository testObject;
    Recipe recipe;
    Ingredient ingredient;
    RecipeInstruction recipeInstruction;
    List<Ingredient> ingredientList = new ArrayList<>();
    List<RecipeCategory> recipeCategoryList = new ArrayList<>();
    List<Recipe> recipeList = new ArrayList<>();

    IngredientRepository ingredientRepository;
    RecipeCategoryRepository recipeCategoryRepository;


    @BeforeEach
    public void setup() {
        /*
        List<RecipeIngredient> recipeIngredientList = new ArrayList<>();
        ingredient = new Ingredient(1, "Sugar");
        ingredientRepository.save(ingredient);
        recipe = new Recipe(1, "RecipeName");
        recipeIngredientList.add(new RecipeIngredient(ingredient, 10.4, Measurement.DL, recipe));
        recipeInstruction = new RecipeInstruction("Instruction test");
        recipeList.add(recipe);
        recipeCategoryList.add(new RecipeCategory(1, "Meat Category", recipeList));
        recipe = new Recipe(1, "Stake", recipeIngredientList, recipeInstruction, recipeCategoryList);
        testObject.save(recipe);

         */

        recipe = new Recipe(1, "Meat Recipe");
        testObject.save(recipe);
    }


    @Test
    @DisplayName("Test RecipeRepository")
    public void test_RecipeRepository() {
        List<Recipe> recipeList = testObject.findAll();
        Assertions.assertEquals(1, recipeList.size());
        Assertions.assertEquals("Meat Recipe", recipeList.get(0).getRecipeName());
    }


    @Test
    @DisplayName("Test hashcode")
    public void test_hashcode() {
        List<Recipe> recipeList = testObject.findAll();
        Recipe expected = new Recipe(1, "Meat Recipe");
        Assertions.assertEquals(expected.hashCode(), recipeList.get(0).hashCode());
    }


}
