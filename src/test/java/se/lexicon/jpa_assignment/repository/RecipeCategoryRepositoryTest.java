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
import java.util.Optional;


@DataJpaTest
public class RecipeCategoryRepositoryTest {
    @Autowired
    RecipeCategoryRepository testObject;

    RecipeInstruction recipeInstruction;
    RecipeIngredient recipeIngredient;
    RecipeCategory recipeCategory;
    Ingredient ingredient;
    Recipe recipe;


    @BeforeEach
    public void setup() {
        List<Recipe> recipeList = new ArrayList<>();
        List<RecipeCategory> recipeCategoryList = new ArrayList<>();
        ingredient = new Ingredient(1, "Flour");
        recipe = new Recipe(1, "Recipe Test");
        recipeIngredient = new RecipeIngredient("123e4567-e89b-12d3-a456-556642440000", ingredient, 10.4, Measurement.DL, recipe);
        List<RecipeIngredient> recipeIngredientList = new ArrayList<>();
        recipeIngredientList.add(recipeIngredient);
        recipeInstruction = new RecipeInstruction("Bake in the oven 10 - 12 minutes");
        recipeCategoryList.add(new RecipeCategory(1, "Bread", recipeList));
        recipeList.add(new Recipe(1, "Brown bread", recipeIngredientList, recipeInstruction, recipeCategoryList));
        recipeCategory = new RecipeCategory(1, "Bread", recipeList);
        System.out.println("---------------------------------");
        System.out.println(recipeCategory.getCategory());
        System.out.println(recipeCategory.getRecipes().size());
        System.out.println("---------------------------------");
        testObject.save(recipeCategory);
    }


    @Test
    @DisplayName("Test find all recipe categories")
    public void test_object() {
        System.out.println("--------------------------------------");
        //System.out.println(recipeCategory.getCategory());
        //recipeCategory.getCategory();
        //testObject.save(recipeCategory);
        List<RecipeCategory> recipeCategoryList = testObject.findAll();
        Assertions.assertEquals(1, recipeCategoryList.size());
    }


    @Test
    @DisplayName("Test find by id")
    public void test_find_by_id() {
        Optional<RecipeCategory> findByIdRC = testObject.findById(1);
        Assertions.assertEquals("Bread", findByIdRC.get().getCategory());
    }


}
