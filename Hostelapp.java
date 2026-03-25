package roomallotmentMain;

import java.util.Scanner;

import roomallotmentEntity.Student;
import roomallotmentServices.StudentServices;

public class Hostelapp {

    public static void main(String[] args) throws Exception {  

        Scanner sc = new Scanner(System.in);
        StudentServices service = new StudentServices();

        System.out.println("Enter Student ID:");
        int id = sc.nextInt();

        System.out.println("Enter Name:");
        String name = sc.next();

        System.out.println("Enter Course:");
        String course = sc.next();

        System.out.println("Enter Room ID:");
        int roomId = sc.nextInt();

        Student s = new Student(id, name, course, roomId);

        service.allocateRoom(s);

        sc.close();
    }
}