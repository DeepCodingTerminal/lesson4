package guru.qa;

public class FirstClass {

    public static void main(String[] args) {

        //все переменные
        int a1 = 10;
        int a2 = 5;
        byte b1 = 126;
        byte b2 = 3;
        short c1 = 25;
        short c2 = 7;
        long d1 = 100;
        long d2 = 11;
        float e1 = 11.2f;
        float e2 = 5.3f;
        double f1 = 71;
        double f2 = 22;
        boolean g1 = a1 + d2 > d1;
        boolean g2 = f1 - e2 > a2;

        //вывод и действия с перемеными
        System.out.println("Вывод переменной int");
        System.out.println(a1 - a2);
        System.out.println();
        System.out.println("Вывод переменной byte");
        System.out.println(b1 + b2);
        System.out.println();
        System.out.println("Вывод переменной short");
        System.out.println(c1 / c2);
        System.out.println();
        System.out.println("Вывод переменной long");
        System.out.println(d1 + d2);
        System.out.println();
        System.out.println("Вывод переменной float");
        System.out.println(e1 + e2);
        System.out.println();
        System.out.println("Вывод переменной double");
        System.out.println(f1 + f2);
        System.out.println();
        System.out.println("Вывод переменной boolean");
        System.out.println(g1);
        System.out.println(g2);
        System.out.println();
        System.out.println("Вывод int + long");
        System.out.println(a1 + d2);

        // b2 = b2 + 150; Переполнение типа byte
        // a1 = a1 - 220000000000; Переполнение типа int

    }

}
