package ejercicioalcoholemia;

public class Init {
    private static void contieneLogica() throws ControlExcedidoException {
        ControlAlcoholemia control = new ControlAlcoholemia();
        control.beber();
        control.beber();
        control.beber();
        control.beber();
        control.beber();
        control.beber();
        control.beber();
    }
    public static void main(String[] args) {
        try {
            contieneLogica();
        }
        catch (ControlExcedidoException ex) {
            System.out.println("Prueba de rigor caminar derecho!!!");
        }
        catch (Exception ex) {
        }
    }
}
