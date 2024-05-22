public class Dog extends Animal {
  public String breed;

  public Dog(String breed, String name, int age) {
    super(name, age);
    this.breed = breed;
  }

  
  public void bark() {
    System.out.println("Barking");
  }
}
