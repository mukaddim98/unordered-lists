public class StudentList {
    // attributes
    private List<Student> students;

    // constructor
    public StudentList(){
        students = new List<Student>();
    }

    // Add a student record to the list
    public void addRecord(Student s){
        students.add(s);
    }

    // Delete a student record with the specified ID number
    public void deleteRecord(int ID){
        Student delStd = students.first();
        while(delStd!=null){
            if(delStd.getStudentID().equals(ID)){
                students.remove(delStd);
                break;
            }
            delStd = students.next();
        }
    }

    //  Display records of all the students taking a specified major
    public void displayMajors(String major){
        Student std = students.first();
        while(std!=null){
            if(std.getMajor().equals(major)){
                System.out.println(std);
            }
            std = students.next();
        }
    }

    // Display records of all students belonging to a particular faculty.
    public void displayFaculty(String faculty){
        Student std = students.first();
        while(std!=null){
            if(std.getFaculty().equals(faculty)){
                System.out.println(std);
            }
            std = students.next();
        }
    }

    // Display records of all students with the specified last name.
    public void displayName(String lName){
        Student std = students.first();
        while(std!=null){
            if(std.getLastName().equals(lName)){
                System.out.println(std);
            }
            std = students.next();
        }
    }

    // Search for a student’s record given an ID number
    public Student searchID(int ID){
        Student std = students.first();
        while(std!=null){
            if(std.getStudentID().equals(""+ID)){
                return std;
            }
            std = students.next();
        }
        return null;
    }

    // Get the first Student record
    public Student first()
    {
        return students.first();
    }

    // Get the next Student record
    public Student next()
    {
        return students.next();
    }

    // Display Student records
    public void display()
    {
        Student std = students.first();
        while(std!=null){
            System.out.println(std);
            std = students.next();
        }
    }

}
