//Comentario
//Clases Deportista y Persona
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

public class Persona {
    private String Nombres, Apellidos, DNI, Sexo;
    private int FechaNacimiento;  

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public int getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(int FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }
    
    public int Edad(){
        int edad = 2025-this.FechaNacimiento;
        return edad;
    }
    public String Datos(){
        return "Nombre completo: "+Nombres+" "+Apellidos+
                "\nDNI: "+DNI+"\nSexo: "+Sexo+
                "\nFecha de Nacimiento: "+FechaNacimiento+
                "\nEdad: "+Edad() ;
    }
}