//Clases Empleado y Numero
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

public class Numero {

    private double Valor1;
    private double Valor2;

    public double getValor1() {
        return Valor1;
    }

    public void setValor1(double Valor1) {
        this.Valor1 = Valor1;
    }

    public double getValor2() {
        return Valor2;
    }

    public void setValor2(double Valor2) {
        this.Valor2 = Valor2;
    }
    
    public double SUMA(){
        double Resultado = Valor1 + Valor2;
        return Resultado;
    } 
    public double RESTA(){
        double Resultado = Valor1 - Valor2;
        return Resultado;
    } 
    public double MULTIPLICACION(){
        double Resultado = Valor1 * Valor2;
        return Resultado;
    } 
    public double DIVISION(){
        if(Valor2==0){
            //System.out.print("No se puede dividir entre ");
            return 0;
        }
        double Resultado = Valor1 / Valor2;
        return Resultado;
    } 
    public String Resultados(){
        return "Suma: "+SUMA()+
                "\nResta: "+RESTA()+
                "\nMultiplicación: "+MULTIPLICACION()+
                "\nDivisión: "+DIVISION();
    }
}
