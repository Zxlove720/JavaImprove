package arithmeticExercise;

import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
//        给定一个只包含0-9、'-'、'*'的合法数学表达式(长度<1000)，规定减号'_'的优先级高于乘号'*’，请输出计算结果。
//        输入说明:合法的数学表达式(其中的数没有负数)输出说明:输出表达式的计算结果 输入样例:12*3-12*2 输出样例:-216

        Scanner sc = new Scanner(System.in);
//        String str = sc.nextLine();
//        int result = solution(str);
//        System.out.println(result);

//        某星球存在两种生物，A种生物有1个头6条腿，B种生物有3个头4条腿。来自地球的太空船刚刚在该星球降落，
//        突然发现一大群这两种生物组成的队伍，由于时间紧，只数了头的数量和腿的数量，请帮助宇航员分析A、B两种生物各有多少个。
//        输入说明:头的数量L 腿的数量Z，(L，Z<=100000); 输出说明:A生物的数量 B生物的数量(两个整数用一个空格隔开);输入样例:10 32输出样例:4 2
//        String input = sc.nextLine();
//        String[] split = input.split(" ");
//        int head = Integer.parseInt(split[0]);
//        int leg = Integer.parseInt(split[1]);
//        String result = finds(head, leg);
//        System.out.println(result);

//        某药店为了回馈顾客，拿出7个品牌的口罩做特价限购活动:A品牌是3个装2元，B品牌是3个装3元，C品牌是4个装2元，D品牌是5个装3元，
//        E品牌是4个装5元，F品牌是1个装2元，G品牌是2个装2元，每个品牌只能买一包。小涵拿N元钱去药店买特价口罩，小涵最多能买多少个口罩?

        // 这道题需要数据处理
        // 计算出每个品牌的单价，然后从单价低的品牌开始依次购买即可



    }

    public static int solution(String str) {
        int result = 0;
        int tempResult;
        String[] split1 = str.split("\\*");
        for (String s : split1) {
            tempResult = 0;
            String[] split2 = s.split("-");
            if (split2.length == 1) {
                tempResult = Integer.parseInt(split2[0]);
            } else {
                for (int i = 0; i < split2.length; i++) {
                    if (i == 0) {
                        tempResult = Integer.parseInt(split2[i]);
                        continue;
                    }
                    tempResult -= Integer.parseInt(split2[i]);
                }
            }
            if (result == 0) {
                result = tempResult;
            } else {
                result *= tempResult;
            }
        }
        return result;
    }

    // A种生物有1个头6条腿，B种生物有3个头4条腿
    public static String finds(int head, int leg) {
        // 暴力，假设全部是A
        int a = 0;
        int b = 0;
        for (int i = head; i >= 0; i-=3) {
            a = i;
            b = (head - a) / 3;
            if ((a * 6  + b * 4) == leg) {
                break;
            }
        }

        return a + " " + b;

    }


}
