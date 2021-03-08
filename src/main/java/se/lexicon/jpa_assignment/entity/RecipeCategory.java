package se.lexicon.jpa_assignment.entity;


import javax.persistence.*;
import java.util.List;


@Entity
public class RecipeCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int categoryId;

    @Column(nullable = false, length = 50)
    private String category;

    @OneToMany(mappedBy = "recipe")
    private List<Recipe> recipes;
}
