package asistente;

public class Autor {
    private final String nombre;
    private final int anhonacimiento;

    public Autor(String nombre, int a){
        this.nombre = nombre;
        this.anhonacimiento = a;
    }

    public String getNombre(){
        return nombre;
    }

}
