package arithmeticExercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        String input = sc.nextLine();
        String[] split = input.split(" ");
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(split[i]);
        }
        Map<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            map.put(array[i], true);
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    map.put(array[i], false);
                    break;
                }
            }
        }
        String result = "";
        for (int i = 0; i < array.length; i++) {
            if (map.get(array[i])) {
                result = result + array[i];
                if (i != array.length - 1) {
                    result = result + " -> ";
                }
            }
        }
        if (result.isEmpty()) {
            System.out.println("NULL");
        } else {
            System.out.println(result);
        }
	}
}