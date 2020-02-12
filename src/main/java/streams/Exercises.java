package streams;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Exercises {
    public static List<Double> squareRoots(List<Integer> numbers){
        // 1 Berechnen Sie die Wurzeln der übergebenen Zahlen
        throw new RuntimeException("not implemented");
    }

    public static List<Integer> getAgeFromUsers(List<User> users){
        // 2 Erzeugen Sie eine Liste, die die Alter der Nutzer enthält
        throw new RuntimeException("not implemented");
    }

    public static List<Integer> getDistinctAges(List<User> users){
        // 3 Wie zuvor, aber die Liste soll eindeutig sein
        throw new RuntimeException("not implemented");
    }

    public static List<User> getFirstNUsers(List<User> users, int n){
        // 4 Holen Sie die ersten n Nutzer
        throw new RuntimeException("not implemented");
    }

    public static Integer countUsersOlderThen18(List<User> users){
        // 5 Zählen Sie die volljährigen Nutzer
        throw new RuntimeException("not implemented");
    }

    public static List<String> mapToUpperCase(List<String> strings){
        // 6 Wandeln Sie alle Strings in Großbuchstaben um
        throw new RuntimeException("not implemented");
    }

    public static Integer sumInts(List<Integer> integers){
        // 7 Summieren Sie alle Ints zusammen
        throw new RuntimeException("not implemented");
    }

    public static List<String> getFirstNames(List<String> names){
        // 8 Holen Sie alle Vornamen der Nutzer
        throw new RuntimeException("not implemented");
    }

    public static List<String> getDistinctLetters(List<String> names){
        // 9 Holen Sie eine Liste aller Buchstaben, die in den Namen vorkommen
        // Die Liste soll eindeutig sein
        throw new RuntimeException("not implemented");
    }


    public static String joinNamesWithComma(List<User> users){
        // 10 Fügen Sie die Liste der Namen zu einem String zusammen, durch Komma getrennt
        throw new RuntimeException("not implemented");
    }

    public static double getAverageAge(List<User> users){
        // 11 Berechnen Sie das Durchschnittsalter aller Nutzer
        throw new RuntimeException("not implemented");
    }

    public static Integer getMaxAge(List<User> users){
        // 12 Holen Sie das höchste Alter
        throw new RuntimeException("not implemented");
    }

    public static Integer getMinAge(List<User> users) {
        // 13 Holen Sie das niedrigste Alter
        throw new RuntimeException("not implemented");
    }

    public static Map<Boolean, List<User>> partionUsersByGender(List<User> users){
        // 14 Gruppieren Sie die Nutzer nach Geschlecht
        throw new RuntimeException("not implemented");
    }

    public static Map<Integer, List<User>> groupByAge(List<User> users){
        // 15 Gruppieren Sie die Nutzer nach Alter
        throw new RuntimeException("not implemented");
    }

    public static Map<Boolean, Map<Integer, List<User>>> groupByGenderAndAge(List<User> users){
        // 16 Gruppieren Sie die Nutzer nach Geschlech und Alter
        throw new RuntimeException("not implemented");
    }

    public static Map<Boolean, Long> countGender(List<User> users){
        // 17 Zählen Sie Nutzer nach Geschlecht
        throw new RuntimeException("not implemented");
    }

    public static List<User> sortByAge(List<User> users){
        // 18 geben Sie die Nutzer sortiert nach Alter aus
        throw new RuntimeException("not implemented");
    }

    public static Stream<Integer> getBoxedStream(IntStream stream){
        // 19 Wandeln Sie den IntStream in einen Stream<Integer>
        throw new RuntimeException("not implemented");
    }

    public static List<Double> generate10RandomNumbers(){
        // 20 erzeugen Sie 10 Zufallszahlen als Stream
        throw new RuntimeException("not implemented");
    }

    public static int sumAge(List<User> users){
        // 21 Berechnen Sie die Summe aller Alterszahlen
        throw new RuntimeException("not implemented");
    }

    public static IntSummaryStatistics ageSummaryStatistics(List<User> users){
        // 22 Geben Sie die Altersstatistik aus
        throw new RuntimeException("not implemented");
    }

}
