package LLD_CWA.Iterator_Pattern;

public class IteratorDemo {
    public static void main(String[] args) {
        Iterable newArr = new Array<Integer>();
        newArr.addEle(5);
        newArr.addEle(25);
        newArr.addEle(125);
        newArr.addEle(625);
        Iterator it = new SimpleIterator(newArr);
        while(it.hasNext()){
            System.out.println("Arr1 Next ele: "+ it.next());
        }
        System.out.println("==============");
        Iterable newArr2 = new Array<String>();
        newArr2.addEle("5");
        newArr2.addEle("hello");
        newArr2.addEle("nice");
        newArr2.addEle("///////////......./////");
        Iterator it2 = new SimpleIterator(newArr2);
        while (it2.hasNext()){
            System.out.println("Arr2 Next ele: "+ it2.next());
        }
    }
}
