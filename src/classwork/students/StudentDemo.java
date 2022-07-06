package classwork.students;

import classwork.students.command.Command;
import classwork.students.exeption.LessonNotFoundException;
import classwork.students.model.Lesson;
import classwork.students.model.Student;
import classwork.students.storage.LessonStorage;
import classwork.students.storage.StudentStorage;

import java.util.Scanner;

public class StudentDemo implements Command {
    private static Scanner scanner = new Scanner(System.in);
    private static StudentStorage studentStorage = new StudentStorage();
    private static LessonStorage lessonStorage = new LessonStorage();

    public static void main(String[] args) {
        Lesson java = new Lesson("java", "teacher name1", 34, 74);
        lessonStorage.add(java);
        Lesson javaScript = new Lesson("java script", "teacher name1", 34, 74);
        lessonStorage.add(javaScript);
        Lesson mysql = new Lesson("java", "teacher name1", 34, 74);
        lessonStorage.add(mysql);
        studentStorage.add(new Student("poxos ", "poxosyan", 12, "234565", "gyumri", java));
        studentStorage.add(new Student("petros ", "poxosyan", 12, "234565", "gyumri", javaScript));
        studentStorage.add(new Student("panos ", "poxosyan", 12, "234565", "gyumri", mysql));
        boolean run = true;
        while (run) {
            Command.printCommands();
            int command ;
          try {
              command=Integer.parseInt(scanner.nextLine());
          }catch (NumberFormatException e){
              command=-1;
          }

        switch
             (command) {
                case EXIT:
                    run = false;
                    break;
                case ADD_STUDENT:
                    addStudent();
                    break;
                case PRINT_ALL_STUDENT:
                    studentStorage.print();

                    break;
                case PRINT_STUDENT_COUNT:
                    System.out.println(studentStorage.getSize());
                    break;
                case DELETE_STUDENT_BY_INDEX:
                    deleteStudentByIndex();
                    break;
                case PRINT_STUDENTS_BY_LESSON:

                    searchStudentByLessonName();
                    break;
                case CHANGE_STUDENT_LESSON:
                    changeStudentLesson();
                    break;
                case ADD_LESSON:
                    addLesson();
                    break;
                case PRINT_ALL_LESSON:
                    lessonStorage.print();
                    break;
                default:
                    System.out.println("Invalid command, please try again");


            }
        }
    }


    private static void addLesson() {
        System.out.println("please input lesson name");
        String name = scanner.nextLine();

        System.out.println("please input lesson price ");
        double price = Double.parseDouble(scanner.nextLine());

        System.out.println("please input lesson duration by  month");
        int duration = Integer.parseInt(scanner.nextLine());

        System.out.println("please input lesson teacher name");
        String teacherName = scanner.nextLine();

        Lesson lesson = new Lesson(name, teacherName, duration, price);
        lessonStorage.add(lesson);
        System.out.println("lesson created");
    }

    private static void searchStudentByLessonName() {
        System.out.println("please input lesson name ");
        String lessonName = scanner.nextLine();
        studentStorage.printStudentsByLesson(lessonName);
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
            lessonStorage.print();
            System.out.println("please choose lesson index ");
            int lessonIndex = Integer.parseInt(scanner.nextLine());
            try {
                Lesson lesson = lessonStorage.getLessonByIndex(lessonIndex);
                student.setLesson(lesson);
                System.out.println("lesson changed");
            } catch (LessonNotFoundException e) {
                System.out.println(e.getMessage());
                changStudentLesson();
            }
        }else {
            System.out.println("invalid index , please try again");
            changStudentLesson();
        }

    }

    private static void changStudentLesson() {
    }



    private static void addStudent() {
        if (lessonStorage.getSize() == 0) {
            System.out.println("please add lesson");
            addLesson();
        } else {
            lessonStorage.print();
            System.out.println("please choose lesson");
            int lessonIndex = Integer.parseInt(scanner.nextLine());
            try {


                Lesson lesson = lessonStorage.getLessonByIndex(lessonIndex);
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

                int age = Integer.parseInt(ageStr);
                Student student = new Student(name, surname, age, phoneNumber, city, lesson);
                studentStorage.add(student);
                System.out.println("Thank you,Student added");
            }catch (LessonNotFoundException e ){
                System.out.println(e.getMessage());
                addStudent();


            }


        }
    }
}