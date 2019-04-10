package ejerciciopila;

class Pila {    
    public String m1(int x) {
        System.out.println("Antes de llamar a m2");
        String ret = m2(x + 1);
        System.out.println("Desps de llamar a m2");
        return ret;
    }    
    public String m2(int x) {
        System.out.println("Antes de llamar a m3");
        String ret = m3(x + 1);
        System.out.println("Desps de llamar a m3");
        return ret;
    }
    public String m3(int x) {
        System.out.println("Antes de llamar a m4");
        String s = m4(x + 1);
        System.out.println("Desps de llamar a m4");
        return s;
    }
    public String m4(int x) {
        System.out.println("Antes de llamar a m5");
        String ret = m5(x + 1);
        System.out.println("Desps de llamar a m5");
        return ret;
    }
    public String m5(int x) {
        System.out.println("Antes de llamar a m5");        
        String ret = concretarReserva(x + 1);
        System.out.println("Desps de llamar a m5");
        return ret;
    }
    public String concretarReserva(int x) {
        System.out.println("Llegue a m6");        
        System.out.println("Valor de x: " + x);
        if (x==1000) {
            throw new RuntimeException("Con este valor no se puede hacer reserva");
        }
        return "35135132032";
    }
}
