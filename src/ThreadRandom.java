import java.util.Arrays;

public class ThreadRandom extends Thread{
    @Override
    public void run() {
        System.out.println("Поток массива - " + ThreadRandom.currentThread().getName() +
                "; Случайный массив: " + Arrays.toString(RandomArray.array));

    }
}
