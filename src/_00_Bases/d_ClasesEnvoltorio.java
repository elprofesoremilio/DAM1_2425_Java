package _00_Bases;

public class d_ClasesEnvoltorio {
    public static void main(String[] args) {

        Integer enteroObjeto = null; // None en Python
        int entero = Integer.MAX_VALUE;
        // no puedo hacer esto:
        // int entero = null;

        String s = "123";
        s = "hola" + 1;
        enteroObjeto = Integer.valueOf(s);
        // escribe enteroObjeto y un . para ver los métodos disponibles

        System.out.println(entero + "\n" + enteroObjeto);
        enteroObjeto = entero;

        short enteroCorto = 1;
        Short enteroCortoObjeto = 1;

        byte b;
        Byte bO;

        long l;
        Long lO;

        float f;
        Float fO;

        double d;
        Double dO;

        char c = 'b';
        Character cO = 'B';
        c = Character.toUpperCase(c);

        boolean logico;
        Boolean logicoO;

    }
}
