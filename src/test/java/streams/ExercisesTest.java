package streams;

import org.junit.Test;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.Arrays.asList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

public class ExercisesTest {
@Test
    public void shouldMapStringsToUpperCase() {
        List<String> input = asList("This", "is", "java", "8");
        List<String> result = Exercises.mapToUpperCase(input);
        assertThat(result, contains("THIS", "IS", "JAVA", "8"));
    }

    @Test
    public void shouldReturnSquareRoot() {
        List<Integer> numbers = Arrays.asList(1, 4, 16, 256);
        List<Double> squares = Exercises.squareRoots(numbers);
        assertArrayEquals(
                squares.stream().mapToDouble(Double::doubleValue).toArray(),
                new double[] { 1, 2, 4, 16 }, 1E-5);
    }

    @Test
    public void shouldReturnAgeFromUser() {
        List<User> users = User.getUsersWithAge(18, 20);
        List<Integer> ageFromUsers = Exercises.getAgeFromUsers(users);
        assertThat(ageFromUsers, is(equalTo(Arrays.asList(18, 20))));
    }

    @Test
    public void shouldReturnFirstTwo() {
        List<User> users = User.getUsersWithAge(16, 17, 18, 20, 21, 22, 23);
        users = Exercises.getFirstNUsers(users, 2);
        assertThat(users, is(equalTo(Arrays.asList(users.get(0), users.get(1)))));
    }

    @Test
    public void shouldReturnNumberOfUsersOlderThen18() {
        List<User> users = User.getUsersWithAge(16, 20, 16, 17, 18);
        Integer count = Exercises.countUsersOlderThen18(users);
        assertTrue(count == 1);
    }

    @Test
    public void shouldReturnDistinctAges() {
        List<User> users = User.getUsersWithAge(18, 20, 20, 21, 22, 22, 23, 24, 25, 26);
        List<Integer> distinctAges = Exercises.getDistinctAges(users);
        assertThat(distinctAges, is(equalTo(Arrays.asList(18, 20, 21, 22, 23, 24, 25, 26))));
    }

    @Test
    public void shouldSumIntegersInCollection() {
        List<Integer> integers = asList(1, 2, 3, 4, 5);
        Integer result = Exercises.sumInts(integers);
        assertThat(result, equalTo(1 + 2 + 3 + 4 + 5));
    }

    @Test
    public void shouldReturnFirstNames() {
        List<String> names = asList("Barbara Cooper", "John Smith", "Jack Mueller");
        List<String> result = Exercises.getFirstNames(names);
        assertThat(result, equalTo(Arrays.asList("Barbara", "John", "Jack")));
    }

    @Test
    public void shouldReturnDistinctLetters() {
        List<String> names = asList("Barbara", "John", "Jack");
        List<String> result = Exercises.getDistinctLetters(names);
        assertThat(result, equalTo(Arrays.asList("B", "a", "r", "b", "J", "o", "h", "n", "c", "k")));
    }

    @Test
    public void shouldSeparateNamesByComma() {
        List<User> input = asList(
                new User("Homer"),
                new User("Maggie"),
                new User("Bart"));
        String result = Exercises.joinNamesWithComma(input);
        assertThat(result, equalTo("Homer, Maggie, Bart"));
    }

    @Test
    public void shouldPerformCalculations(){
        List<User> users = User.getUsersWithAge(10, 20, 30);
        assertThat(Exercises.getMinAge(users), equalTo(10));
        assertThat(Exercises.getMaxAge(users), equalTo(30));
        assertThat(Exercises.getAverageAge(users), equalTo((double)(10+20+30)/3));
    }

    @Test
    public void shouldPartitionByGender() {
        User homer = new User("Homer", true);
        User bart = new User("Bart", true);
        User maggie = new User("Maggie",false);
        User lisa = new User("Lisa", false);
        List<User> input = asList(homer, bart, maggie, lisa);
        Map<Boolean, List<User>> result = Exercises.partionUsersByGender(input);
        assertThat(result.get(true), containsInAnyOrder(homer, bart));
        assertThat(result.get(false), containsInAnyOrder(maggie, lisa));
    }

