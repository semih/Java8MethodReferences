package main.exercise1;

import java.util.function.BiFunction;

public class MethodReferencesExamples {

    public static <T> T mergeThings(T a, T b, BiFunction<T, T, T> merger) {
        return merger.apply(a, b);
    }

    public static String appendStrings(String a, String b) {
        return a + b;
    }

    public String appendStrings2(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {

        MethodReferencesExamples myApp = new MethodReferencesExamples();

        // Calling the method mergeThings with a lambda expression
        System.out.println(MethodReferencesExamples.mergeThings("Hello ", "World", (a,b) -> a+b));

        // references to a static method (use appendStrings)
        System.out.println(MethodReferencesExamples.mergeThings("Hello ", "World", MethodReferencesExamples::appendStrings));

        // references to a instance method (use appendStrings2)
        System.out.println(MethodReferencesExamples.mergeThings("Hello ", "World", myApp::appendStrings2));

        // references to a static method (use concat method of the String class)
        System.out.println(MethodReferencesExamples.mergeThings("Hello ", "World", String::concat));
    }
}
