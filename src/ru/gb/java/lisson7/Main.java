package ru.gb.java.lisson7;

public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[3];
        cats[0] = new Cat("Мурчик", 5);
        cats[1] = new Cat("Мурзик", 7);
        cats[2] = new Cat("Милаша", 10);
        Plate plate = new Plate(20);
        for (int cat = 0; cat < cats.length; cat++) {
            cats[cat].eat(plate);
        }
        appendFoodTo(plate, 50);
        for (int cat = 0; cat < cats.length; cat++) {
            cats[cat].eat(plate);
        }
    }
    static void appendFoodTo(Plate plate, int food) {
        plate.increaseFood(food);
    }
}
