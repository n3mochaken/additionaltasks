// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        }
    public static void task1 (){
        int a=12,b=27,c=44,d=15,e=9;
        int result=a*(b+(c-(d*e)));
        System.out.println(result);
        result = result * -1;
        System.out.println(result);
        result = result * -1;
        System.out.println(result);
    }
    public static void task2() {
        int a=5, b=7;
        a = a*b;
        b = a/b;
        a = a/b;
        System.out.println(a);
        System.out.println(b);
    }
    public static void task3(){
        int a = 764, b;
        a = (a/10)%10;
        b = a;
        System.out.println(b);
    }

    }
