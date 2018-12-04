import com.sun.deploy.util.StringUtils;

import java.util.*;
import java.util.stream.Collectors;


/**
 * Created by reckywangbowen_i on 2018/11/26
 */
public class test {
    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5);

        List<Integer> toList1 = list.stream().
                map(n -> n * n).
                collect(Collectors.toList());

        List<Integer> toList2 = list.stream().
                filter(n -> ( n * n ) > 16).collect(Collectors.toList());

/*        list.stream().
                map(n -> String.valueOf(n * n)).
                collect(Collectors.toList()).forEach(System.out::println);*/
        List<String> stirngs = new ArrayList<>();
        stirngs.add("123");
        stirngs.add("1234");
        stirngs.add("");

        Comparator<Integer> comparator = ((o1, o2) -> o1.compareTo(o2));

        System.out.println(list.stream().max(comparator).get());

        System.out.println(list.stream().min(comparator).get());

    }
}
