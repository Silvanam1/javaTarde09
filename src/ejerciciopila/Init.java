package ejerciciopila;

public class Init {
    public static void main(String ...params) {
        try {
            String nroReserva = new Pila().m1(994);
            System.out.println("Numero de reserva: " + nroReserva);
        }
        catch (RuntimeException ex) {
            System.out.println("No se pudo hacer la reserva");
            System.out.println("El error producido es:");
            System.out.println(ex.getMessage());
        }
    }	
}
