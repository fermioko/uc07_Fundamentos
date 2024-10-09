package a_declarar_atribuir;

public class DeclaracaoVariaveis {
    public static int varInt = 50;
    public static double varDouble = 8.5;
    public static float varFloat = 6.25F;
    public static boolean varBoolean = true;
    public static long varLong = 100_000_000L;

    public static void main(String[] args) {
        System.out.println("Valor int " + varInt);
        System.out.println("Valor double " + varDouble);
        System.out.println("Valor float " + varFloat);
        System.out.println("Valor boolean " + varBoolean);
        System.out.println("Valor long " + varLong);
    }
}
