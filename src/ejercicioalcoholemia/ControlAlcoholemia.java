package ejercicioalcoholemia;

public class ControlAlcoholemia {
    private int veces = 0;
    public void beber() throws ControlExcedidoException {
        System.out.println("Bebiendo feliz !!!");
        veces++;
        if (veces > 4) {
            throw new ControlExcedidoException();
        }
    }
}
