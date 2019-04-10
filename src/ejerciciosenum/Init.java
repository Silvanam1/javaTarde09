package ejerciciosenum;

enum COLOR_IMPRESION {
    CYAN, MAGENTA, AMARILLO, NEGRO
}

public class Init {
    public static void recibirLamina(COLOR_IMPRESION color) {
        
    }
    public static void main(String[] args) {
        recibirLamina(COLOR_IMPRESION.AMARILLO);
        
        COLOR_IMPRESION[] arrColorImp = {
            COLOR_IMPRESION.CYAN,
            COLOR_IMPRESION.CYAN,
            COLOR_IMPRESION.AMARILLO
        }; 
        
    }
}
