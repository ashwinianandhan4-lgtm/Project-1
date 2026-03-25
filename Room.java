package roomallotmentEntity;

public class Room {

    private int roomId;
    private String roomType;
    private int capacity;
    private int occupied;

    public Room() {}

    public Room(int roomId, String roomType, int capacity, int occupied) {
        this.roomId = roomId;
        this.roomType = roomType;
        this.capacity = capacity;
        this.occupied = occupied;
    }

    public int getRoomId() { return roomId; }
    public String getRoomType() { return roomType; }
    public int getCapacity() { return capacity; }
    public int getOccupied() { return occupied; }
}

	   