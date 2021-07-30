package Laboratory2;

public class Ex5_MathRandom {
    public static void main(String[] args) {
        //Generate random
        int min = 0;
        int max = 9;
        int range = max - min + 1;
        int[] numbers = new int[max + 1];

        for(int i = 0; i < 100; ++i) {
            int rand = (int) (Math.random() * range) + min;
            numbers[rand] += 1;
        }

        for(int i = min; i <= max; ++i) {
            if(numbers[i] > 0) {
                System.out.println(i + ": " + numbers[i]);
            }
        }
    }
}
