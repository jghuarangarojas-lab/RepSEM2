
package EJER1;

import java.text.DecimalFormat;

public class Deportista {
    
    DecimalFormat df = new DecimalFormat("#.##");
    /*Atributos Encapsulados*/
    private String Nombre;
    private double Peso, Altura;
    /*Métodos de acceso Público (get,set)*/

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }
    
    public double CalcularIMC(){
        if (Altura>=1){
        return Peso/(Altura*Altura);}//Math.pow(Altura,2)
        else{
            return 0;
        }
    }
    
    public String NiveldePeso(){
        double IMC = CalcularIMC();
        if(IMC >0 && IMC <18.5){
            return "Bajo Peso";
        }else if(IMC >= 18.5 && IMC<24.9){
            return "Peso Normal";
        }else if(IMC >=24.9 && IMC<29.9){
            return "Sobrepeso";
        }else{
            return "Obesidad";
        }
    }
    
    public String Mostrar(){
        return "Nombre: "+Nombre+
                "\nPeso: "+Peso+ "kg"+
                "\nAltura: "+Altura+ "m"+
                "\nIMC: "+df.format(CalcularIMC())+
                "\nNivel de Peso: "+NiveldePeso();
    }
}
