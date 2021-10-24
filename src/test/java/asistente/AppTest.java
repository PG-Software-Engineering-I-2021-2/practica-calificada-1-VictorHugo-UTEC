package asistente;
import org.testng.annotations.Test;
import org.testng.Assert;
import java.util.logging.Logger;

public class AppTest {

    @Test
    public void main() {
        App.main(new String[0]);
        Assert.assertTrue(true);
    }
}