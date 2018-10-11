import java.util.Scanner;


class Customer {
    String customerName;
    String customerPhone;
    String customerAddress;
    double squareFootage;

    public Customer(String customerName, String customerPhone, String customerAddress, double squareFootage) {
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.customerAddress = customerAddress;
        this.squareFootage = squareFootage;
    }
    public void customerInfo(){
        System.out.println("Customer Name: " + customerName  + "\n" + "Customer Phone Number: " + customerPhone
                + "\n" + "Customer Address: " + customerAddress);
    }
}
class Commercial extends Customer {
    String propertyName;
    double commercialweeklyCharges;
    boolean multiProperty;
    double commercialRateFinal = 5 * (squareFootage / 1000);

    public Commercial(String propertyName, String customerName ,
                      String customerPhone, String customerAddress, double squareFootage, boolean multiProperty) {
        super(customerName, customerPhone, customerAddress, squareFootage);

        this.propertyName = propertyName;
        this.multiProperty = multiProperty;
    }

    public void commercialweeklyCharges() {
        if (multiProperty == true){
            commercialweeklyCharges = commercialRateFinal * 0.9;
            System.out.println(commercialweeklyCharges);
        }else{
            System.out.println(commercialRateFinal);
        }
        super.customerInfo();
        System.out.println("Property Name : " + propertyName +
                "Multi Property: " + true + "Weekly Charges: " + commercialweeklyCharges);
    }
}

class Residential extends Customer {
    double residentialRate = 6 * (squareFootage / 1000);
    boolean seniorField;
    double residentialweeklyCharges;

    public Residential(String customerName, String customerPhone, String customerAddress, double squareFootage,
                       boolean seniorField) {
        super(customerName, customerPhone, customerAddress, squareFootage);

        this.seniorField = seniorField;
    }

    public void residentialweeklyCharges() {
        if (seniorField == true) {
            residentialweeklyCharges = residentialRate * 0.85;
        } else {
            System.out.println(residentialRate);
        }
        super.customerInfo();
        System.out.println("Senior Field: " + true + "Weekly Charges: "
                + residentialweeklyCharges);
    }

}







