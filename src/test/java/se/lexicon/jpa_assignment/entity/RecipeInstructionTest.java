package se.lexicon.jpa_assignment.entity;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


public class RecipeInstructionTest {
    RecipeInstruction testObject;


    @BeforeEach
    public void setup() {
        testObject = new RecipeInstruction("Instruction example of the recipe");
    }


    @Test
    @DisplayName("Test instruction")
    public void test_instruction() {
        Assertions.assertEquals("Instruction example of the recipe", testObject.getInstructions());
    }


    @Test
    @DisplayName("Test hashcode")
    public void test_hashcode() {
        RecipeInstruction expected = new RecipeInstruction("Instruction example of the recipe");
        Assertions.assertEquals(expected.hashCode(), testObject.hashCode());
        RecipeInstruction falseExpected = new RecipeInstruction("wrong instruction example of the recipe");
        Assertions.assertNotEquals(falseExpected.hashCode(), testObject.hashCode());
    }


}
