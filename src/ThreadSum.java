public class ThreadSum extends Thread{
    @Override
    public void run() {
        System.out.println("Поток суммы - " + ThreadSum.currentThread().getName() +
                    "; Сумма элементов: " + RandomArray.sumNumbers());
    }
}
