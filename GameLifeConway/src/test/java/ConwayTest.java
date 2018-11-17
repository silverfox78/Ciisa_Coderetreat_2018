import org.junit.Assert;
import org.junit.Test;

public class ConwayTest {
    @Test
    public void CrearTablero() throws Exception {
        Integer dimensionX, dimensionY;
        dimensionX = 5;
        dimensionY = 5;
        Integer esperadoX, esperadoY;
        esperadoX = 5;
        esperadoY = 5;
        Conway conway = new Conway(dimensionX, dimensionY);
        Assert.assertEquals(esperadoX, conway.getDimensionX());
        Assert.assertEquals(esperadoY, conway.getDimensionY());
    }

    @Test(expected = Exception.class)
    public void validaDimensionXPositivaMayorACero() throws Exception {
        Integer dimensionX, dimensionY;
        dimensionX = -3;
        dimensionY = 5;
        Conway conway = new Conway(dimensionX, dimensionY);
    }

    @Test(expected = Exception.class)
    public void validaDimensionYPositivaMayorACero() throws Exception {
        Integer dimensionX, dimensionY;
        dimensionX = 3;
        dimensionY = -5;
        Conway conway = new Conway(dimensionX, dimensionY);
    }


    @Test(expected = Exception.class)
    public void validaDimensionXPositivaTope10() throws Exception {
        Integer dimensionX, dimensionY;
        dimensionX = 12;
        dimensionY = 5;
        Conway conway = new Conway(dimensionX, dimensionY);
    }

    @Test(expected = Exception.class)
    public void validaDimensionYPositivaTope10() throws Exception {
        Integer dimensionX, dimensionY;
        dimensionX = 5;
        dimensionY = 12;
        Conway conway = new Conway(dimensionX, dimensionY);
    }
}
