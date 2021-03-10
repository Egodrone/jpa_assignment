package se.lexicon.jpa_assignment.entity;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class IngredientTest {

    Ingredient testObject;


    @BeforeEach
    public void setup() {
        testObject = new Ingredient(1, "Sugar");
    }


    @Test
    @DisplayName("Test created object")
    public void test_create_ingredient() {
        Assertions.assertEquals(1, testObject.getIngredientId());
        Assertions.assertEquals("Sugar", testObject.getIngredientName());
    }


    @Test
    @DisplayName("Test Hashcode")
    public void test_hash_code() {
        Ingredient expected = new Ingredient(1, "Sugar");
        Assertions.assertEquals(expected.hashCode(), testObject.hashCode());
    }




}
