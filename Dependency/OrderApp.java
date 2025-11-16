package Question04;

// Payment Class
class Payment{
    private double amount;

    public boolean isValid(){
        if(amount>=0)
            return true;

        return false;
    }

    public Payment(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}

//Order Class
class Order{
   public void processPayment(Payment payment){
       boolean status =payment.isValid();
       if (status==true){
           System.out.println("Payment of $" + payment.getAmount() + " processed successfully");
       }
       else{
           System.out.println("Payment of $" + payment.getAmount() + " rejected: invalid amount");
       }
   }
}

//Class with the main method
public class OrderApp {
    public static void main(String[] args) {
        Payment payment = new Payment(50);
        Payment payment2 = new Payment(-10);

        Order order = new Order();
        order.processPayment(payment);
        order.processPayment(payment2);
    }
}
