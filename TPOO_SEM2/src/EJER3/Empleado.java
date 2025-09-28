
package EJER3;

public class Empleado {
    private String Nombre;
    private double Sueldo;
    private int HorasTrabajadas;
    private double SueldoBasico;
    private double SueldoBruto;
    private double SueldoNeto;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }

    public int getHorasTrabajadas() {
        return HorasTrabajadas;
    }

    public void setHorasTrabajadas(int HorasTrabajadas) {
        this.HorasTrabajadas = HorasTrabajadas;
    }

    public double getSueldoBasico() {
        return SueldoBasico;
    }

    public void setSueldoBasico(double SueldoBasico) {
        this.SueldoBasico = SueldoBasico;
    }

    public double getSueldoBruto() {
        return SueldoBruto;
    }

    public void setSueldoBruto(double SueldoBruto) {
        this.SueldoBruto = SueldoBruto;
    }

    public double getSueldoNeto() {
        return SueldoNeto;
    }

    public void setSueldoNeto(double SueldoNeto) {
        this.SueldoNeto = SueldoNeto;
    }
    
    public String MostrarSueldo(){
        return "Nombre: " +Nombre+
                "\nSueldo por horas: S/."+Sueldo+
                "\nHoras Trabajadas: "+HorasTrabajadas+
                "\nSueldo Básico: S/."+Sueldo*HorasTrabajadas+
                "\nBonificación: "+ SueldoBasico*0.20+"S/."+
                "\nSueldo Bruto: S/."+ (SueldoBasico +SueldoBasico*0.20)+
                "\nDescuento: S/."+SueldoBruto*0.10+
                "\nSueldo Neto: S/."+ (SueldoBruto - SueldoBruto*0.10);
    }
}
