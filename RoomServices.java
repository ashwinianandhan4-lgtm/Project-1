package roomallotmentServices;

import roomallotDAO.RoomDAO;

public class RoomServices {

    RoomDAO roomDAO = new RoomDAO();

    public boolean checkRoom(int roomId) throws Exception {
        return roomDAO.isRoomAvailable(roomId);
    }

    public void updateRoom(int roomId) throws Exception {
        roomDAO.increaseOccupied(roomId);
    }
}