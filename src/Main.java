public class Main {
    public static void main(String[] args) {
        OnTaskDoneListener listener = System.out::println;
        OnTaskErrorListener errorListener = x -> {
            System.out.println("Error on task " + x);
        };
        Worker worker = new Worker(listener, errorListener);

        worker.start();
    }
}