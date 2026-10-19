package genericity;

import java.util.ArrayList;
public class MyArrayList<E>{
    private ArrayList mlist = new ArrayList();
    public boolean add(E e){
        mlist.add(e);
        return true;
    }
    public boolean remove(E e){
         return mlist.remove(e);
    }
    public String toString(){
        return mlist.toString();
    }
}
