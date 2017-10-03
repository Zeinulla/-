package kz.kaznuti.lessons;

public class hello {
    public static void main(String[] args){
        System.out.println("Hello World!");
        System.out.println("Бул зертханалык жумыстын максаты:");
        System.out.println("GitHub-пен жумыс масаап уйрену.");

        int a = MyMath.kvadrat(5);
        int b = MyMath.kub(5);

        System.out.println("a = "+a);
        System.out.println("b = "+b);

        System.out.println(MyMath.max3(8,9,12));

        System.out.println(MyMath.isEven(12));
        System.out.println(MyMath.isEven(7));
    }
}
