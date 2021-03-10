package se.lexicon.jpa_assignment.entity;


import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;


@Entity
public class RecipeInstruction {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    @Column(name = "instructionsId", updatable = false, nullable = false)
    private UUID instructionsId;

    @Column(nullable = false, length = 250)
    private String instructions;

    //not necessary
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "recipe_recipe_id")
    private Recipe recipe;


    public RecipeInstruction() {
    }

    public RecipeInstruction(UUID instructionsId, String instructions) {
        this.instructionsId = instructionsId;
        this.instructions = instructions;
    }

    public UUID getInstructionsId() {
        return instructionsId;
    }

    public void setInstructionsId(UUID instructionsId) {
        this.instructionsId = instructionsId;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecipeInstruction that = (RecipeInstruction) o;
        return Objects.equals(instructionsId, that.instructionsId) && Objects.equals(instructions, that.instructions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(instructionsId, instructions);
    }

    @Override
    public String toString() {
        return "RecipeInstruction{" +
                "instructionsId=" + instructionsId +
                ", instructions='" + instructions + '\'' +
                '}';
    }

}
