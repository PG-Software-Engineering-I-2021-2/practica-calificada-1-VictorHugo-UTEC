package asistente;

public class Autor {
    private final String nombre;
    private final int anhoNacimiento;

    public Autor(String nombre, int a){
        this.nombre = nombre;
        this.anhoNacimiento = a;
    }

    public String getNombre(){
        return nombre;
    }

}
