import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class literator {
    public static void main(String args[]) {
        List list = new ArrayList();
        list.add("word");
        list.add("sdasd");
        list.add("asdasd");
        list.add("asasd");
        list.add("asdad");
        list.add("sdasd");
        list.add("asdad");
        list.add("asas");
        list.add("adasd");
    /*Iterator it =list.iterator();
    while (it.hasNext()) {
        String str=(String)it.next();
        if ("world".equals(str)) {
            list.add("javaee");  //遍历的时候同事修改

        }

    }*/
        /*if (list.get(0).equals("word")) {
            list.add("javaee");

        }*/
        ListIterator li = list.listIterator();
        while (li.hasNext()) {
            String str = (String) li.next();
            if ("word".equals(str)) {
                //list.add("javaee");  //遍历的时候同事修改
                li.add("javaee");

            }
            System.out.println(list);

        }
    }
}
