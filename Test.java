import java.util.Scanner;

public class Test {
    /*public static void main(String[] args) {
        ((TestClass) null).testMethod();
    }
    private static void testMethod() {
        System.out.println("testMethod");
    }*/

    String str = new String("hello");
    char[] ch = {'a', 'b'};

    public static void main2(String[] args) {
        Test test = new Test();
        test.change(test.str, test.ch);
        System.out.print(test.str + " and " + test.ch);
        //System.out.print(test.ch);// hello and cb
    }

    private void change(String str, char[] ch) {
        str = "test ok";
        ch[0] = 'c';
    }

    public static void main3(String[] args) {
        int i = 0;
        Integer j = new Integer(0);
        System.out.println(i == j); // true
        System.out.println(j.equals(i)); // true
    }

    public static void main4(String[] args) {
        Employee e = new Employee("123");
        System.out.println(e.empID); // 123
    }

    public static void main(String[] args) {
        String x = "xz";
        x.toUpperCase(); // "xz"
        // String x = "xz".toUpperCase();  "XZ"

        // toUpperCase(); 将所有在此字符 String 使用默认语言环境的规则大写.
        // toLowerCase(); 将所有在此字符 String使用默认语言环境的规则小写.

        String y = x.replace('x', 'X');
        // 返回从替换所有出现的导致一个字符串 oldChar 在此字符串 newChar
        y = y + "kxy";
        System.out.println(y); // Xzkxy
    }
}

class Person {
    String name = "xz";
    public Person(String nm) {
        name = nm;
    }
}
class Employee extends Person {
    String empID = "0000";
    public Employee(String nm) {
        super(nm);
        empID = name;
    }
}

class Exersice {
    // N 的阶乘(N!)中的末尾有多少个 0
    // 例如: N = 5, N! = 120.末尾有 1 个  0.

    // 方法一: 直接求解, 但是 n 超过 13 会发生栈溢出(不可取)
    public static void main1(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int ret = fac(num);
        System.out.println(ret);
        int count = 0;
        while (ret != 0) {
            // 计算 ret 末尾 0 的个数
            int sub = ret % 10;
            ret = ret / 10;
            if (sub != 0) {
                System.out.println(count);
                break;
            }
            count++;
        }
    }
    private static int fac(int num) {
        // 求阶乘
        int sum = 1;
        sum = num * fac(num - 1);
        return sum;
    }

    // 方法二: 末尾的 0 的个数由 2 * 5 的组合个数决定
    //  因此, 只要确定质因数中 5 的个数即可(质因数 2 的个数一定比 5 多)
    public static void main2(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int count = 0;
        while (num != 0) {
            // 5 的个数 = N/5 + N /(5*5) + N/(5*5*5)….
            // N/(5的K次方): N/5 表示不大于 N 的数中能被 5 整除的数贡献一个 5
            // N/(5*5) 表示不大于 N 的数中能被 25 整除的数再多出一个5 ……

            count += num / 5;
            num = num / 5;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        // 输入一个整数，将这个整数以字符串的形式逆序输出.
        // 程序不考虑负数的情况，若数字含有 0，则逆序形式也含有 0,
        // 如输入为 100，则输出为 001

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int ret = 0;
        while (num != 0) {
            ret = num % 10;
            System.out.println(ret);
            num = num / 10;

            if (num < 10) {
                System.out.print(num);
                break;
            }
        }
    }
}
