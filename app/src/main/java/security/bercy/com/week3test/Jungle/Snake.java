package security.bercy.com.week3test.Jungle;

/**
 * Created by Bercy on 12/15/17.
 */

public class Snake implements Animals {
    int energy = 0;


    @Override
    public void makeSound() {
        energy=-3;
        System.out.println(energy);
    }

    @Override
    public void eatFood(String[] food) {
        energy+=5;
    }

    @Override
    public void sleep() {
        energy+=10;
    }
}
