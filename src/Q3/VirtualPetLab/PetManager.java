package Q3.VirtualPetLab;
import java.util.ArrayList;

public class PetManager {
    private ArrayList<Pet> pets = new ArrayList<>();

    // TODO: Implement methods as needed to interact with the pets list
    public void addPet(Pet pet) {
        pets.add(pet);
    }

    public void removePet(Pet pet) {
        pets.remove(pet);
    }

    public ArrayList<Pet> getPets() {
        return pets;
    }

}
