package classwork.students.command;

public interface Command {
    int LOGOUT= 0;
    int ADD_STUDENT = 1;
    int PRINT_ALL_STUDENT = 2;
    int PRINT_STUDENT_COUNT = 3;
    int DELETE_STUDENT_BY_INDEX = 4;
    int PRINT_STUDENTS_BY_LESSON = 5;
    int CHANGE_STUDENT_LESSON = 6;
    int ADD_LESSON=7;
    int PRINT_ALL_LESSON=8;

    int EXIT=0;
    int LOGIN=1;
    int REGISTER =2;

    static void printCommands() {


        System.out.println("please input "+LOGOUT +"for logout ");
        System.out.println("please input "+ ADD_STUDENT+" for and student ");
        System.out.println("please input"+PRINT_ALL_STUDENT+" for print all students");
        System.out.println("please input "+PRINT_STUDENT_COUNT+" for print  students count");
        System.out.println("please input "+DELETE_STUDENT_BY_INDEX+" for print  delete student by index  ");
        System.out.println("please input "+PRINT_STUDENTS_BY_LESSON+" for print student by lesson ");
        System.out.println("please choose "+CHANGE_STUDENT_LESSON+" for change student's lesson");
        System.out.println("please choose "+ADD_LESSON+" for Add lesson");
        System.out.println("please input "+PRINT_ALL_LESSON+"for all lesson");

    }

    static void printLoginCommand() {
        System.out.println("please input "+EXIT +"for exit ");
        System.out.println("please input "+LOGIN+"for login ");
        System.out.println("please input "+REGISTER +"for register ");

    }

    static void printUserCommands() {
        System.out.println("please input "+LOGOUT +"for logout ");
        System.out.println("please input "+ ADD_STUDENT+" for and student ");
        System.out.println("please input"+PRINT_ALL_STUDENT+" for print all students");
        System.out.println("please input "+PRINT_STUDENT_COUNT+" for print  students count");
        System.out.println("please input "+PRINT_STUDENTS_BY_LESSON+" for print student by lesson ");
        System.out.println("please input "+PRINT_ALL_LESSON+"for all lesson");

    }
}
