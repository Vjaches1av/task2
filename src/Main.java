public class Main {

    public static void main(String[] args) {
        OnTaskDoneListener<String> doneListener = System.out::println;
        OnTaskErrorListener<String> errorListener = System.out::println;

        Worker worker = new Worker(doneListener, errorListener);
        worker.start();
    }
}