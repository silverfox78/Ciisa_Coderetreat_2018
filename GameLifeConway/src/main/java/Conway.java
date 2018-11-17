import java.util.concurrent.ExecutionException;

public class Conway {

    private static Integer topeInferior =0;
    private static Integer topeSuperior =10;
    private Integer dimensionX;
    private Integer dimensionY;

    public Conway(Integer dimensionX, Integer dimensionY) throws Exception {
        this.validarDimension(dimensionX);
        this.validarDimension(dimensionY);
        this.dimensionX = dimensionX;

        this.dimensionY=dimensionY;
    }

    private void validarDimension (Integer valor) throws Exception{
        if (valor <= topeInferior) {
            throw new Exception("Ingrese un valor mayor a 0.");
        }
        if (valor >= topeSuperior) {
            throw new Exception("Ingrese un valor menor a 10.");
        }
    }

    public Integer getDimensionY() {
        return dimensionY;
    }
    public Integer getDimensionX() {
        return dimensionX;
    }

}
