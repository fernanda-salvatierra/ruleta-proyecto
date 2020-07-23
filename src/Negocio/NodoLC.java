package Negocio;
import java.awt.Color;

public class NodoLC {
    private String nombre;
    private double precio;
    private int id;
    private Color c;
    private NodoLC rI, rD;
    public NodoLC(int id, String nombre, double precio){
        this.id=id;
        this.nombre=nombre;
        this.precio=precio;
        this.c=null;
        this.rD=null;
        this.rI=null;
    }
    public Color getC() {
        return c;
    }
    public void setC(Color c) {
        this.c = c;
    }    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public NodoLC getrI() {
        return rI;
    }
    public void setrI(NodoLC rI) {
        this.rI = rI;
    }
    public NodoLC getrD() {
        return rD;
    }
    public void setrD(NodoLC rD) {
        this.rD = rD;
    }
}