package org.example;

import java.time.LocalDate;
import java.util.TreeSet;


public class Main {
    public static void main(String[] args) {




        User oneUser = new User("Ярослав", "Янукович", "Янович", LocalDate.now());
        User twoUser = new User("Петров", "Петр", "Петрович", LocalDate.now());
        User threeUser = new User("Сидоров", "Семен", "Петрович", LocalDate.now());

        TreeSet<User> treeSet = new TreeSet<User>(new UserComparator<>());
        treeSet.add(oneUser);
        treeSet.add(twoUser);
        treeSet.add(threeUser);
        System.out.println(treeSet);

        System.out.println("//////////////////////////////");

        User oneTeacher1 = new User("Ярослав", "Ярославович", "Якин", LocalDate.now());
        User twoTeacher2 = new User("Глеб", "Глебович", "Петрович", LocalDate.now());
        User threeTeacher3 = new User("Екатерина", "Константиновна", "Каткова", LocalDate.now());

        TreeSet<User> treeSet2 = new TreeSet<User>(new TeacherComparator<>());
        treeSet2.add(oneTeacher1);
        treeSet2.add(twoTeacher2);
        treeSet2.add(threeTeacher3);
        System.out.println(treeSet2);







//        Модифицировать учительский класс и связанные с ним,
//        добавив типизацию(Добавить iterator + comparator + teacherGroup)
    }
}
