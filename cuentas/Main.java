package cuentas;

/**
 * Clase principal tarea 4 ED.
 * 
 * @author Carlos Garces
 */
public class Main {

    /**
     * Método principal de la aplicación.
     * 
     * @param args
     */
    public static void main(String[] args) {
        operativa_cuenta(2500);
    }

    /**
     * Función que realiza la operativa ficticia de una cuenta bancaria.
     * Crea una cuenta con un determinado saldo inicial, realiza un ingreso,
     * y una retirada de fondos.
     * 
     * @param cantidad float que indica el saldo inicial de la cuenta
     */
    public static void operativa_cuenta(float cantidad) {

        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López", "1000-2365-85-1230456789", cantidad, 0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es" + saldoActual);

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
