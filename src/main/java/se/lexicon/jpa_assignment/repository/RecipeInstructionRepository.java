package se.lexicon.jpa_assignment.repository;


import org.springframework.data.repository.CrudRepository;
import se.lexicon.jpa_assignment.entity.RecipeInstruction;

import java.util.List;
import java.util.Optional;


public interface RecipeInstructionRepository extends CrudRepository<RecipeInstruction, String> {
    List<RecipeInstruction> findAll();
    Optional<RecipeInstruction> findById(String instructionsId);
}
