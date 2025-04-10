package exercises;

public class AvarageThreeNumbers {
    public static void main(String[] args) {
        int[] numbers = {22,11,5};
        int sum = 0;
        for (int num: numbers){
            sum += num;
        }
        int media = sum / numbers.length;
        System.out.println(media);
    }
}
