package ru.mirea.task12;


public class SortingStudentsByID {
    Student[] students = {
            new Student(12, 5),
            new Student(25, 5),
            new Student(13, 3),
            new Student(12, 4),
            new Student(7, 3),
            new Student(6, 2),
            new Student(19, 5),
            new Student(3, 4)
    };
    public void sortStudents() {
        for (int i = 1; i < students.length; i++) {
            for (int j = i; j > 0; j--) {
                if(students[j].getID() > students[j-1].getID()){
                    Student temp2 = students[j];
                    students[j] = students[j-1];
                    students[j-1] = temp2;
                }
                else {
                    break;
                }
            }
        }
    }
    public void print() {
        String tmp;
        System.out.println("Students: ");
        for (int i = 0; i < students.length; i++) {
            tmp = i + " " + students[i];
            System.out.println(tmp);
        }
    }
}
