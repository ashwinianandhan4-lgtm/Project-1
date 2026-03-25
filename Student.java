package roomallotmentEntity;

public class Student {

    private int studentId;
    private String name;
    private String course;
    private int roomId;

    public Student() {}

    public Student(int studentId, String name, String course, int roomId) {
        this.studentId = studentId;
        this.name = name;
        this.course = course;
        this.roomId = roomId;
    }

    public int getStudentId() { return studentId; }
    public String getName() { return name; }
    public String getCourse() { return course; }
    public int getRoomId() { return roomId; }
}