    @Test
    public void shouldGroupByAge() {
        User homer = new User("Homer", 50);
        User bart = new User("Bart", 12);
        User maggie = new User("Maggie",2);
        User lisa = new User("Lisa", 8);
        List<User> input = asList(homer, bart, maggie, lisa);
        Map<Integer, List<User>> result = Exercises.groupByAge(input);
        assertThat(result.get(50), containsInAnyOrder(homer));
        assertThat(result.get(12), containsInAnyOrder(bart));
        assertThat(result.get(8), containsInAnyOrder(lisa));
        assertThat(result.get(2), containsInAnyOrder(maggie));
    }

    @Test
    public void shouldGroupByGenderAndAge() {
        User homer = new User("Homer", 50, true);
        User bart = new User("Bart", 12, true);
        User maggie = new User("Maggie",2, false);
        User lisa = new User("Lisa", 8, false);
        List<User> input = asList(homer, bart, maggie, lisa);
        Map<Boolean, Map<Integer, List<User>>> result = Exercises.groupByGenderAndAge(input);
        assertThat(result.get(true).get(50), containsInAnyOrder(homer));
        assertThat(result.get(true).get(12), containsInAnyOrder(bart));
        assertThat(result.get(false).get(8), containsInAnyOrder(lisa));
        assertThat(result.get(false).get(2), containsInAnyOrder(maggie));
    }

    @Test
    public void shouldCountGender() {
        User homer = new User("Homer", 50, true);
        User bart = new User("Bart", 12, true);
        User maggie = new User("Maggie",2, false);
        User lisa = new User("Lisa", 8, false);
        List<User> input = asList(homer, bart, maggie, lisa);
        Map<Boolean, Long> result = Exercises.countGender(input);
        assertThat(result.get(true), equalTo(2L));
        assertThat(result.get(false), equalTo(2L));
    }

    @Test
    public void shouldFindAnyUser(){
        User homer = new User("Homer", true);
        User bart = new User("Bart", true);
        User maggie = new User("Maggie",false);
        User lisa = new User("Lisa", true);
        List<User> users = asList(homer, bart, maggie, lisa);
        Optional<User> user = Exercises.findAny(users, "Homer");
        assertTrue(user.isPresent());
    }

    @Test
    public void shouldSortByAge(){
        User homer = new User("Homer", 50);
        User bart = new User("Bart", 12);
        User maggie = new User("Maggie",2);
        User lisa = new User("Lisa", 8);
        List<User> users = asList(homer, bart, maggie, lisa);
        List<User> sorted = Exercises.sortByAge(users);
        assertThat(sorted, contains(maggie, lisa, bart, homer));
    }

    @Test
    public void shouldSumAgeAsInt(){
        User homer = new User("Homer", 50);
        User bart = new User("Bart", 12);
        User maggie = new User("Maggie",2);
        User lisa = new User("Lisa", 8);
        List<User> users = asList(homer, bart, maggie, lisa);
        int sumAge = Exercises.sumAge(users);
        assertThat(sumAge, equalTo(50+12+2+8));
    }

    @Test
    public void shouldGenerateAgeSummaryStatistics(){
        User homer = new User("Homer", 50);
        User bart = new User("Bart", 12);
        User maggie = new User("Maggie",2);
        User lisa = new User("Lisa", 8);
        List<User> users = asList(homer, bart, maggie, lisa);
        IntSummaryStatistics statistics = Exercises.ageSummaryStatistics(users);
        assertThat(statistics.getAverage(), equalTo((double)(50+12+2+8)/4));
        assertThat(statistics.getCount(),equalTo(4L));
        assertThat(statistics.getMax(),equalTo(50));
        assertThat(statistics.getMin(),equalTo(2));
    }

    @Test
    public void shouldConvertToBoxedStream(){
        List<Integer> numbers = asList(1, 2, 3);
        IntStream intStream = numbers.stream().mapToInt(value -> value);
        Stream<Integer> boxedStream = Exercises.getBoxedStream(intStream);
        assertTrue(boxedStream.count() == 3);
    }

    @Test
    public void shouldGenerate10RandomNumbers(){
        List<Double> randomNumbers = Exercises.generate10RandomNumbers();
        assertTrue(randomNumbers.size()==10);
    }
}