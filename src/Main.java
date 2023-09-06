public class Main {
    public static void main(String[] args) {
        OnTaskDoneListener listener = (result) -> System.out.println(result);
        OnTaskErrorListener notListener = (result) -> System.out.println(result);
        Worker worker = new Worker(listener, notListener);
        worker.start();
    }
}

@FunctionalInterface
interface OnTaskErrorListener {
    void onError(String result);
}

@FunctionalInterface
interface OnTaskDoneListener {
    void onDone(String result);
}



