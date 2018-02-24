import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by xuesj on 2017/11/6.
 */
public class test {
    public static void  main(String[] args){
        List<String> list = new ArrayList<String>();
        list.add("2003");
        list.add("2005");
        list.add("2001");
        list.add("2007");
        System.out.println(list);

        Collections.sort(list, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 返回相反的compare
                return o2.compareTo(o1);
            }
        });

        System.out.println(list);
    }
}
