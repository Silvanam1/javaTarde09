package ejerciciopilachecked;

class Pila {    
    public String m1(int x) throws Exception {
        System.out.println("Antes de llamar a m2");
        String ret = m2(x + 1);
        System.out.println("Desps de llamar a m2");
        return ret;
    }    
    public String m2(int x) throws Exception {
        System.out.println("Antes de llamar a m3");
        String ret = m3(x + 1);
        System.out.println("Desps de llamar a m3");
        return ret;
    }
    public String m3(int x) throws Exception {
        System.out.println("Antes de llamar a m4");
        try {
            String s = m4(x + 1);
            System.out.println("Desps de llamar a m4");
            return s;
        }
        catch (Exception ex) {
            throw ex;
        }
    }
    public String m4(int x) throws Exception {
        System.out.println("Antes de llamar a m5");
        String ret = m5(x + 1);
        System.out.println("Desps de llamar a m5");
        return ret;
    }
    public String m5(int x) throws Exception {
        System.out.println("Antes de llamar a m5");        
        String ret = concretarReserva(x + 1);
        System.out.println("Desps de llamar a m5");
        return ret;
    }
    public String concretarReserva(int x) throws Exception {
        System.out.println("Llegue a m6");        
        System.out.println("Valor de x: " + x);
        if (x==1000) {
            // obtener un numero de caso/reclamo
            throw new NroCaso("21 54 64 32 15");
        }
        return "35135132032";
    }
}
