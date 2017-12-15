package security.bercy.com.week3test.Jungle;

/**
 * Created by Bercy on 12/15/17.
 */

public class Monkey implements Animals{

    int energy = 0;


    @Override
    public void makeSound() {
        energy=-4;
        System.out.println(energy);
    }

    @Override
    public void eatFood(String[] food) {
        energy =+ 2;
    }

    @Override
    public void sleep() {
        energy+=10;
    }
    public void play() {
        if(energy>= 8) {
            System.out.println("Oooo Oooo Oooo");
        }else {
            System.out.println("Monkey is too tired");
        }
    }
}
