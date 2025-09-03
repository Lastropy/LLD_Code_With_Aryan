package LLD_CWA.Iterator_Pattern;

public interface Iterable<T> {
    int getSize();
    T getData(int idx);
    void addEle(T ele);
    T removeEle(int idx);
}
