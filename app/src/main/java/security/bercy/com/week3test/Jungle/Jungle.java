package security.bercy.com.week3test.Jungle;

/**
 * Created by Bercy on 12/15/17.
 */

public class Jungle {

    Tiger tiger = new Tiger();
    Monkey monkey = new Monkey();
    Snake snake = new Snake();

    String[] foods = {"meat","fish","bugs","Grain"};

    public void eat() {
        tiger.eatFood(foods);
    }

    public void invoke() {
        tiger.makeSound();
        monkey.makeSound();
        snake.makeSound();
    }

}
