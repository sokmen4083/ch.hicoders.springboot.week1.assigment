package School;

import Classroom.Classroom;
import Student.Student;
import Teacher.Teacher;

import java.time.LocalDate;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Student[] students = createStudent(2);
        Teacher[] teachers = createTeacher(2);
        Classroom[] classrooms = createClassroom(1);
        allOfStudents(students,teachers,classrooms);


    }

    private static Student[] createStudent(int n){
        Student[] students = new Student[n];
        for (int i = 0 ; i < n ; i++){
            Student student = new Student();
            createName(student, i);
            createBirthday(student, i);
            students[i] = student;
        }
        return students;
    }

    private static Teacher[] createTeacher(int n){
        Teacher[] teachers = new Teacher[n];
        for (int i = 0 ; i < n ; i++){
            Teacher teacher = new Teacher();
            createTeacherName(teacher, i);
            createSpecialty(teacher, i);
            createTeacherBirthday(teacher, i);
            teachers[i] = teacher;
        }
        return teachers;
    }

    private static Classroom[] createClassroom(int n){
        Classroom[] classrooms = new Classroom[n];
        for (int i = 0 ; i < n ; i++){
            Classroom classroom = new Classroom();
            createClassroomName(classroom, i);
            classrooms[i] = classroom;
        }
        return classrooms;
    }

    private static void allOfStudents(Student[] pStudent, Teacher[] pTeacher, Classroom[] pClassroom){
        for(Student student:pStudent){
            String studentFirstName = student.getFirstName();
            String studentLastName = student.getLastName();
            int studentBirthday = student.getBirthday();
            String viewOfRegistration = " " + studentFirstName + " " + studentLastName + " " + studentBirthday;
            System.out.println("STUDENTS: " + viewOfRegistration);
        }
        for(Teacher teacher:pTeacher){
            String teacherFirstName = teacher.getFirstName();
            String teacherLastName = teacher.getLastName();
            String specialty = teacher.getSpecialty();
            int teacherBirthday = teacher.getBirthday();
            String viewOfRegistration = " " + teacherFirstName + " " + teacherLastName + " "+ specialty + " " +  teacherBirthday;
            System.out.println("TEACHERS: " + viewOfRegistration);
        }
        for(Classroom classroom:pClassroom){
            String classroomName = classroom.getName();
            String viewOfRegistration = " " + classroomName;
            System.out.println("CLASSROOMS: " + viewOfRegistration);
        }
    }

    private static void createName(Student pStudent, int pI){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + (pI+1) + ". student firstname: ");
        String firstName = scanner.nextLine();
        while (firstName.length() <= 0){
            System.out.println(" Please enter valid firstname!!!");
            firstName = scanner.nextLine();
        }
        pStudent.setFirstName(firstName);
        System.out.println("Enter " + (pI+1) + ". student lastname: ");
        String lastName = scanner.nextLine();
        while (lastName.length() <= 0){
            System.out.println(" Please enter valid lastname!!!");
            lastName = scanner.nextLine();
        }
        pStudent.setLastName(lastName);
    }
    private static void createBirthday(Student pStudent, int pI){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + (pI+1) + ". student age: ");
        int studentAge = scanner.nextInt();
        pStudent.setBirthday(studentAge);
    }

    private static void createTeacherName(Teacher pTeacher, int pI){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + (pI+1) + ". teacher firstname: ");
        String firstName = scanner.nextLine();
        while (firstName.length() <= 0){
            System.out.println(" Please enter valid firstname!!!");
            firstName = scanner.nextLine();
        }
        pTeacher.setFirstName(firstName);
        System.out.println("Enter " + (pI+1) + ". teacher lastname: ");
        String lastName = scanner.nextLine();
        while (lastName.length() <= 0){
            System.out.println(" Please enter valid lastname!!!");
            lastName = scanner.nextLine();
        }
        pTeacher.setLastName(lastName);
    }
    private static void createTeacherBirthday(Teacher pTeacher, int pI){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + (pI+1) + ". teacher age: ");
        int studentAge = scanner.nextInt();
        pTeacher.setBirthday(studentAge);
    }
    private static void createSpecialty(Teacher pTeacher, int pI){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + (pI+1) + ". Specialty: ");
        String specialty = scanner.nextLine();
        pTeacher.setSpecialty(specialty);
    }
    private static void createClassroomName(Classroom pClassroom, int pI){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter " + (pI+1) + ". Classroom Name: ");
        String classroomName = scanner.nextLine();
        while (classroomName.length() <= 0){
            System.out.println(" Please enter valid Classroom Name:!!!");
            classroomName = scanner.nextLine();
        }
    }

}
