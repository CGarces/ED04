package cuentas;

public class CCuenta {

    private String nombre; // Nombre del titular de la cuenta
    private String cuenta; // Número de cuenta
    private double saldo; // Saldo actual de la cuenta
    private double tipoInterés; // Tipo de interés actual de la cuenta

    public CCuenta() {
    }

    /**
     * Constructor de la clase CCuenta
     * 
     * @param nom  Nombre del titular de la cuenta
     * @param cue  Número de cuenta
     * @param sal  Saldo actual de la cuenta
     * @param tipo Tipo de interés actual de la cuenta
     */
    public CCuenta(String nom, String cue, double sal, double tipo) {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

    /**
     * Devuelve el nombre del titular de la cuenta
     * 
     * @return Nombre del titular de la cuenta
     */
    private String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del titular de la cuenta
     * 
     * @param nombre Nombre del titular de la cuenta
     */
    private void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Devuelve el número de cuenta
     * 
     * @return Número de cuenta
     */
    private String getCuenta() {
        return cuenta;
    }

    /**
     * Establece el número de cuenta
     * 
     * @param cuenta Número de cuenta
     */
    private void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * Devuelve el saldo actual de la cuenta
     * 
     * @return Saldo actual de la cuenta
     */
    private double getSaldo() {
        return saldo;
    }

    /**
     * Establece el saldo actual de la cuenta
     * 
     * @param saldo Saldo actual de la cuenta
     */
    private void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Devuelve el tipo de interés actual de la cuenta
     * 
     * @return Tipo de interés actual de la cuenta
     */
    private double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * Establece el tipo de interés actual de la cuenta
     * 
     * @param tipoInterés Tipo de interés actual de la cuenta
     */
    private void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }

    /**
     * Devuelve el estado de la cuenta
     * 
     * @return Estado de la cuenta
     */
    public double estado() {
        return getSaldo();
    }

    /**
     * Ingresa una cantidad en la cuenta
     * 
     * @param cantidad Cantidad a ingresar
     * @throws Exception Si la cantidad es negativa
     */
    public void ingresar(double cantidad) throws Exception {
        if (cantidad < 0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Retira una cantidad de la cuenta
     * 
     * @param cantidad Cantidad a retirar
     * @throws Exception Si la cantidad es negativa
     * @throws Exception Si no hay suficiente saldo
     */
    public void retirar(double cantidad) throws Exception {
        if (cantidad <= 0)
            throw new Exception("No se puede retirar una cantidad negativa");
        if (estado() < cantidad)
            throw new Exception("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}
