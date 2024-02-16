package Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApi {

    List<Integer> list  = Arrays.asList(1,2,1);

    public void featuresOfStream() {
        List<Integer> list1 = list.stream().map(p1-> p1*2).collect(Collectors.toList());
        System.out.println(list1);
    }
}
