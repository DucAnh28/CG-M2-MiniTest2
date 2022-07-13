import Model.Employee;
import Model.FullTimeEmployee;
import Model.PartTimeEmployee;
import java.util.Arrays;

public class StaffManager {
    public static void main(String[] args) {
        Employee employee1 = new PartTimeEmployee(201, "DucAnh", 22, 969282458, "Yolo", 24);
        Employee employee2 = new PartTimeEmployee(202, "DA", 28, 12382496, "hihi", 18);
        Employee employee3 = new PartTimeEmployee(203, "NgocAnh", 22, 164213030, "bachamchamthan", 30);

        Employee employee4 = new FullTimeEmployee(691, "Hieu", 25, 5555555, "hobaocaochon", 80000, 20000, 2000000);
        Employee employee5 = new FullTimeEmployee(692,"Hiep",27,266191245,"hiepcodonkoloive",100000,0,2000000);
        Employee employee6 = new FullTimeEmployee(693,"PhuongTran",24,91916262,"phuongtranphongbat",200000,0,2000000);

        Employee[] listEmployee = {employee1, employee2, employee3, employee4, employee5, employee6};
//        makelistFeUnderOverageSalary(listEmployee);
//        System.out.println(getTotalPeSalary(listEmployee));
        System.out.println(sortFeInSalary(listEmployee));

    }

    public static double getOverageSalary(Employee[] employees) {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSalary();
        }
        return (sum / employees.length);
    }

    public static void makelistFeUnderOverageSalary(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] instanceof FullTimeEmployee) {
                double salary = ((FullTimeEmployee) employees[i]).getSalary();
                if (salary < getOverageSalary(employees)){
                    System.out.println(employees[i].getName());
                }
            }
        }
    }

    public static double getTotalPeSalary(Employee[] employees) {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] instanceof PartTimeEmployee) {
                sum += ((PartTimeEmployee)employees[i]).getSalary();
            }
        }
        return sum;
    }

    public static Employee[] sortFeInSalary(Employee[] employees) {
        int count = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] instanceof FullTimeEmployee){
                count++;
            }
        }
        Employee[] array = new Employee[count];
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] instanceof FullTimeEmployee){
                for (int j = 0; j < count; j++) {
                    array[j] = (FullTimeEmployee)employees[i];
                }
            }
        }
        return array;
    }
}
