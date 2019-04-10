package ejercicios;

import java.util.Date;

public class PunternoNulo {
    public static void main(String[] args) {
        Date d = null;
        d.before(d);
    }
}
