import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTraveralDemo {
    public static void main(String[] args) {
       Collection<String> names = new ArrayList<>();
       names.add("张三");
       names.add("李四");
       names.add("王五");
       names.add("赵六");

        Iterator<String> it = names.iterator();
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());
        System.out.println(it.next());

        Collection<String> names1 = new ArrayList<>();
        names.add("张三");
        names.add("李四");
        names.add("王五");
        names.add("赵六");

        Iterator<String> it1 = names.iterator();
        //While遍历
        while(it1.hasNext()){
            System.out.println(it1.next());
        }
        //for遍历
        Collection<String> names2 = new ArrayList<>();
        names.add("张三");
        names.add("李四");
        names.add("王五");
        names.add("赵六");

        Iterator<String> it2 = names.iterator();
        for(;it2.hasNext();){
            System.out.println(it2.next());
        }
        Collection<String> names3 = new ArrayList<>();
        names.add("张三");
        names.add("李四");
        names.add("王五");
        names.add("赵六");

        Iterator<String> it3 = names.iterator();

        //lambada-for each 遍历
        names3.forEach(name -> {
            System.out.println(name);
        });

    }
}
