import java.util.function.Predicate;

public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback) {
        this.callback = callback;
    }

    public Worker(OnTaskErrorListener errorCallback) {
        this.errorCallback = errorCallback;
    }

    int i = 0;

    public void start() {
        for (i = 0; i < 100; i++) {
            if (i != 33) {
                callback.onDone("Task " + i + " is done");
                //            isError.test(33);
            } else {
                //            errorCallback.onError("Task " + i + " is done with ERROR");
                callback.onDone("Task " + i + " is done with ERROR");
            }
        }
    }

    //   Predicate<Integer> isError = i -> i == 33;
}







