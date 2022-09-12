package ru.mirea.task12;

public class App {
    public static void main(String[] args) {
        // 1
        SortingStudentsByID sbi = new SortingStudentsByID();
        sbi.print();
        sbi.sortStudents();
        sbi.print();
        // 2
        SortingStudentsByGPA sbg = new SortingStudentsByGPA();
        sbg.print();
        sbg.quickSort(sbg.getStudents(), 0, sbg.getLen() - 1);
        sbg.print();
        // 3
        Sorting2Students s2s = new Sorting2Students();
        System.out.println("1");
        s2s.print(s2s.students1);
        System.out.println("2");
        s2s.print(s2s.students2);
        s2s.setStudents1(s2s.sortArray(s2s.getStudents1()));
        s2s.setStudents2(s2s.sortArray(s2s.getStudents2()));
        s2s.setStudents3(s2s.mergeArray(s2s.getStudents1(), s2s.getStudents2()));
        System.out.println(3);
        s2s.print(s2s.getStudents3());
    }
}
