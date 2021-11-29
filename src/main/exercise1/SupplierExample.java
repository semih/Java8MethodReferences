package main.exercise1;

import java.util.Collection;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        List<Person> personList = Person.createPersonList();

        //convert List object to a HashSet object by using transferElements method.

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
