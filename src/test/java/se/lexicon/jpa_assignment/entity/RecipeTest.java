package se.lexicon.jpa_assignment.entity;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;


public class RecipeTest {
    Recipe testObject;


    @BeforeEach
    public void setup() {
        List<RecipeIngredient> recipeIngredientList = new ArrayList<>();
        //RecipeIngredient recipeIngredient = new RecipeIngredient("123e4567-e89b-12d3-a456-556642440001", );
        testObject = new Recipe(1, "Bread");
        //recipeIngredientList.add("Sugar");
    }


    @Test
    @DisplayName("Test recipe object")
    public void test_object_creation() {
        Assertions.assertEquals(1, testObject.getRecipeId());
        Assertions.assertEquals("Bread", testObject.getRecipeName());
    }


    @Test
    @DisplayName("Test hashcode")
    public void test_hashcode() {
        Recipe expected = new Recipe(1, "Bread");
        Assertions.assertEquals(expected.hashCode(), testObject.hashCode());
    }


    @Test
    @DisplayName("Test full recipe")
    public void test_full_recipe() {
        Ingredient ingredient = new Ingredient(1, "Sugar");
        String instruction = "Bake 10 minutes in 220 degree";
        RecipeInstruction recipeInstruction = new RecipeInstruction(instruction);
        //List<>
        //Recipe expected = new Recipe(2, "Bread", );
    }

}
