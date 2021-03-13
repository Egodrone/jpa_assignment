package se.lexicon.jpa_assignment.entity;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;


public class RecipeCategoryTest {

    List<RecipeCategory> testObject = new ArrayList<>();
    Ingredient ingredient;


    @BeforeEach
    public void setup() {
        List<Recipe> recipeList = new ArrayList<>();
        recipeList.add(new Recipe(1, "Organic bread"));
        recipeList.add(new Recipe(2, "Cola"));
        testObject.add(new RecipeCategory(1, "Bread", recipeList));
        testObject.add(new RecipeCategory(2, "Drink", recipeList));
    }


    @Test
    @DisplayName("Test of the RecipeCategory object")
    public void test() {
        Assertions.assertEquals("Bread", testObject.get(0).getCategory());
        Assertions.assertEquals("Drink", testObject.get(1).getCategory());
        Assertions.assertEquals(2, testObject.get(1).getCategoryId());
        //Assertions.assertEquals("---", testObject.get(1).getRecipes().get(1));
    }


    @Test
    @DisplayName("Test Hashcode")
    public void test_hash_code() {
        List<RecipeCategory> expected = new ArrayList<>();
        List<Recipe> testRecipeList = new ArrayList<>();
        testRecipeList.add(new Recipe(1, "Organic bread"));
        testRecipeList.add(new Recipe(2, "Cola"));
        expected.add(new RecipeCategory(1, "Bread", testRecipeList));
        expected.add(new RecipeCategory(2, "Drink", testRecipeList));
        Assertions.assertEquals(expected.hashCode(), testObject.hashCode());
    }


}
