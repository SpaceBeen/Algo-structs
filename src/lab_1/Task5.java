package lab_1;

public class Task5 {
    public static void main(String[] args) {
        if (args != null) {
            int i = 1;
            for (String arg : args) {
                System.out.println("Аргумент " + i + ": " + arg);
                i++;
            }
        }
    }
}
