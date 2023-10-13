package lab_1;

public class Task6 {
    public void runTask() {
        int cnt = 10;

        System.out.println("Первые " + cnt + " чисел гармонического ряда:\n");
        harmonic(cnt);
    }

    public static void harmonic(int cnt) {
        double result = 0.0;
        for (int i = cnt; i > 0; i--) {

            result = result + (double) 1 / i;

            if (i != 1) {
                System.out.print(result + ",\n");
            } else {
                System.out.print(result + ".");
            }
        }
    }
}
