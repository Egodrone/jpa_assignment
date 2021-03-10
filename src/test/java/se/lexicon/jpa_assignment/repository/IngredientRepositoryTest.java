package se.lexicon.jpa_assignment.repository;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import se.lexicon.jpa_assignment.entity.Ingredient;
import java.util.Optional;


@DataJpaTest
public class IngredientRepositoryTest {
    @Autowired
    IngredientRepository testObject;

    Ingredient ingredient;


    @BeforeEach
    public void setup() {
        ingredient = new Ingredient(1, "Tomato");
        testObject.save(ingredient);
    }


    @Test
    @DisplayName("Test find by id")
    public void test_find_by_id() {
        Optional<Ingredient> findIngredient = testObject.findById(1);
        Assertions.assertTrue(findIngredient.isPresent());
        Assertions.assertEquals(1, findIngredient.get().getIngredientId());
        Assertions.assertEquals("Tomato", findIngredient.get().getIngredientName());
    }


    @Test
    @DisplayName("Test find by name")
    public void test_find_by_name() {
        System.out.println("-------------------------------");
        String name = "Tomato";
        Optional<Ingredient> findIngredient = testObject.findByIngredientName(name);
        Assertions.assertEquals(1, findIngredient.get().getIngredientId());
        Assertions.assertEquals(name, findIngredient.get().getIngredientName());
    }


}
