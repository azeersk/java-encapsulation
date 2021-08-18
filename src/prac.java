public class prac {
        private String customerId;
        private String customerName;
        private long contactNumber;
        private String address;
        public void Customer_details(String customerId,String customerName,long contactNumber,String address){
            this.customerId = customerId;
            this.customerName = customerName;
            this.contactNumber = contactNumber;
            this.address = address;
        }
        public String setCustomer_id(){
            return customerId;
        }
        public String setCustomer_name() {
            return customerId;
        }
        public String contact_Number(){
            return customerId;
        }
        public String address_of(){
            return customerId;
        }
    }
class Tester {
    public static void main(String args[]) {
        prac customer = new prac();
        customer.Customer_details("C101","Jack",9870345687L,"D089, St. Louis Street, Springfield");
        System.out.println("Displaying customer details");
        System.out.println("Customer Id : " + customer.setCustomer_id());
        System.out.println("Customer Name : " + customer.setCustomer_name());
        System.out.println("Contact Number : " + customer.contact_Number());
        System.out.println("Address : " + customer.address_of());
    }
}