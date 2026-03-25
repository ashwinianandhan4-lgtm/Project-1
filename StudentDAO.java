package roomallotDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;

import roomallotmentEntity.Student;
import roomallotmentUtil.DBconnection;

public class StudentDAO {

    public void addStudent(Student s) throws Exception {

        Connection con = DBconnection.getConnection();

        String sql = "INSERT INTO student VALUES (?, ?, ?, ?)";
        PreparedStatement ps = con.prepareStatement(sql);

        ps.setInt(1, s.getStudentId());
        ps.setString(2, s.getName());
        ps.setString(3, s.getCourse());
        ps.setInt(4, s.getRoomId());

        ps.executeUpdate();
        con.close();
    }
}