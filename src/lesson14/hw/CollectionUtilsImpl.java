package lesson14.hw;

import java.util.*;

public class CollectionUtilsImpl implements CollectionUtils {


    private static void nullPointCheck(Collection<Integer> a, Collection<Integer> b) {
        if (a == null || b == null) {
            throw new NullPointerException();
        }
    }

    @Override
    public Collection<Integer> difference(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        nullPointCheck(a, b);

        ArrayList<Integer> colToListA = new ArrayList<>(a);
        ArrayList<Integer> colToListB = new ArrayList<>(b);

        colToListA.removeAll(colToListB);

        return colToListA;
    }

    @Override
    public Collection<Integer> union(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        nullPointCheck(a, b);

        Collection<Integer> result = new ArrayList<>(a);
        result.addAll(b);

        return result;
    }

    @Override
    public Collection<Integer> intersection(Collection<Integer> a, Collection<Integer> b) throws NullPointerException {
        nullPointCheck(a, b);

        Collection<Integer> result = new ArrayList<>();

        List<Integer> copyA = new ArrayList<>(a);
        List<Integer> copyB = new ArrayList<>(b);

//        for (int i = 0; i < copyA.size(); i++) {
//            Integer elementA = copyA.get(i);
//            for (int j = 0; j < copyB.size(); j++) {
//                Integer elementB = copyB.get(j);
//                if (elementA.equals(elementB)) {
//                    result.add(elementA);
//                    result.add(elementB);
//                }
//            }
//        }

        for (Integer elem : copyA) {
            if (copyB.contains(elem)) {
                result.add(elem);
            }
        }

        for (int i = 0; i < copyB.size(); i++) {
            Integer elem = copyB.get(i);
            if (copyA.contains(elem)) {
                result.add(elem);
            }
        }
        return result;
    }

    @Override
    public Set<Integer> unionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws
            NullPointerException {
        nullPointCheck(a, b);

        Collection<Integer> set = new HashSet<>(a);
        Collection<Integer> set1 = new HashSet<>(b);
        Set<Integer> result = new HashSet<>(set);
        result.addAll(set1);

        return result;
    }

    @Override
    public Set<Integer> intersectionWithoutDuplicate(Collection<Integer> a, Collection<Integer> b) throws
            NullPointerException {

        nullPointCheck(a, b);

        Set<Integer> result = new HashSet<>(a);
        Set<Integer> copiedB = new HashSet<>(b);
        result.retainAll(copiedB);

        return result;
    }
}
