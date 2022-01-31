package ej1arraysbidimensionales;

public class Modelo {

    private String nombre;
    private int tipo;
    private float[] ventas;

    public Modelo() {
        ventas = new float[6];
    }

    public Modelo(String nombre, int tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
        ventas = new float[6];
    }

    public String getNombre() {
        return nombre;
    }

    public int getTipo() {
        return tipo;
    }

    public float[] getVentas() { //Devuelve todas las ventas
        return ventas;
    }

    public float getUnaVenta(int mes) { //Devuelve una venta
        return ventas[mes];
    }

    public void grabar(String nombre, int tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void setVentas(float[] ventas) { //Para todas las ventas
        this.ventas = ventas;
    }

    public void setUnaVenta(float venta, int mes) { //Pasar ventas mes por mes
        ventas[mes] = venta;
    }

    /*
    public float ventas1Trimestre() {
        float total = 0;
        for (int mes = 0; mes < 3; mes++) {
            total = total + ventas[mes];
        }
        return total;
    }
    public float ventas2Trimestre() {
        float total = 0;
        for (int mes = 3; mes < 6; mes++) {
            total = total + ventas[mes];
        }
        return total;
    }
     */
    public float ventasTrimestre(int valor) {
        float total = 0;
        int finalt = valor + 3;
        for (int mes = valor; mes < finalt; mes++) {
            total = total + ventas[mes];
        }
        return total;
    }

}
