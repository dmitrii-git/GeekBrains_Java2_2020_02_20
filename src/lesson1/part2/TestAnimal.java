package lesson1.part2;

public class TestAnimal {

    public static void main(String[] args) {
//        Animal animal = new Animal("оно");

        for (Color value : Color.values()) {
            System.out.println(value.getRussianColor());
        }

        Cat.CatAttribute catAttribute = new Cat.CatAttribute();
        Animal cat = new Cat("Бааааааарсик", Color.WHITE, catAttribute);
        Animal dog = new Dog("Dick", "black", "ovcharka");

        ((Cat) cat).getCatAttribute();
        System.out.println("instanceof: " + (cat instanceof Dog));


//        animal.animalInfo();
//
//        cat.catInfo();
//        cat.animalInfo();

//
//        dog.dogInfo();
        dog.animalInfo();
//        dog.jump();

//        infoAndJump(animal);
//        infoAndJump(cat);
//        infoAndJump(dog);
    }

    private static void infoAndJump(Animal animal) {
        animal.animalInfo();
        animal.jump();
        animal.voice();
        System.out.println();
    }
}
