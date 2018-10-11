import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

            Customer cust1 = new Customer("Joe", "567-566-3456", "jii 34 road",
                    878);
            Commercial cust2 = new Commercial("dsjh", "hel", "432833",
                    "2364 road", 43953, true);
            Residential cust3 = new Residential("Brian", "566-465-6789", "406 w road",
                    3456, true);

            //cust1.customerInfo();
            //cust2.commercialweeklyCharges();

            Scanner scanner = new Scanner(System.in);
            int input = 1;
            while (input == 1) {
                System.out.println("1. Commercial");
                System.out.println("2. Residential");
                System.out.println("Enter a number between 1-2");
                int choice = scanner.nextInt();


                switch (choice) {
                    case 1:
                        //System.out.println(cust2);
                        Commercial();
                        break;
                    case 2:
                        //System.out.println(cust3);
                        Residential();
                    default:
                        System.out.println("Enter a number between 1-2");

                }

            }


        }

    private static void Commercial() {
        boolean multiProperty;


        Scanner scanner = new Scanner(System.in);
        System.out.println("Commercial Customer");
        System.out.println("Enter a property name: ");
        String propertyName = scanner.nextLine();
        System.out.println("Enter a customer name: ");
        String customerName = scanner.nextLine();
        System.out.println("Enter a customer phone number: ");
        String customerPhone = scanner.nextLine();
        System.out.println("Enter a customer address: ");
        String customerAddress = scanner.nextLine();
        System.out.println("Enter the square footage property: ");
        String foot = scanner.nextLine();
        Double squareFootage = Double.parseDouble(foot);
        System.out.println("Type true if there is a multi-property discount: ");
        String discount = scanner.nextLine();
        if (discount.substring(0, 1).equals("t") || discount.substring(0, 1).equals("T")) {
            multiProperty = true;
        } else {
            multiProperty = false;
        }

        Commercial customer = new Commercial(propertyName, customerName, customerPhone, customerAddress, squareFootage, multiProperty);
        customer.commercialweeklyCharges();

    }

   private static void Residential(){
        Scanner scanner = new Scanner(System.in);
        boolean seniorField;

        //Scanner scanner = new Scanner(System.in);
        System.out.println("Residential Customer");
        System.out.println("Enter a customer name: ");
        String customerName = scanner.nextLine();
        System.out.println("Enter a customer phone number: ");
        String customerPhone = scanner.nextLine();
        System.out.println("Enter a customer address: ");
        String customerAddress = scanner.nextLine();
        System.out.println("Enter the square footage property: ");
        String foot = scanner.nextLine();
        Double squareFootage = Double.parseDouble(foot);
        System.out.println("Type true if there is a senior field discount: ");
        String discount = scanner.nextLine();
        if (discount.substring(0, 1).equals("t") || discount.substring(0, 1).equals("T")) {
            seniorField = true;
        } else {
            seniorField = false;
        }

        Residential customer = new Residential(customerName, customerPhone, customerAddress, squareFootage, seniorField);
        customer.residentialweeklyCharges();
    }
    }



