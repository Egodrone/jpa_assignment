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
        testObject = new Recipe();
        //recipeIngredientList.add("Sugar");
    }


    @Test
    @DisplayName("Test ")
    public void test_2() {

    }


}
