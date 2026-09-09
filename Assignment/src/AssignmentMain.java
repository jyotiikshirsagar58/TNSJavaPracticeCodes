import com.jyoti.assignment.employees.Manager;
import com.jyoti.assignment.employees.Developer;
import com.jyoti.assignment.utilities.EmployeeUtilities;

public class AssignmentMain {

	public static void main(String[] args) {
		Manager manager = new Manager(
                "Jyoti", 101, 50000, "IT"
        );

        Developer developer = new Developer(
                "Tejuu", 102, 45000, "Java"
        );

        EmployeeUtilities utilities = new EmployeeUtilities();

        System.out.println("----- Manager Details -----");
        manager.displayManagerDetails();

        System.out.println();

        System.out.println("----- Developer Details -----");
        developer.displayDeveloperDetails();

        System.out.println();

        System.out.println("----- Employee Utility -----");
        utilities.displayEmployee(manager);

        System.out.println();

        utilities.increaseSalary(developer, 5000);
	}

}
