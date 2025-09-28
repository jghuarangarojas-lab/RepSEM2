
package EJER4;

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
