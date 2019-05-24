package season_5.Animal_InterfaceEdible.animal;

import season_5.Animal_InterfaceEdible.edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound(){
        return "Im a chicken";
    }
    @Override
    public String howtoEat(){
        return "I can eat";
    }
}
