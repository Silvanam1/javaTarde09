package ejercicios;

public class FueraDelArray {
    public static void main(String[] args) {
        try {
            int[] arr = new int[] {1,2,3};
            arr[2] = 3;
        }
        catch (IndexOutOfBoundsException ex) {
            System.out.println("Te juiste del array");
        }
        
    }
}
