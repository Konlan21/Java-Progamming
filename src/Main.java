
public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Horse", 5);
        Dog dog = new Dog("Golden retriever",  "Milpert", 2);
        showAnimal(dog);

}

    public static void showAnimal(Animal animal) {
        if(animal instanceof Dog){
            Dog dog = (Dog)animal;
            dog.giveBirth();
        }
    }

}
