package se.lexicon.jpa_assignment.entity;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class RecipeIngredientTest {
    RecipeIngredient testObject;

    @BeforeEach
    public void setup() {
        Recipe recipe = new Recipe();
        Ingredient ingredient = new Ingredient(1, "Sugar");
        testObject = new RecipeIngredient(ingredient, 10.4, Measurement.DL, recipe);
    }


    @Test
    @DisplayName("Test of the created object")
    public void test_created_object() {
        System.out.println(Measurement.DL.getMeasurementCode());
        Assertions.assertEquals(10.4, testObject.getAmount());
        Assertions.assertEquals(Measurement.DL, testObject.getMeasurement());
        Assertions.assertEquals("Ingredient{ingredientId=1, ingredientName='Sugar', recipeIngredient=null}", testObject.getIngredient().toString());
    }


}
