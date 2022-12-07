
import java.util.*;

public class Main {
    public static void main(String[] args) {
        /**
         * Эки setтин симметриялык айырмасын эсептеген symmetricDifference методун ишке ашырыныз.
         * Метод натыйжаны жаңы set катары кайтарышы керек.
         * Методко параметр катары берилген setтерди өзгөртүүгө жол берилбейт.
         * Мисалы: [1, 2, 3} жана {0, 1, 2]
         * Жооп: [0, 3]
         * public static Set<Integer> symmetricDifference (Set<Integer> set1, Set<Integer> set2) методу болушу керек
         */
        Set<Integer> set1 = new LinkedHashSet<>(List.of(2,3,4));
        Set<Integer> set2 = new LinkedHashSet<>(List.of(3,4,5));


        System.out.println(symmetricDifference(set1, set2));

    }
    public static Set<Integer> symmetricDifference (Set<Integer> set1,Set<Integer> set2){
        Set<Integer> set = new HashSet<>(set1);
        set.addAll(set2);
        Set<Integer> sorted = new HashSet<>(set1);
        sorted.retainAll(set2);
        set.removeAll(sorted);
        return set;
    }
}