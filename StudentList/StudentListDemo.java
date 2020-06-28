import java.io.*;
import java.util.Scanner;

public class StudentListDemo {
    public static void main(String[] args) throws IOException {
        // extracting data from file
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the filename to read from: ");
        String filename = keyboard.nextLine();

        File file = new File(filename);
        Scanner inputFile = new Scanner(file);

        StudentList sepstudents = new StudentList();
        String ID, fName, lName, email, major, faculty;
        String[] entry;
        Student std=null;

        while (inputFile.hasNext())
        {
            entry = inputFile.nextLine().split(" ");
            ID = entry[0];
            fName = entry[1];
            lName = entry[2];
            email = entry[3];
            major = entry[4];
            faculty = entry[5];

            std = new Student(ID,fName,lName,email,major,faculty);
            sepstudents.addRecord(std);
        }

        inputFile.close();

        // test to see of all the records were imported from the file
        System.out.println("All Student from the file:");
        sepstudents.display();

        // test to add a record
        System.out.println("\nAfter a new Student is added:");
        std = new Student("804319", "Abdullah", "Al Mukaddim", "ab845312@dal.ca", "CS", "CS");
        sepstudents.addRecord(std);
        sepstudents.display();

        // test to delete a record
        System.out.println("\nAfter a Student is deleted with ID 200120:");
        sepstudents.deleteRecord(200120);
        sepstudents.display();

        // test to display Major
        System.out.println("\nDisplaying Students with Major in Music:");
        sepstudents.displayMajors("Music");

        // test to display Faculty
        System.out.println("\nDisplaying Students of Faculty of Arts:");
        sepstudents.displayFaculty("Arts");

        // test to display Last Name
        System.out.println("\nDisplaying Students with Last Name being Smith:");
        sepstudents.displayName("Smith");

        // test to search a Student
        System.out.println("\nSearching a student with ID 804319:");
        Student findStd = sepstudents.searchID(804319);
        System.out.println(findStd);



    }
}
