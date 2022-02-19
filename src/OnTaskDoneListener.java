@FunctionalInterface
public interface OnTaskDoneListener<T> {

    void onDone(T result);
}