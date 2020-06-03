package exam.DOPRA.fourteen;

import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Pattern;

/*
1、超级计算器
 */
public class SuperCalculator {
    static Pattern digitPattern = Pattern.compile("^[0-9\\\\.]$");
    static DecimalFormat df = new DecimalFormat("0.00");

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            //输入
            String str = sc.nextLine();
            if ("0".equals(str)) {
                break;
            }
            //处理
            Stack<Double> numbers = new Stack<>();
            Stack<Character> options = new Stack<>();
            char last = '\0';
            StringBuilder sb = new StringBuilder();

            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                //匹配数字的话，sb拼接
                if (digitPattern.matcher(ch + "").find()) {
                    sb.append(ch);
                } else if (isSym(ch)) {
                    //是操作符的话先把操作数入栈
                    if (sb.length() > 0) {
                        numbers.push(Double.valueOf(sb.toString()));
                        sb.setLength(0);
                    }
                    if (isAdd(ch) && ('(' == last || '\0' == last || isOpt(last))) {
                        sb.append(ch);
                    } else if (')' == ch) {
                        while (!options.isEmpty()) {
                            if (options.peek() == '(') {
                                options.pop();
                                break;
                            }
                            cal(numbers, options);
                        }
                    } else {
                        //如果当前操作数的等级比操作数栈中的等级低，先运算，再把当前字符放入操作数栈
                        if (!options.isEmpty() && isAdd(ch) && isMul(options.peek())) {
                            cal(numbers, options);
                        }
                        options.push(ch);
                    }
                }
                //每个字符处理完之后，吧最后字符更新
                last = ch;
            }
            //对最后一个数字的处理
            if (sb.length() > 0) {
                numbers.push(Double.valueOf(sb.toString()));
            }
            while (!options.isEmpty()) {
                cal(numbers, options);
            }
            System.out.println(df.format(numbers.pop()));
        }
    }

    //计算
    public static void cal(Stack<Double> numbers, Stack<Character> options) {
        double num1 = Double.valueOf(numbers.pop());
        if (numbers.isEmpty()) {
            numbers.push(num1);
            return;
        }
        double num2 = Double.valueOf(numbers.pop());
        switch (options.pop()) {
            case '+':
                numbers.push(num2 + num1);
                break;
            case '-':
                numbers.push(num2 - num1);
                break;
            case '*':
                numbers.push(num2 * num1);
                break;
            case '/':
                numbers.push(num2 / num1);
                break;
            case '(':
                options.push('(');
                break;
            default:
                break;
        }
    }

    //判断是字符
    public static boolean isSym(char ch) {
        return isOpt(ch) || ch == '(' || ch == ')';
    }

    //判断是字符
    public static boolean isOpt(char ch) {
        return isAdd(ch) || isMul(ch);
    }

    //判断是加减
    public static boolean isAdd(char ch) {
        return ch == '+' || ch == '-';
    }

    //判断是乘除
    public static boolean isMul(char ch) {
        return ch == '*' || ch == '/';
    }
}
