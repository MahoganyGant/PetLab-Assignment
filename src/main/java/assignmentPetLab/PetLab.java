package assignmentPetLab;
import java.util.ArrayList; //refer back to saved youtube video for more practice
import java.util.Scanner;

/* REQUIREMENTS
You must support at least three types of pets.
Dog must be one of the types you support.
Cat must be one of the types you support.
The Pet class must have a speak method that each subclass overrides.
The Pet class must have a name field with setters and getters.
 */

// Base class Pet (superclass)
class Pet { //what are the necessary attributes each pet must have?
    private String name; //declaring the name variable for use, review getter and setter for use
    public Pet(String name) {
        this.name = name;
    }
    public String getName() { //gives access to the name
        return name;
    }
    public String speak() { //base method for sound
        return "...";
    }
}
// Dog subclass
class Dog extends Pet {
    public Dog(String name) {
        super(name);
    }
    @Override
    public String speak() { //establishing the sound for each pet
        return "Woof!";
    }
}
// Cat subclass
class Cat extends Pet {
    public Cat(String name) {
        super(name);
    }
    @Override
    public String speak() {
        return "Meow!";
    }
}
// Bird subclass
class Bird extends Pet {
    public Bird(String name) {
        super(name);
    }
    @Override
    public String speak() {
        return "Chirp!";
    }
}
public class PetLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user how many pets they have
        System.out.print("How many pets do you have? ");
        int numberOfPets = scanner.nextInt(); //scanning for a number only so that I have a set amount to ask the questions later

        // List to hold Pet objects
        ArrayList<Pet> pets = new ArrayList<>(); //method to store the list of pets in an array <Pet> is the data type keep in
        //mind when using this again

        // Gather information about each pet
        for (int i = 0; i < numberOfPets; i++) { //will repeat until the number matches the number of pets given
            System.out.print("What kind of pet is pet #" + (i + 1) + " (dog/cat/bird)? ");
            // ^limits the type of pets they can say they have
            String petType = scanner.nextLine();

            System.out.print("What is the name of pet #" + (i + 1) + "? ");
            String petName = scanner.nextLine();

            // Create the correct type of pet
            if (petType.equals("dog")) {
                pets.add(new Dog(petName)); //adding pet to the array list
            } else if (petType.equals("cat")) {
                pets.add(new Cat(petName));
            } else if (petType.equals("bird")) {
                pets.add(new Bird(petName));
            } else {
                System.out.println("Unknown pet type.");
                pets.add(new Pet(petName));
            }
        }

        // how do I Print out the list of pets and what they say?
        System.out.println("\nThese are your Pets!:");
        for (Pet pet : pets) { // for each pet in the pets array do the following
            System.out.println(pet.getName() + " says: " + pet.speak());
        }
        scanner.close();
    }
}


