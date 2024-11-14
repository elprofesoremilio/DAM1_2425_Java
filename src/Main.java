//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    // def main(args):
    //      resultado = args*2
    //      return resultado

    // visibilidad modificadores claseDevuelta nombreMetodo(claseParametro1 nombreParametro1, .... ) {
    // visibilidad es opcional
    // modificadores (static final) son opcionales
    // número de parámetros entre 0 y los que se necesiten
    // si quiero poner 0 parámetros, simplemente abro y cierro paréntesis ()
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        // print("Hello and w")
        System.out.println("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}