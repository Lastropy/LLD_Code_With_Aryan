package LLD_CWA.Iterator_Pattern;

public class SimpleIterator<T> implements Iterator<T>{
    Iterable<T> dataStructure;
    int idx;
    SimpleIterator(Iterable<T> ds){
        idx = 0;
        dataStructure = ds;
    }

    public boolean hasNext(){
        return idx < dataStructure.getSize();
    }

    public T next(){
        return dataStructure.getData(idx++);
    }
}
