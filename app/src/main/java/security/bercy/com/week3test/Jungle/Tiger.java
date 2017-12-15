package security.bercy.com.week3test.Jungle;

/**
 * Created by Bercy on 12/15/17.
 */

public class Tiger extends Jungle implements Animals{
    int energy = 0;


    @Override
    public void makeSound() {
        energy-=3;
        System.out.println(energy);
    }

    @Override
    public void eatFood(String[] food) {
        for (int i = 0; i < food.length; i++) {
            if(food[i].equals("grain")) {
                System.out.println("Tigers can't eat grain because they have sensitive digestive systems.");
                return;
            }
        }

        energy =+ 5;
    }

    @Override
    public void sleep() {
        energy =+ 5;
    }
}
