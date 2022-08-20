package classwork.lesson18;

import classwork.students.model.Student;

public class StorageDemo {
    public static void main(String[] args) {

        Storage<Integer> intStorage = new Storage<>();
        intStorage.add(8);
        Storage<String> strStorage = new Storage<>();
        strStorage.add("9");
        String str = strStorage.getByIndex(8);

        Storage<Student> studentStorage = new Storage<>();
        studentStorage.add(new Student());
        Student student = studentStorage.getByIndex(0);


    }
}