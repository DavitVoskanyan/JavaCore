package classwork.students.model;

public class Student {

    private String name;
    private String surname;
    private int age;
    private String phoneNumber;
    private String city;
    private Lesson lesson;
    private String changeLesson;
    private  User registeredUser;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public void setLesson(Lesson lesson) {
        this.lesson = lesson;
    }

    public String getChangeLesson() {
        return changeLesson;
    }

    public void setChangeLesson(String changeLesson) {
        this.changeLesson = changeLesson;
    }

    public User getRegisteredUser() {
        return registeredUser;
    }

    public void setRegisteredUser(User registeredUser) {
        this.registeredUser = registeredUser;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", city='" + city + '\'' +
                ", lesson='" + lesson + '\'' +
                ", changeLesson='" + changeLesson + '\'' +
                ",registeredUser'"+registeredUser+'\''+
                '}';
    }

    public Student(String name, String surname, int age, String phoneNumber, String city, Lesson lesson, User registeredUser) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.lesson = lesson;
        this. changeLesson =  changeLesson;
        this.registeredUser=registeredUser;
    }

    public Student() {
    }


    public Object getLesson() {
        return null;
    }
}
