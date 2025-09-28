
package EJER2;

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

