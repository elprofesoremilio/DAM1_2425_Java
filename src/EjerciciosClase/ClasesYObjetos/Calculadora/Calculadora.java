package EjerciciosClase.ClasesYObjetos.Calculadora;

public class Calculadora {
    private float operando1;
    private float operando2;

    public Calculadora(float operando1, float operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    public float sumar() {
        return operando1+operando2;
    }
    public float restar() {
        return operando1-operando2;
    }
    public float multiplicar() {
        return operando1*operando2;
    }
    public float dividir() {
        if (operando2==0) {
            return -1;
        }
        return operando1/operando2;
    }
}
