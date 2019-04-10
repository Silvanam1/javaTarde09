package ejerciciopilachecked;

public class Init {
    public static void main(String ...params) {
        try {
            String nroReserva = new Pila().m1(995);
            System.out.println("Numero de reserva: " + nroReserva);
        }
        catch (NroCaso n) {
            System.out.print("No se pudo realizar la reserva codigo reclamo: ");
            System.out.println(n.nroCaso);
        }
        catch (RuntimeException ex) {
            System.out.println("No se pudo hacer la reserva");
            System.out.println("El error producido es:");
            System.out.println(ex.getMessage());
        }
        catch (Exception ex) {
            System.out.println("Se produjo una exception controlada");            
        }
    }	
}
