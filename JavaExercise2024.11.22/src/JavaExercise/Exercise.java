package JavaExercise;

import java.time.LocalDate;
import java.util.Random;

public class Exercise {
    public static void main(String[] args) {
        String time = LocalDate.now().toString();
        String[] split = time.split("-");
        StringBuilder temp = new StringBuilder("[");
        int length = split.length;
        for (int i = 0; i < length; i++) {
            temp.append(split[i]);
            if (i == 0) {
                temp.append("-");
            }
        }
        temp.append("]");
        String result = temp.toString();
        System.out.println(result);

        Random r = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(r.nextInt(15,26));
        }

        for (int i = 0; i < 100; i++) {
            System.out.println(r.nextInt(100) + 1);
        }

        StringBuffer stringBuffer = new StringBuffer();
    }
}
