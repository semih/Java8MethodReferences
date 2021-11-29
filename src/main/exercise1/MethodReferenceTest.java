package main.exercise1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MethodReferenceTest {

    public static void main(String[] args) {
        List<Person> personList = Person.createPersonList();
        Person[] personListAsArray = personList.toArray(new Person[personList.size()]);

        // 1. Comparator ayrıca oluşturulup, iki tane Person parametresi gönderilerek
        // compareTo metoduyla sıralanması sağlanabilir.
        class PersonAgeComparator implements Comparator<Person> {
            public int compare(Person a, Person b) {
                return a.getBirthday().compareTo(b.getBirthday());
            }
        }
        Arrays.sort(personListAsArray, new PersonAgeComparator());

        // 2. Comparator bir @FunctionalInterface olduğu için new ile yeni bir instance oluşturmak yerine
        // lambda expression olarak yazılabilir.
        Arrays.sort(personListAsArray, (Person a, Person b) -> {
            return a.getBirthday().compareTo(b.getBirthday());
        });

        // 3. İki Person nesnesinin doğum tarihlerini karşılaştıran yöntem, Person.compareByAge olarak zaten mevcuttur.
        Arrays.sort(personListAsArray,
                (a, b) -> Person.compareByAge(a, b)
        );

        // 4. Lambda expression'ın mevcut bir metodu çağırmasından dolayı,
        // lambda expression yerine method reference kullanılabilir.
        Arrays.sort(personListAsArray, Person::compareByAge);
    }
}


