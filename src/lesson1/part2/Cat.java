package lesson1.part2;

import lesson1.part1.Document;

public class Cat extends Animal {

    private Color color = Color.RED;
    private CatAttribute catAttribute;


    public static class CatAttribute {
        private String meal;
        private int weight;
        private Color colorEyes;
    }


    public Cat(String name, Color color, CatAttribute catAttribute) {
        super(name);
        this.catAttribute = catAttribute;
        this.color = color;
    }

    @Override
    public void animalInfo() {
        super.animalInfo();
        System.out.println("Cat name is " + super.getName() + "; color - " + color);
    }

    @Override
    public void voice() {
        System.out.println("Мяу!");
    }

    public CatAttribute getCatAttribute() {
        return catAttribute;
    }
}
