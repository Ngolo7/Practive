
public class SalaryScale {
    public static void main(String[] args) {

        Scale employeeObj1 = new Scale();
        Scale employeeObj2 = new Scale();
        Scale employeeObj3 = new Scale();
        Scale employeeObj4 = new Scale();
        Scale employeeObj5 = new Scale();
        Scale employeeObj6 = new Scale();

        employeeObj1.setEmployee("Sandy", 60000);
        employeeObj2.setEmployee("Yangchen", 45000);
        employeeObj3.setEmployee("Suresh", 50000);
        employeeObj4.setEmployee("Dawa", 19500);
        employeeObj5.setEmployee("Unknown",0);
        employeeObj5.setEmployee("Mike",350000);



        //employeeObj.SalaryScale();



    }
}
class Scale {
    String name;
    private double YourSalary;
    double MinimumSalary = 20000;
    double CommonSalary = 50000;

    void setEmployee(String n, double s){
        name = n;
       YourSalary = s;
        System.out.println("Name of the Employee is :"+name);
        System.out.println(name+ "salary is :" +s);
        salaryScale();
        System.out.println("----------------------");
    }

    char salaryScale() {
        if (YourSalary <= 0)
            System.out.println("Invalid salary");

        else if (YourSalary <= MinimumSalary) {
            System.out.println(name+ "salary Scale is :" + 'L');
            return 'L';
        }
        else if (YourSalary > MinimumSalary && YourSalary<= CommonSalary) {
            System.out.println(name+ "salary Scale is :" + 'M');
            return 'M';
        }
        else {
            System.out.println(name + "salary Scale is :" + 'H');
            return 'H';
        }
        return 0;
    }
}






