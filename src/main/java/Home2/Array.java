package Home2;

public class Array {
    public static <T> void printArray(T[] array){
        for (T element: array
             ) {
            System.out.println(element);
        }
    }
}
