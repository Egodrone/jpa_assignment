package se.lexicon.jpa_assignment.repository;


import org.springframework.data.repository.CrudRepository;
import se.lexicon.jpa_assignment.entity.RecipeInstruction;

import java.util.List;


public interface RecipeInstructionRepository extends CrudRepository<RecipeInstruction, String> {
    List<RecipeInstruction> findAll();
}
