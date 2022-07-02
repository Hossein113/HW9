import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Application {


    public static void main(String[] args) {


        List<String> nameList = Arrays.asList("Amir", "Hatef", "Mehran", "Mojtaba", "Mohammad", "Ali", "Davood", "Reza", "Mohsen");

        List<List<String>> newList = new ArrayList<>();


        newList.forEach(System.out::println);
        for (int i = 0; i < nameList.size(); i++) {
            int finalI = i;

            List<String> collect = nameList.stream().filter(a -> a.length() == finalI).collect(Collectors.toList());

            if (!collect.isEmpty()) {
                newList.add(collect);
            }
        }
        newList.forEach(System.out::println);
    }








}

