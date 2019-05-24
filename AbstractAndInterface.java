package season_5.Animal_InterfaceEdible;

import season_5.Animal_InterfaceEdible.animal.Animal;
import season_5.Animal_InterfaceEdible.animal.Chicken;
import season_5.Animal_InterfaceEdible.animal.Tiger;
import season_5.Animal_InterfaceEdible.fruit.Fruit;
import season_5.Animal_InterfaceEdible.fruit.Apple;
import season_5.Animal_InterfaceEdible.fruit.Orange;
public class AbstractAndInterface {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Chicken();
        animals[1] = new Tiger();
        for(Animal animal: animals){
            System.out.println(animal.makeSound());;
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howtoEat());
        }
    }
}
