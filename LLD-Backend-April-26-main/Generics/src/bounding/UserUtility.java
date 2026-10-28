package bounding;

import java.util.List;

public class UserUtility<T> {

    T val;

    public void printName(User u) {
        System.out.println(u.getName());
    }

//    public static void printNames(List<? extends User> users) {
//        for(User u: users) {
//            System.out.println(u.getName());
//        }
//    }

    // Upper bound
    public static <X extends User> void printNames(List<X> users) {
        for(User u: users) {
            System.out.println(u.getName());
        }
    }

    // Lower bound
    public static void printNamesX(List<? super User> users) {

    }
}
