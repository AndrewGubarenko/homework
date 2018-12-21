package hillel.jee.pets;

import hillel.jee.food.Food;
import org.springframework.stereotype.Component;

import java.util.Objects;

@Component
public abstract class Pet {
    private String name;
    private Species species;
    private String type;
    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Species getSpecies() {
        return species;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String feed(Food food) {
        if(food.getFoodFor().equals(this.getSpecies())) {
            return "OM-NOM-NOM";
        } else {
            return "This kind of ood is not suitable for " + this.getClass().getSimpleName();
        }
    }

    public abstract void voice();

    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", species=" + species +
                ", type='" + type + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pet)) return false;
        Pet pet = (Pet) o;
        return Objects.equals(getName(), pet.getName()) &&
                getSpecies() == pet.getSpecies() &&
                getType().equals(pet.getType()) &&
                getColor().equals(pet.getColor());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getSpecies(), getType(), getColor());
    }
}
