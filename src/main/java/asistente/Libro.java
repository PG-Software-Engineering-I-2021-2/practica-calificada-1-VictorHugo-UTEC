package asistente;

public class Libro {
    private final String nombre;
    private final int anho;
    private final Autor autor;

    public Libro(String nombre, int anho, Autor autor){
        this.nombre = nombre;
        this.anho = anho;
        this.autor =  autor;
    }

    public String getNombre(){
        return nombre;
    }

    public Autor getAutor(){
        return autor;
    }

    public int getAño(){
        return anho;
    }
}
