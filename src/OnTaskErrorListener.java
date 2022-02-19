@FunctionalInterface
public interface OnTaskErrorListener<T> {

    void onError(T result);
}