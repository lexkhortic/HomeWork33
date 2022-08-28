public class HW33 {
    public static void main(String[] args) {
        ThreadRandom threadRandom = new ThreadRandom();
        ThreadSum threadSum = new ThreadSum();
        ThreadAverage threadAverage = new ThreadAverage();

        threadRandom.start();
        if (RandomArray.array != null && RandomArray.array.length != 0) {
            threadSum.start();
            threadAverage.start();
        } else {
            System.out.println("Массив не сформирован!");
        }

    }
}
