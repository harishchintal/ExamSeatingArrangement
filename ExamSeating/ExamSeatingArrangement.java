import java.util.*;

class Student {
    String name;
    int rollNumber;

    Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    @Override
    public String toString() {
        return "Roll Number: " + rollNumber + ", Name: " + name;
    }
}

public class ExamSeatingArrangement {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 101));
        students.add(new Student("Bob", 102));
        students.add(new Student("Charlie", 103));
        // Add more students as needed

        List<Integer> availableSeats = new ArrayList<>();
        availableSeats.add(1);
        availableSeats.add(2);
        availableSeats.add(3);
        // Add more seats as needed

        // Shuffle the list of students randomly to create a random seating arrangement
        Collections.shuffle(students);

        // Assign seats to students
        int seatIndex = 0;
        for (Student student : students) {
            if (seatIndex >= availableSeats.size()) {
                System.out.println("Not enough seats for all students.");
                break;
            }

            int seatNumber = availableSeats.get(seatIndex);
            seatIndex++;

            System.out.println(student.name + " (Roll Number: " + student.rollNumber + ") is assigned to Seat " + seatNumber);
        }
    }
}
