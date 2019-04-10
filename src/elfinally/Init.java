package elfinally;

public class Init {
    public static void main(String[] args) {
        // Primero ejecuta el try
        // si en algun punto falla, va hacia el catch y luego el finally.
        // si todo sale bien, ejecuta el try, y luego finally
        // finally lo utilizamos para cerrar archivos y conexiones
        try {
            // abrir transaccion
            // commit
            System.out.println("Abre transac");
            // throw new Exception();
            System.out.println("Commit");
        }
        catch (Exception ex) {
            // rollback
            System.out.println("Fallo, debo hacer rollback");
        }
        finally {
            // concluir session
            System.out.println("Cierra session");
        }
    }
}
