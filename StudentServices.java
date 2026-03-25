package roomallotmentServices;

import roomallotDAO.StudentDAO;
import roomallotmentEntity.Student;

public class StudentServices {

    StudentDAO studentDAO = new StudentDAO();
    RoomServices roomServices = new RoomServices();

    public void allocateRoom(Student s) throws Exception {

        if (roomServices.checkRoom(s.getRoomId())) {

            studentDAO.addStudent(s);
            roomServices.updateRoom(s.getRoomId());

            System.out.println("Room allocated successfully");

        } else {
            System.out.println("Room is full");
        }
    }
}