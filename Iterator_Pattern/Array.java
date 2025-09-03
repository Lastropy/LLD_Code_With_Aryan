package LLD_CWA.Iterator_Pattern;
import java.util.ArrayList;
import java.util.List;

public class Array<T> implements Iterable<T> {
    List<T> dataStructure;
    Array(){
        dataStructure = new ArrayList<T>();
    }

    public void addEle(T ele){
        dataStructure.add(ele);
    }

   public int getSize(){
        return dataStructure.size();
   }

   public T removeEle(int idx){
       return dataStructure.remove(idx);
   }

   public T getData(int idx){
       return dataStructure.get(idx);
   }
}
