package roomallotDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import roomallotmentUtil.DBconnection;

public class RoomDAO {

    public boolean isRoomAvailable(int roomId) throws Exception {

        Connection con = DBconnection.getConnection();

        String sql = "SELECT capacity, occupied FROM room WHERE room_id=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, roomId);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            int capacity = rs.getInt("capacity");
            int occupied = rs.getInt("occupied");
            con.close();
            return occupied < capacity;
        }

        con.close();
        return false;
    }

    public void increaseOccupied(int roomId) throws Exception {

        Connection con = DBconnection.getConnection();

        String sql = "UPDATE room SET occupied = occupied + 1 WHERE room_id=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, roomId);
        ps.executeUpdate();

        con.close();
    }
}