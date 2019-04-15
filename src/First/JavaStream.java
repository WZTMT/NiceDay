package First;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class JavaStream {
    public static void main(String args[]){
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        List<String> filtered = strings.parallelStream().filter(string -> !string.isEmpty()).collect(Collectors.toList());
        //filter 将获取满足条件的流中的元素
        System.out.println(filtered);

//        forEach
//        Stream 提供了新的方法 'forEach' 来迭代流中的每个数据。以下代码片段使用 forEach 输出了10个随机数：

        Random random = new Random();
        random.ints().limit(10).sorted().forEach(System.out::println);

        strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
        filtered = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.toList());

        System.out.println("筛选列表: " + filtered);
        String mergedString = strings.stream().filter(string -> !string.isEmpty()).collect(Collectors.joining(", "));
        System.out.println("合并字符串: " + mergedString);
    }
}
