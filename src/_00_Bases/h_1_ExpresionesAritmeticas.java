package _00_Bases;

public class h_1_ExpresionesAritmeticas {
    public static void main(String[] args) {
        int op1=1, op2=3, resultado;

        resultado = op1 + op2;
        resultado = resultado - op2;
        resultado = op1 / resultado; // No existe // división entera
        resultado = resultado * op2;
        resultado = op1 % resultado;

        // Para calcular una potencia debo llamar un método
        int potencia = (int) Math.pow(2,3);
        // Las operaciones aritméticas se convierten siempre al tipo que más memoria ocupa
        // Por eso tengo que convertir a (int), si lo quito dará error porque el resultado es double
        int divisionEntera = (int) (3 + 2.0);

        // Operadores simplificados += *= -= /= %=
        resultado += 3;
        resultado *= 2;
        resultado /= resultado;
        resultado -= 1;

        // Operadores unarios --> + - ++ --
        resultado = +20 + -2;
        resultado++;  // suma 1 a resultado --> operador de incremento
        resultado--;  // resta 1 a resultado --> operador de decremento

        // Operador incremento/decremento a la izquierda primero se ejecuta él y después lo demás
        // A la derecha, primero lo demás y después él
        System.out.println(resultado);
        int gracieta = resultado++ - 12;
        System.out.println(resultado);
        System.out.println(gracieta);

        int pocaGracia = --resultado;

        double potenciaMasCalculo = 25 - 12 + Math.pow(3,2);









    }
}
