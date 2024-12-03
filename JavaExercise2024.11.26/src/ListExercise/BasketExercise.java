package ListExercise;

import pojo.Basket;
import pojo.Egg;

import java.util.Collections;

public class BasketExercise {
    public static void main(String[] args) {
        Basket<Egg> eggBasket = new Basket<>(20);
        for (int i = 0; i < 5; i++) {
            eggBasket.add(new Egg());
        }
        System.out.println(eggBasket);
        add(1,2,3,4,5,6,7,8,9,10);

    }

    public static <T> void add(T ...element) {
        for (T i : element) {
            System.out.print(i + " ");
        }
    }
}
