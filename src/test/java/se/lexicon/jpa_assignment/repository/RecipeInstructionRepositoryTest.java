package se.lexicon.jpa_assignment.repository;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import se.lexicon.jpa_assignment.entity.RecipeInstruction;

import java.util.List;
import java.util.Optional;


@DataJpaTest
public class RecipeInstructionRepositoryTest {
    @Autowired
    RecipeInstructionRepository testObject;
    RecipeInstruction recipeInstruction;
    RecipeInstruction recipeInstruction2;
    RecipeInstruction recipeInstruction3;


    @BeforeEach
    public void setup() {
        recipeInstruction = new RecipeInstruction("You need to cook chicken at least 20 minutes");
        recipeInstruction2 = new RecipeInstruction("Bread need to be in the oven 10 minutes");
        recipeInstruction3 = new RecipeInstruction("Add some pepper and salt after your taste");
        testObject.save(recipeInstruction);
        testObject.save(recipeInstruction2);
        testObject.save(recipeInstruction3);
    }


    @Test
    @DisplayName("Test instruction obj")
    public void test_instruction() {
        List<RecipeInstruction> recipeInstructionList = testObject.findAll();
        Assertions.assertEquals(3, recipeInstructionList.size());
        Assertions.assertEquals("Add some pepper and salt after your taste", recipeInstructionList.get(2).getInstructions());
        Assertions.assertEquals("Bread need to be in the oven 10 minutes", recipeInstructionList.get(1).getInstructions());
        Assertions.assertEquals("You need to cook chicken at least 20 minutes", recipeInstructionList.get(0).getInstructions());
    }


    @Test
    @DisplayName("Test find by id")
    public void test_find_by_id() {
        List<RecipeInstruction> recipeInstructionList = testObject.findAll();
        Optional<RecipeInstruction> recipeInstructionOptional = testObject.findById(recipeInstructionList.get(0).getInstructionsId());
        Assertions.assertEquals("You need to cook chicken at least 20 minutes", recipeInstructionOptional.get().getInstructions());
    }


}
