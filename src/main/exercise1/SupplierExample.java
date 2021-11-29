package main.exercise1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        List<Person> personList = Person.createPersonList();

        //convert List object to a HashSet object by using transferElements method.
        HashSet<Person> personHashSetLambda = transferElements(personList, () -> {
            return new HashSet<>();
        });

        HashSet<Person> personHashSet = transferElements(personList, HashSet<Person>::new );

        HashSet<Person> personHashSet2 = transferElements(personList, HashSet::new );

/*        List<Person> personList2 = new ArrayList<>();
        HashSet<Person> personHashSet1 = new HashSet<>();
        personHashSet1.addAll(personList2);*/
    }

    public static <T, SOURCE extends Collection<T>, DEST extends Collection<T>> DEST transferElements
            (SOURCE sourceCollection, Supplier<DEST> collectionFactory) {
        DEST result = collectionFactory.get();
        for (T t : sourceCollection) {
            result.add(t);
        }
        return result;
    }
}
