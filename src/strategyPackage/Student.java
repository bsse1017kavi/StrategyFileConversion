package strategyPackage;

public class Student
{
    String name;
    String roll;
    String year;
    String department;

    public Student(String name, String roll, String year, String department) {
        this.name = name;
        this.roll = roll;
        this.year = year;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getRoll() {
        return roll;
    }

    public String getYear() {
        return year;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll='" + roll + '\'' +
                ", year='" + year + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
