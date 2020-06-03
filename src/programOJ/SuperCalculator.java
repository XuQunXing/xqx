package programOJ;
/*
40.超级计算器
 */
import javax.xml.crypto.dom.DOMCryptoContext;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Stack;
import java.util.regex.Pattern;

public class SuperCalculator {
    static Pattern digitPattern=Pattern.compile("^[0-9\\\\.]$");
    static DecimalFormat df=new DecimalFormat("0.00");
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str=sc.nextLine();
            if ("0".equals(str)) {
                break;
            }
            //处理  参考别人
            //中缀表达式转化为逆波兰表达式   维护两个栈：操作数栈和操作符栈。操作数直接入栈，操作符入的时候先判断栈是否为空或者栈顶元素是否为（，是的话直接压入，
            // 否则判断当前操作符和栈顶操作符优先级，大于等于直接压入栈，，否则取出放入操作数栈。
            //遇到括号，（，直接入栈。）一次将操作符栈顶元素去除压入操作数栈，直到（
            StringBuilder sb=new StringBuilder();
            Stack<Double> numbers=new Stack<>();
            Stack<Character> options=new Stack<>();
            char lastChar='\0';
            for (int i = 0; i < str.length(); i++) {
                char ch=str.charAt(i);
                //数字的话直接放
                if (isNum(ch)) {
                    //数字字符串拼接
                    sb.append(ch);
                } else if (isSymbol(ch)){
                    //将得到的数字放入到数字栈中
                    if (sb.length() > 0) {
                        numbers.push(Double.valueOf(sb.toString()));
                        sb.setLength(0);
                    }
                    //如果是+-号，判断处理
                    if (isLowOperator(ch) && ('(' == lastChar || '\0' == lastChar || isOperator(lastChar))) {
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
                        //如果上一个符号不为空，且是*/，先运算
                        if (!options.isEmpty() && isLowOperator(ch) && isHighOperator(options.peek())) {
                            cal(numbers,options);
                        }
                        options.push(ch);
                    }
                }
                lastChar=ch;
            }
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
                numbers.push(num2+num1);break;
            case '-':
                numbers.push(num2-num1);break;
            case '*':
                numbers.push(num2*num1);break;
            case '/':
                numbers.push(num2/num1);break;
            case '(':
                options.push('(');break;
            default:
                break;
        }
    }

    //判断是否是符号
    public static boolean isSymbol(char ch) {
        return isOperator(ch)||ch=='('||ch==')';
    }

    //判断是否是操作符
    public static boolean isOperator(char ch) {
        return isHighOperator(ch)||isLowOperator(ch);
    }

    //判断是否是乘除。高级操作符
    public static boolean isHighOperator(char ch) {
        return ch=='*'||ch=='/';
    }

    //判断是否是加减。低级操作符
    public static boolean isLowOperator(char ch) {
        return ch=='+'||ch=='-';
    }

    //判断是否是数字
    public static boolean isNum(char ch) {
        return digitPattern.matcher(ch+"").find();
    }
}
