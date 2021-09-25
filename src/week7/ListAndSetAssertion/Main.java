package week7.ListAndSetAssertion;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(15);
        arrayList.add(25);
        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(12);
        Set<Integer> hashset = new HashSet<>();
        hashset.add(10);
        hashset.add(2);
        hashset.add(3);
        hashset.add(4);
        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(15);
        treeSet.add(25);
        treeSet.add(35);
        treeSet.add(45);
        System.out.println(checkTheSize(arrayList, 2));
        System.out.println(checkTheSize(linkedList, 3));
        System.out.println(checkTheSize(hashset, 4));
        System.out.println(checkTheSize(treeSet, 4));
        System.out.println(checkTheSize(arrayList, 9));

    }

    public static <T> boolean checkTheSize(final Collection<T> collection, final int size) {
        if (collection.size() == size) return true;
        throw new RuntimeException("Incorrect size");

    }
}
