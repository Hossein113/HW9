import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Application {


    public static void main(String[] args) {


        //arrayMethod(nameList);

        landaMethod();

        averageTwoNumber();

        startAndEndWord();

        outPutPraactice();


    }

    private static void landaMethod() {
        System.out.println("");


        List<String> nameList = Arrays.asList("Amir", "Hatef", "Mehran", "Mojtaba",
                "Mohammad", "Ali", "Davood", "Reza", "Mohsen");


        Map<Integer, List<String>> collect = nameList.stream()
                .collect(Collectors.groupingBy(word -> word.length()));

        Map<Integer, List<List<String>>> collect1 = collect.values().stream()
                .collect(Collectors.groupingBy(word -> word.size()));

        System.out.println(collect);
        System.out.println("");
        System.out.println(collect1);


    }


    private static void arrayMethod() {

        List<String> nameList = Arrays.asList("Amir", "Hatef", "Mehran", "Mojtaba",
                "Mohammad", "Ali", "Davood", "Reza", "Mohsen");

        List<List<String>> newList = new ArrayList<>();


        nameList.forEach(System.out::println);


        for (int i = 0; i < nameList.size(); i++) {
            int finalI = i;

            List<String> collect = nameList.stream().filter(a -> a.length() == finalI).collect(Collectors.toList());

            if (!collect.isEmpty()) {
                newList.add(collect);

            }
        }

        newList.forEach(System.out::println);
    }

    private static void averageTwoNumber() {
        System.out.println("----------");

        BiFunction<Long, Long, Long> biFunction = (a, b) -> {
            return (a + b) / 2;

        };


        //System.out.println(biFunction.apply(8L, 10L));

        Long resulu = biFunction.apply(8L, 10L);

        System.out.println(resulu);

    }

    private static void startAndEndWord() {
        System.out.println("----------");

        Predicate<String> predicate = word -> {

            Character first = word.charAt(0);
            Character end = word.charAt(word.length() - 1);

            boolean result = first.equals(end);

            return result;

        };

        System.out.println(predicate.test("ali"));
    }

    private static void outPutPraactice() {
        System.out.println("----------");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(5);
        nums.add(1);

        nums.stream()
                .filter(val -> val > 1).forEach(System.out::println);

        //print integer > 1 ----->  print 3 , 5 ;

    }
}


