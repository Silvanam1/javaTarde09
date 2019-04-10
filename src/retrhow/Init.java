package retrhow;

public class Init {    
    public static void produceError() throws Exception {
        throw new Exception("");
    }
    public static void m1() throws Exception {
        try {
            produceError();
        }
        catch (Exception ex) {
            System.out.println("Ocurrio un error");
            throw ex;
        }
    }
    public static void main(String[] args) {
        try {
            m1();
        }
        catch (Exception ex) {
        }
        finally {
            System.out.println("Termino el programa normalmente");
        }
    }
}
