package exercises;

public class MultiplicationTable {
    public static void main(String[] args) {
        int num = 8;
        for (int i = 1; i <= 10; i++) {
            int result = num * i;
            System.out.println(num+" X "+ i +" = "+ result);
        }
    }
}
