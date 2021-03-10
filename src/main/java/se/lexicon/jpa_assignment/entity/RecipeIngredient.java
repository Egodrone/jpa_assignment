package se.lexicon.jpa_assignment.entity;


import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;


@Entity
public class RecipeIngredient {
    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
    //name here, same as UUID or it is not important
    @Column(name = "recipeIngredientId", updatable = false, nullable = false)
    private UUID recipeIngredientId;


    //b. Contains a reference to Ingredient. (Id reference to ingredient above???)
    @ManyToOne(fetch = FetchType.EAGER,
            cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH}
            )
    @JoinColumn(name="ingredient_ingredien_id")
    private Ingredient ingredient;
    //private List<Ingredient> ingredientList;
    //think changing to Collection here but in the assignment it says Ingredient

    private double amount;

    private Measurement measurement;

    @ManyToOne(fetch = FetchType.EAGER,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "recipe_recipe_id")
    private Recipe recipe;


    public RecipeIngredient() {
    }

    public RecipeIngredient(UUID recipeIngredientId, Ingredient ingredient, double amount, Measurement measurement, Recipe recipe) {
        this.recipeIngredientId = recipeIngredientId;
        this.ingredient = ingredient;
        this.amount = amount;
        this.measurement = measurement;
        this.recipe = recipe;
    }

    public RecipeIngredient(Ingredient ingredient, double amount, Measurement measurement, Recipe recipe) {
        this.recipeIngredientId = recipeIngredientId;
        this.ingredient = ingredient;
        this.amount = amount;
        this.measurement = measurement;
        this.recipe = recipe;
    }

    public UUID getRecipeIngredientId() {
        return recipeIngredientId;
    }

    public void setRecipeIngredientId(UUID recipeIngredientId) {
        this.recipeIngredientId = recipeIngredientId;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Measurement getMeasurement() {
        return measurement;
    }

    public void setMeasurement(Measurement measurement) {
        this.measurement = measurement;
    }

    public Recipe getRecipe() {
        return recipe;
    }

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecipeIngredient that = (RecipeIngredient) o;
        return Double.compare(that.amount, amount) == 0 && Objects.equals(recipeIngredientId, that.recipeIngredientId) && Objects.equals(ingredient, that.ingredient) && measurement == that.measurement && Objects.equals(recipe, that.recipe);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recipeIngredientId, ingredient, amount, measurement, recipe);
    }

    @Override
    public String toString() {
        return "RecipeIngredient{" +
                "recipeIngredientId=" + recipeIngredientId +
                ", ingredient=" + ingredient +
                ", amount=" + amount +
                ", measurement=" + measurement +
                ", recipe=" + recipe +
                '}';
    }

}
