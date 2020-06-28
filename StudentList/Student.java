public class Student {
    // attributes
    private  String studentID, firstName, lastName, email, major, faculty;

    // constructor
    public Student(){
    }
    public Student(String studentID, String firstName, String lastName, String email, String major, String faculty){
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.major = major;
        this.faculty = faculty;
    }

    // getters
    public String getStudentID() {
        return studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getMajor() {
        return major;
    }

    public String getFaculty() {
        return faculty;
    }

    // setters
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public void setFaculty(String faculty) {
        this.faculty = faculty;
    }

    // toString
    public String toString() {
        return ""+studentID+" "+firstName+" "+lastName+" "+email+" "+major+" "+faculty;
    }
}
