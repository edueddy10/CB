package Datenstrukturen;

import java.util.HashSet;
import java.util.Iterator;

public class Datenstrukturen {
    public static void main(String[] args) {

        HashSet<Integer> a = new HashSet<>();
        HashSet<Integer> b = new HashSet<>();
        HashSet<Integer> c = new HashSet<>();
        HashSet<Integer> d = new HashSet<>();
        HashSet<Integer> e = new HashSet<>();


        fillHashSets(a, b, c, d, e);

        System.out.println("Unionlist:");
        System.out.println(getUnionList(a, getUnionList(b, getUnionList(c, getUnionList(d, e)))));

        System.out.println("Intersectionlist:");
        System.out.println(getIntersectionList(a, getIntersectionList(b, c)));

        System.out.println("Differencelist:");
        System.out.println(getDifferenceList(a, getDifferenceList(b, c)));

    }

    private static HashSet<Integer> getDifferenceList(HashSet<Integer> a, HashSet<Integer> b) {
        HashSet<Integer> difference = new HashSet<>(a);
        difference.removeAll(b);
        return difference;
    }

    private static HashSet<Integer> getIntersectionList(HashSet<Integer> a, HashSet<Integer> b) {
        HashSet<Integer> intersection = new HashSet<>(a);
        intersection.retainAll(b);
        return intersection;
    }

    private static HashSet<Integer> getUnionList(HashSet<Integer> a, HashSet<Integer> b) {
        HashSet<Integer> union = new HashSet<>(a);
        union.addAll(b);
        return union;
    }

    private static void fillHashSets(HashSet<Integer> a, HashSet<Integer> b, HashSet<Integer> c, HashSet<Integer> d, HashSet<Integer> e) {
        a.add(1);
        a.add(3);
        a.add(5);

        b.add(3);
        b.add(5);
        b.add(7);

        c.add(5);
        c.add(7);
        c.add(9);

        d.add(7);
        d.add(1);
        d.add(10);

        e.add(7);
        e.add(1);
        e.add(3);
    }
}
