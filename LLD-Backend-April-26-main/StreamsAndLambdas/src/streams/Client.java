package streams;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Client {

    public static void main(String[] args) {

//        List<Integer> l1 = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//
//         int ans = l1.stream()
//                 .filter((x) -> {
//                    System.out.println("Checking div by 2: " + x);
//                    return x % 2 == 0;
//                })
//                 .map((x) -> x*x)
//                 .reduce(0, Integer::sum);
//
//        System.out.println(ans);

//        Optional<Integer> y = l1.stream().
//                filter((x) -> {
//                    System.out.println("Check div by 2:"+x);
//                    return x%2==0;
//                })
//                        .findFirst();
//
//        if(y.isPresent()) {
//            System.out.println(y.get());
//        }

//        List<Integer> l2 = List.of(3,4,5);  // 3#4#5#
//
//        int mul = l2.stream()
//                .reduce(1,(curr,x) -> curr*x);
//
//        System.out.println(mul);

        List<Student> students = List.of(
                new Student("Virat", List.of("Physics","Chemistry")),
                new Student("Rohit", List.of("Maths","Chemistry")),
                new Student("Bumrah", List.of("English","Chemistry"))
        );

        Set<String> subjects = students.stream()
                .flatMap((x) -> x.getSubjects().stream())
                .collect(Collectors.toSet());

        System.out.println(subjects);

    }
}
