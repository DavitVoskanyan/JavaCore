package classwork.students;

import java.util.Scanner;

public class StudentDemo {
    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorage studentStorage = new StudentStorage();

    public static void main(String[] args) {
        studentStorage.add(new Student("poxos ", "poxosyan", 12, "234565", "gyumri", "java"));
        studentStorage.add(new Student("petros ", "poxosyan", 12, "234565", "gyumri", "phatone"));
        studentStorage.add(new Student("panos ", "poxosyan", 12, "234565", "gyumri", "java script"));
        boolean run = true;
        while (true) {
            System.out.println("please input 0 for exit ");
            System.out.println("please input 1 for and student ");
            System.out.println("please 2 for print all students");
            System.out.println("please 3 for print  students count");
            System.out.println("please 4 for print  delete student by index  ");
            System.out.println("please 5 for print student by lesson ");
            System.out.println("please choose 6 for change student's lesson");
            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case 0:
                    run = false;
                    break;
                case 1:
                    addStudent();
                    break;
                case 2:
                    studentStorage.print();

                    break;
                case 3:
                    System.out.println(studentStorage.getSize());
                    break;
                case 4:
                    deleteStudentByIndex();
                    break;
                case 5:

                    extracted();
                case 6:
                    changeStudentLesson();
                    break;
                default:
                    System.out.println("Invalid command, please try again");


            }
        }
    }

    private static void deleteStudentByIndex() {
        studentStorage.print();
        System.out.println("please chose student index ");
        int index = Integer.parseInt(scanner.nextLine());
        studentStorage.delete(index);
    }

    private static void changeStudentLesson() {
        studentStorage.print();
        System.out.println("please chose student index ");
        int index = Integer.parseInt(scanner.nextLine());
        Student student = studentStorage.getStudentByIndex(index);
        if (student != null) {
            System.out.println("please input  new lesson name ");
            String lessonName = scanner.nextLine();
            if (lessonName != null && !lessonName.trim().equals("")) {
            student.setLesson(lessonName.trim());
            System.out.println("lesson changed for student  " + student.getName() + " " + student.getSurname());
        }
    }else

    {
        System.out.println("invalid index ,please try again");
        changStudentLesson();
    }

}

    private static void extracted() {
        System.out.println("please input lesson name ");
        String lessonName = scanner.nextLine();
        studentStorage.printStudentsByLesson(lessonName);
    }


    private static void addStudent() {
        System.out.println("Please input name ");
        String name = scanner.nextLine();
        System.out.println("Please input student surname ");
        String surname = scanner.nextLine();
        System.out.println("Please input student age ");
        String ageStr = scanner.nextLine();
        System.out.println("Please input student phoneNumber ");
        String phoneNumber = scanner.nextLine();
        System.out.println("Please input student city ");
        String city = scanner.nextLine();
        System.out.println("Please input student lesson ");
        String lesson = scanner.nextLine();
        System.out.println("please change the student's lesson");
        String changeLesson = scanner.nextLine();

        int age = Integer.parseInt(ageStr);
        Student student = new Student(name, surname, age, phoneNumber, city, lesson);
        studentStorage.add(student);
        System.out.println("Thank you");


    }

    public static void changStudentLesson() {

    }
}
