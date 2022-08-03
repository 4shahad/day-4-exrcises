package T2B3;

public class Employee {
    int Id;
    int Salary ;
    String fristName ;
    String lastName ;



    public Employee(int id, int salary, String fristName,
                    String lastName ) {
        Id = id;
        Salary = salary;
        this.fristName = fristName;
        this.lastName = lastName;


    }

    public int getId() {
        return Id;
    }

    public int getSalary() {
        return Salary;
    }

    public String getFristName() {
        return fristName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getName() {
        String Name= fristName+lastName;
        return Name;
    }

    public int getAnnualSalary() {
        int AnnualSalary = Salary*12;
        return AnnualSalary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "Id=" + Id +
                ", Salary=" + Salary +
                ", fristName='" + fristName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';

    }
    public int raiseSalary(double Percent){
        final double v = Salary * Percent;
        int newSalery= (int) v+Salary;

        return newSalery;
    }
}
