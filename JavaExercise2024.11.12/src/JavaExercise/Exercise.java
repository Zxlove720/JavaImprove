package JavaExercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        try {
//            System.out.println("请输入被除数");
//            int number1 = sc.nextInt();
//            System.out.println("请输入除数");
//            int number2 = sc.nextInt();
//            System.out.println(number1 / number2);
//        } catch (InputMismatchException e) {
//            System.err.println("输入错误");
//        } catch (ArithmeticException e) {
//            System.err.println("除数不能为0");
//        } catch (Exception e) {
//            System.err.println("其他未知错误");
//        } finally {
//            System.out.println("感谢使用");
//        }
//        int number1 = 0;
//        int number2 = 0;
//        System.out.println("请输入被除数");
//        if (sc.hasNextInt()) {
//            number1 = sc.nextInt();
//        } else {
//            System.out.println("输入非整数，请重新输入");
//            System.exit(1);
//        }
//        System.out.println("请输入除数");
//        if (sc.hasNextInt()) {
//            number2 = sc.nextInt();
//            if (number2 == 0) {
//                System.out.println("除数不能为0");
//                System.exit(1);
//            }
//        } else {
//            System.out.println("输入非整数，请重新输入");
//            System.exit(1);
//        }
//        System.out.println(number1 / number2);
        System.out.println("请输入1-3的任意数字");
        int choice = sc.nextInt();
        try {
            switch (choice) {
                case 1 -> System.out.println("课程1");
                case 2 -> System.out.println("课程2");
                case 3 -> System.out.println("课程3");
                default -> {
                    throw new Exception("输入错误");
                }
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            System.out.println("欢迎提出建议");
        }

    }
}
