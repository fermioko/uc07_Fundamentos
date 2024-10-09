package b_boxing_unboxing;

public class BoxingUnboxing {

//    int,  double,  float, boolean, long

    public static void main(String[] args) {
        int valorInt = 30;   // Primitivo
        //Boxing
        Integer valorInteger = Integer.valueOf(valorInt);

        double valorDoublePri = 50.2;
        // Double valorDoubleWra = Double.valueOf(valorDoublePri);
        Double valorDoubleWra = Double.valueOf("800.25");
        double doubleUnbox = valorDoubleWra.doubleValue();

        float valorFloatPri = 15.3F;
        Float valorFloatWra = Float.valueOf(valorFloatPri);

        boolean valorBooleanPri = true;
        Boolean valorBooleanWra = Boolean.valueOf(valorBooleanPri);

        long valorLongPri = 100_200_300L;
        Long valorLongWra = Long.valueOf(valorLongPri);

        System.out.println("Valor primitivo int = " + valorInt +
                "\n" +"Valor wrapper Integer = " + valorInteger + "\n");
        System.out.println("Valor primitivo double = " + valorDoublePri +
                "\n" +"Valor wrapper Double = " + valorDoubleWra +
                "\n" +"Valor wrapper = " + doubleUnbox + "\n");
        System.out.println("Valor primitivo float = " + valorFloatPri +
                "\n" +"Valor wrapper Float = " + valorFloatWra + "\n");
        System.out.println("Valor primitivo boolean = " + valorBooleanPri+
                "\n" +"Valor wrapper Boolean = " + valorBooleanWra + "\n");
        System.out.println("Valor primitivo long = " + valorLongPri+
                "\n" +"Valor wrapper Long = " + valorLongWra + "\n");

    }
}

