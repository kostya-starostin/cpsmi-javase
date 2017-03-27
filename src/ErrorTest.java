/**
 * Created by jetbrains on 20/03/17.
 */
public class ErrorTest {
    public static void main(String args[]) {
        try {
            int d = 0; //выполнится
            int a = 42 / d;
            if (d  != a) {
                int z = a + d; //не выполнится
            }
        } catch (RuntimeException e) {
            System.out.println(e.toString());
        }
    }
}


