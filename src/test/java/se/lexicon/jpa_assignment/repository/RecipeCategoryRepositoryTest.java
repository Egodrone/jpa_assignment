package se.lexicon.jpa_assignment.repository;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;


@DataJpaTest
public class RecipeCategoryRepositoryTest {
    @Autowired
    RecipeCategoryRepository testObject;

}
