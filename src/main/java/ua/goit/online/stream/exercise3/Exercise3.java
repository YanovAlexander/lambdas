package ua.goit.online.stream.exercise3;

import ua.goit.online.stream.Student;

import java.util.List;

public class Exercise3 {
    public List<Student> getStudents() {
        return List.of(new Student(1, "Eric", "Cantona", 31),
                new Student(2, "David", "Beckham", 28),
                new Student(3, "Luis", "Suares", 33),
                new Student(4, "Zinedine", "Zidane", 28),
                new Student(4, "Zinedine", "Zidane", 31),
                new Student(4, "Zinedine", "Zidane", 33));
    }
}
