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
public class RecipeCategoryRepositoryTest {
    @Autowired
    RecipeCategoryRepository testObject;

    RecipeCategory recipeCategory;
    RecipeIngredient recipeIngredient;
    Ingredient ingredient;
    Recipe recipe;
    RecipeInstruction recipeInstruction;


    @BeforeEach
    public void setup() {
        List<Recipe> recipeList = new ArrayList<>();
        List<RecipeCategory> recipeCategoryList = new ArrayList<>();
        ingredient = new Ingredient(1, "Flour");
        recipe = new Recipe();
        recipeIngredient = new RecipeIngredient(ingredient, 10.4, Measurement.DL, recipe);
        List<RecipeIngredient> recipeIngredientList = new ArrayList<>();
        recipeIngredientList.add(recipeIngredient);
        recipeInstruction = new RecipeInstruction("Bake in the oven 10 - 12 minutes");
        recipeCategoryList.add(new RecipeCategory(1, "Bread", recipeList));
        recipeList.add(new Recipe(1, "Brown bread", recipeIngredientList, recipeInstruction, recipeCategoryList));
        recipeCategory = new RecipeCategory(1, "Bread", recipeList);
    }


    @Test
    @DisplayName("test find all recipe categories")
    public void test_object() {
        System.out.println("--------------------------------------");
        System.out.println(recipeCategory.getCategory());
        //recipeCategory.getCategory();
        //testObject.save(recipeCategory);
        List<RecipeCategory> recipeCategoryList = testObject.findAll();
        Assertions.assertEquals(1, recipeCategoryList.size());
    }


}
