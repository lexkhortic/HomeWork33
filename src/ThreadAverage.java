public class ThreadAverage extends Thread{
    @Override
    public void run() {
        System.out.println("Поток среднего - " + ThreadAverage.currentThread().getName() +
                "; Среднее арифметическое: " + RandomArray.avgNumbers());
    }
}
