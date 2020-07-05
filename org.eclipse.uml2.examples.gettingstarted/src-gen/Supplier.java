
   public class Supplier {
     private String name;

     private PurchaseOrder orders;

     private PurchaseOrder pendingOrders;

     private PurchaseOrder shippedOrders;

     private Customer customers;
 
     public String getName() {
       return this.name;
     }

     public PurchaseOrder getOrders() {
       return this.orders;
     }

     public PurchaseOrder getPendingOrders() {
       return this.pendingOrders;
     }

     public PurchaseOrder getShippedOrders() {
       return this.shippedOrders;
     }

     public Customer getCustomers() {
       return this.customers;
     }
 
   }

