package Question02;
//Customer class
class Customer {
    // customer's attributes
    private String customerId;

    //returns the customerId
    public String getCustomerId() {
        return customerId;
    }

    //customer constructor

    public Customer(String customerId) {
        this.customerId = customerId;
    }
}

//Order class
class Order {
    // order's attributes
    private String orderId;
    private double amount;
    private Customer customer;

    //order constructor

    public Order(String orderId, double amount, Customer customer) {
        this.orderId = orderId;
        this.amount = amount;
        this.customer = customer;
    }

    //method to display order information
    public void displayOrderInfo(){
        System.out.println("Order ID: " + orderId + ", Customer ID: " + customer.getCustomerId() + ", Amount : $" + amount);
    }
}

//class with the main method
public class OrderApp {
    public static void main(String[] args) {
        Customer c1 = new Customer("CUST001");
        Order o1 = new Order("ORD001", 150.5, c1);
        o1.displayOrderInfo();
    }
}
