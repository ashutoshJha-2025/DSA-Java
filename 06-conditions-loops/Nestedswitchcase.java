import java.util.*;
public class Nestedswitchcase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int empID = sc.nextInt();
        String department = sc.nextLine();

        switch (empID) {
            case 1: System.out.println("kunal kushwaha");
            break;
            case 2: System.out.println("ashutosh jha");
            break;
            case 3: switch (department) {
                case "IT": System.out.println("IT department");
                break;
                case "management": System.out.println("management department");  
                break;          
                default:System.out.println("no department entered");
            }
            default: System.out.println("enter correct empID");
        }
    
    }
}
