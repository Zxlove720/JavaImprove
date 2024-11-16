package Exercise;

import java.util.Scanner;
import java.util.Stack;

public class Exercise {
    public static void main(String[] args) {
        /*
        给定一个只包含 0 - 9、'+'、'' 的合法数学表达式（长度 < 1000），规定加号 '+' 的优先级高于乘号''。请输出计算结果。
        输入说明：合法的数学表达式。输出说明：输出表达式的计算结果。输入样例：12*3+12*2。输出样例：360。
         */
//        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        String[] split = str.split("\\*");
//        long sum = 1;
//        for (String s : split) {
//            try {
//                sum = sum * Integer.parseInt(s);
//            } catch (Exception e) {
//                String[] temp = s.split("\\+");
//                sum = sum * (Integer.parseInt(temp[0]) + Integer.parseInt(temp[1]));
//            }
//        }
//        System.out.println(sum);

//        Scanner sc = new Scanner(System.in);
//        String expression = sc.nextLine();
//        int result = getResult(expression);
//        System.out.println(result);

//        从大于等于N的正整数里找到一个最小的数M，使之满足:M和M的逆序数(如1230的逆序数为321)的和为一个[100000,200000]区间内的值。
//        输入说明:起始数字N:输出说明:找到的第一个符合条件的数，如果没有符合条件的数，输出F。输入样例:123456输出样例:123460
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        boolean flag = true;
        for (int i = number; i <= 200000; i++) {
            int reNumber = getReNumber(i);
            if (number + reNumber <= 200000 && number + reNumber >= 100000) {
                System.out.println(i);
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("F");
        }

    }

    private static int getResult(String expression) {
        // 主要思路：按照“*”分割后，若原表达式是“*”连接的，就变成了单个数字；原表达式是“+”连接的，就变成了一个加法表达式的子串
        // 对分割的子串进行遍历：先处理加法，每次遍历的addResult初始化为0
        // 再对其按照“+”，再次分割成若干子串，遍历二次分割的子串，addResult累加
        // 若本来的子串是单个数字，那么不影响（只会分割为1个子串）
        // 若本来的子串的加法表达式，那么就是一个连加，相当于将原表达式中的“+”全部处理了
        // 加法处理完后，将result和每次循环的addResult的结果累乘即可

        int result = 0; // 这是最终的结果
        int addResult; // 这是用来处理 + 的变量
        // 先根据“*”对表达式进行分割，这一步是为了去除“*”，假如说表达式中有“+”，那么会留下“x + y”这种子串
        String[] str = expression.split("\\*");
        for (String s : str) {
            // 遍历表达式中的“数字”
            // 每一次遍历的加法和都是0
            addResult = 0;
            // 再用“+”进行分割，确保是单个的数字；这一步就是为了处理类似“x + y”的子串，将其完全拆分为数字
            String[] split = s.split("\\+");
            for (String number : split) {
                // 若第一次按照“*”分割的子串是单个数字，addResult就是那个数字
                // 若第一次按照“*”分割的子串是一个加法表达式，那么addResult是那个加法表达式按照“+”分割的数字的和
                addResult += Integer.parseInt(number);
            }

            // 现在加法已经处理完成，直接将每次得到的addResult和result累乘即可
            // 当Result == 0，那么就是首次处理，这个if只会进入一次，就是为了给result
            if (result == 0) {
                result = addResult;
            } else {
                // 加法已经在上面按照“*”分割后处理完毕了，直接将result * addResult即可
                result *= addResult;
            }
        }
        return result;
    }

    public static int getReNumber(int i) {
        String s = "";
        while (i > 0) {
            s = s + (i % 10);
            i /= 10;
        }
        int j = 0;
        while(j < s.length() && s.charAt(j)=='0') {
            j++;
        }
        s = s.substring(j);
        return Integer.parseInt(s);
    }
}

