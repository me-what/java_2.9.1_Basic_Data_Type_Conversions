public class Main {
    public static void main(String[] args) {
        int a = 4;
        byte b = (byte)a;  // явное преобразование типов: от типа int к типу byte
        System.out.println(b); // 4
        System.out.println();

        byte b2 = 7;
        int d2 = b2;  // неявное преобразование от byte к int
        System.out.println(d2 + "\n"); // 7

        int a3 = 2147483647;
        float b3 = a3; // неявное преобразование от типа int к типу float
        System.out.println(b3+"\n");  // 2.14748365E9

        long a4 = 4;
        int b4 = (int) a4; // явное преобразование от типа long к типу int
        System.out.println(b4+"\n"); // 4

        int a5 = 5;
        byte b5 = (byte) a5;
        System.out.println(b5+"\n");      // 5

        int a6 = 258;
        byte b6 = (byte) a6;
        System.out.println(b6+"\n");      // 2

        double a7 = 56.9898;
        int b7 = (int)a7; // явное преобразование от типа double к типу int
        System.out.println(b7+"\n"); // 56

        double a8 = 56.9898;
        int b8 = (int)Math.round(a8);
        System.out.println(b8+"\n"); // 57

        int a9 = 3;
        double b9 = 4.6;
        double c9 = a9+b9; // преобразование к типу double
        System.out.println(c9+"\n"); // 7.6

        byte a10 = 3;
        short b10 = 4;
        byte c10 = (byte)(a10+b10); // преобразование к типу int
        System.out.println(c10 + "\n"); // 7

        int d = 'a' + 5; // преобразование в тип int
        System.out.println(d);  // 102
    }
}