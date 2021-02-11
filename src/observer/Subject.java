package observer;

public interface Subject<T> {
    void registerObserver(Observer<T> o);
    void removeObserver(Observer<T> o);
    void notifyObserver(T t);
}