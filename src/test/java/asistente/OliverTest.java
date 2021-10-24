package asistente;

import org.testng.annotations.Test;
import org.testng.Assert;
import java.util.logging.Logger;

public class OliverTest {
    static final Logger logger = Logger.getLogger(Oliver.class.getName());

    @Test
    public void prueba(){
        var oliver = Oliver.getInstance();

        Autor a1 = new Autor("Pepe Grillo",1945);
        Autor a2 = new Autor("Maria Cevallos",1950);
        Autor a3 = new Autor("Jose Marchena",1980);
        Autor a4 = new Autor("Hugo Fio",1978);
        Autor a5 = new Autor("Alex Bionj",1995);

        oliver.agregarAutor(a1);
        oliver.agregarAutor(a2);
        oliver.agregarAutor(a3);
        oliver.agregarAutor(a4);
        oliver.agregarAutor(a5);

        oliver.agregarLibro("La Mascara de la muerte",1990,a1);
        oliver.agregarLibro("El oso perezoso",1995,a2);
        oliver.agregarLibro("A boneca da morte",1985,a4);
        oliver.agregarLibro("Ing. Software avanzado",1985,a5);

        Assert.assertEquals(oliver.getNumeroLibros(),4);
        Assert.assertEquals(oliver.consultarLibro("Ing. Software avanzado"),false);
        Assert.assertEquals(oliver.consultarLibro("Ing. Software avanzado 2"),false);

    }

    @Test
    public void prueba2(){
        var oliver = Oliver.getInstance();

        Autor a1 = new Autor("Pepe Grillo",1945);
        Autor a2 = new Autor("Maria Cevallos",1950);
        Autor a3 = new Autor("Jose Marchena",1980);
        Autor a4 = new Autor("Hugo Fio",1978);
        Autor a5 = new Autor("Alex Bionj",1995);

        oliver.agregarAutor(a1);
        oliver.agregarAutor(a2);
        oliver.agregarAutor(a3);
        oliver.agregarAutor(a4);
        oliver.agregarAutor(a5);

        oliver.agregarLibro("La Mascara de la muerte",1990,a1);
        oliver.agregarLibro("El oso perezoso",1995,a2);
        oliver.agregarLibro("A boneca da morte",1985,a4);

        Assert.assertEquals(oliver.getNumeroLibros(),3);
        Assert.assertEquals(oliver.consultarLibro("Cuentos"),false);
        Assert.assertEquals(oliver.consultarLibro("Cuetos 2"),false);

    }
}
