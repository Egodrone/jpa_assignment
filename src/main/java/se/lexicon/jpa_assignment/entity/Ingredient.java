package se.lexicon.jpa_assignment.entity;


import javax.persistence.*;
import java.util.Objects;


@Entity
public class Ingredient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ingredientId;

    @Column(nullable = false, length = 50, unique = true)
    private String ingredientName;

    @ManyToOne(fetch = FetchType.EAGER,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "recipe_ingredient_id")
    private RecipeIngredient recipeIngredient;


    public Ingredient() {
    }

    public Ingredient(int ingredientId, String ingredientName) {
        this.ingredientId = ingredientId;
        this.ingredientName = ingredientName;
    }

    public int getIngredientId() {
        return ingredientId;
    }

    public void setIngredientId(int ingredientId) {
        this.ingredientId = ingredientId;
    }

    public String getIngredientName() {
        return ingredientName;
    }

    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }

    public RecipeIngredient getRecipeIngredient() {
        return recipeIngredient;
    }

    public void setRecipeIngredient(RecipeIngredient recipeIngredient) {
        this.recipeIngredient = recipeIngredient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ingredient that = (Ingredient) o;
        return ingredientId == that.ingredientId && Objects.equals(ingredientName, that.ingredientName) && Objects.equals(recipeIngredient, that.recipeIngredient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ingredientId, ingredientName, recipeIngredient);
    }

    @Override
    public String toString() {
        return "Ingredient{" +
                "ingredientId=" + ingredientId +
                ", ingredientName='" + ingredientName + '\'' +
                ", recipeIngredient=" + recipeIngredient +
                '}';
    }

}
