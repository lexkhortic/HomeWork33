public class RandomArray {

    public static int[] array = arrayRandom();

    private static int[] arrayRandom(){
        int [] array = new int[((int)(Math.random() * 9)) + 3];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 11);
        }
        return array;
    }

    public static int sumNumbers() {
        int sum = 0;
        for (int el: array) {
            sum += el;
        }
        return sum;
    }

    public static double avgNumbers() {
        return (double) Math.round(((double) sumNumbers() / array.length) * 100) / 100;
    }

}
