package stackoverflow;

public class DesbordeDePila {
    public static void m1(int x) {
        System.out.println(x);
        m1(x+1);
    }
    public static void main(String[] args) {
        m1(1);
    }
}
