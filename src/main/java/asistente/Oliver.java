package asistente;
import java.util.Map;
import java.util.HashMap;

public class Oliver {
    private static Oliver instance;

    private Map<String, Libro> libros = new HashMap<>();
    private Map<String, Estudiante> estudiantes = new HashMap<>();
    private Map<String, Autor> autores = new HashMap<>();

    private Oliver(){

    }

    public void agregarLibro(String nombre, int anho, Autor autor){
        libros.put(nombre,new Libro(nombre,anho,autor));
    }
    public void agregarEstudiante(String nombre){
        estudiantes.put(nombre,new Estudiante(nombre));
    }
    public void agregarAutor(Autor autor){
        autores.put(autor.getNombre(),autor);
    }

    public int getNumeroLibros(){
        return libros.size();
    }

    public boolean consultarLibro(String nombre){
        return libros.equals(nombre);

    }
    public boolean ConsultarAutor(String nombre){
        return autores.equals(nombre);
    }

    public static Oliver getInstance() {
        if(instance == null){
            instance = new Oliver();
        }
        return instance;
    }

}
