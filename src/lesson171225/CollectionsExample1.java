package lesson171225;

import java.util.*;

public class CollectionsExample1 {
    public static void main(String[] args) {
        // a bad thing to do
        ArrayList<String> a = new ArrayList<>();

        List<String> a1 = new ArrayList<>();
        m2(a1);

        addSomething(a);


        // PFR example :(
        Map<String, String> myVeryLongMap = new HashMap<>();
        // over 9000 inserts into the map
        Set<String> keySet = myVeryLongMap.keySet();
        Object[] keys = keySet.toArray();

        String[] strings = keySet.toArray(new String[0]);
        String[] strings2 = keySet.toArray(new String[keySet.size()]);

        Arrays.sort(keys);
        for (int i = 0; i < keys.length; i++) {
            String key = (String) keys[i];
            String value = myVeryLongMap.get(key);

            //..
        }

        // is equvalent to
        Map<String, String> myVeryLongMap1 = new TreeMap<>();
        // over 9000 inserts into the map
        for (String key : myVeryLongMap1.keySet()) {
            String value = myVeryLongMap1.get(key);

            //..
        }





    }

    private static void m2(List<String> a1) {
        a1.add("something");
        a1.add("something2");
    }

    private static void addSomething(ArrayList<String> a) {
        a.add("something");
        a.add("something2");
    }

}

 class Student {
     String name;
     String surname;
     int age;
     int studNum;

     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (o == null || getClass() != o.getClass()) return false;

         Student student = (Student) o;

         if (age != student.age) return false;
         if (studNum != student.studNum) return false;
         if (name != null ? !name.equals(student.name) : student.name != null) return false;
         return surname != null ? surname.equals(student.surname) : student.surname == null;

     }

     @Override
     public int hashCode() {
         int result = name != null ? name.hashCode() : 0;
         result = 31 * result + (surname != null ? surname.hashCode() : 0);
         result = 31 * result + age;
         result = 31 * result + studNum;
         return result;
     }
 }