package se.lexicon.jpa_assignment.repository;


import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import se.lexicon.jpa_assignment.entity.RecipeCategory;


@DataJpaTest
public class RecipeCategoryRepositoryTest {
    @Autowired
    RecipeCategoryRepository testObject;

    RecipeCategory recipeCategory;


    @BeforeEach
    public void setup() {
        //List<>
        //recipeCategory = new RecipeCategory(1, "Bread", );
    }


    @Test
    @DisplayName("")
    public void test_object() {
        //Assertions.assertEquals();
    }

}
