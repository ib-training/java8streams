package streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercises {
    public static List<Double> squareRoots(List<Integer> numbers) {
        return numbers
                .stream()
                .map(Math::sqrt)
                .collect(Collectors.toList());
    }

    public static List<Integer> getAgeFromUsers(List<User> users) {
        return users.stream().map(User::getAge).collect(Collectors.toList());
    }

    public static List<Integer> getDistinctAges(List<User> users) {
        return users.stream().map(User::getAge).distinct().collect(Collectors.toList());
    }

    public static List<User> getFirstNUsers(List<User> users, int n) {
        return users.stream().limit(n).collect(Collectors.toList());
    }

    public static Integer countUsersOlderThen18(List<User> users) {
        return Long.valueOf(users.stream().filter(u -> u.getAge() > 18).count()).intValue();
    }

    public static List<String> mapToUpperCase(List<String> strings) {
        return strings.stream().map(String::toUpperCase).collect(Collectors.toList());
    }

    public static Integer sumInts(List<Integer> integers) {
        // return integers.stream().collect(Collectors.summingInt(s -> s));
        return integers.stream().reduce(0, (a, b) -> a + b);
    }

    public static List<String> getFirstNames(List<String> names) {
        return names.stream().map(s -> s.split(" ")).map(s -> s[0]).collect(Collectors.toList());
    }

    public static List<String> getDistinctLetters(List<String> names) {
        return names
                .stream()
                .map(s -> s.split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .collect(Collectors.toList());
    }

    public static String joinNamesWithComma(List<User> users) {
        return users
                .stream()
                .map(User::getName)
                .collect(Collectors.joining(", "));
    }

    public static double getAverageAge(List<User> users) {
        return users.stream().mapToInt(User::getAge).average().orElse(0);
    }

    public static Integer getMaxAge(List<User> users) {
        return users.stream().mapToInt(User::getAge).max().orElse(0);
    }

    public static Integer getMinAge(List<User> users) {
        return users.stream().mapToInt(User::getAge).min().orElse(0);
    }

    public static Map<Boolean, List<User>> partionUsersByGender(List<User> users) {
        return users.stream().collect(Collectors.groupingBy(User::isMale));
    }

    public static Map<Integer, List<User>> groupByAge(List<User> users) {
        return users.stream().collect(Collectors.groupingBy(User::getAge));
    }

    public static Map<Boolean, Map<Integer, List<User>>> groupByGenderAndAge(List<User> users) {
        return users.stream().collect(Collectors.groupingBy(User::isMale, Collectors.groupingBy(User::getAge)));
    }

    public static Map<Boolean, Long> countGender(List<User> users) {
        return users.stream().collect(Collectors.groupingBy(User::isMale, Collectors.counting()));
    }

    public static Optional<User> findAny(List<User> users, String name) {
        return users.stream().filter(u -> u.getName().equals(name)).findAny();
    }

    public static List<User> sortByAge(List<User> users) {
        return users.stream().sorted(Comparator.comparing(User::getAge)).collect(Collectors.toList());
    }

    public static Stream<Integer> getBoxedStream(IntStream stream) {
        return stream.boxed();
    }

    public static List<Double> generate10RandomNumbers() {
        return Stream.generate(() -> Math.random()).limit(10).collect(Collectors.toList());
    }

    public static int sumAge(List<User> users) {
        return users.stream().mapToInt(User::getAge).sum();
    }

    public static IntSummaryStatistics ageSummaryStatistics(List<User> users) {
        return users.stream().mapToInt(User::getAge).summaryStatistics();
    }

}
