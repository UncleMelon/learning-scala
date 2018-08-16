import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSortedSet;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author Matthew Wu
 * @date 2018-07-31
 */
public class ImmutableTest {

    public void testJDKImmutable() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");

        System.out.println(list);

        List<String> unmodifiableList = Collections.unmodifiableList(list);
        System.out.println(unmodifiableList);

        List<String> unmodifiableList1=Collections.unmodifiableList(Arrays.asList("a","b","c"));
        System.out.println(unmodifiableList1);


        String temp = unmodifiableList.get(1);
        System.out.println("unmodifiableList [0]:" + temp);

        list.add("baby");
        System.out.println("list add a item after list:" + list);
        System.out.println("list add a item after unmodifiableList:" + unmodifiableList);

        unmodifiableList1.add("bb");
        System.out.println("unmodifiableList1 add a item after list" + unmodifiableList1);

        unmodifiableList.add("cc");
        System.out.println("unmodifiableList add a item after list" + unmodifiableList);
    }


    public void testGuavaImmutable() {
        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        System.out.println("list:" + list);

        //使用copyof新建ImmutableList
        ImmutableList<String> imlist = ImmutableList.copyOf(list);
        System.out.println("imlist:" + imlist);

        ImmutableList<String> imOflist = ImmutableList.of("peida", "jerry", "harry");
        System.out.println("imOflist:" + imOflist);

        ImmutableSortedSet<String> imSortList = ImmutableSortedSet.of("d", "a", "b", "c", "a", "b");
        System.out.println("imSortList:" + imSortList);

        //Guava的imuutableList不依赖原来的集合类
        list.add("baby");
        System.out.println("list add a item after list:" + list);
        System.out.println("list add a item after imlist:" + imlist);

        ImmutableSet<Color> imColorSet = ImmutableSet.<Color>builder()
                .add(new Color(0, 255, 255))
                .add(new Color(0, 191, 255))
                .build();

        System.out.println("imColorSet:" + imColorSet);
    }

    public static void main(String[] args) {
//        new ImmutableTest().testJDKImmutable();
        new ImmutableTest().testGuavaImmutable();
    }
}
