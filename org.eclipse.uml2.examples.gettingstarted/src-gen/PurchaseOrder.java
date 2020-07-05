
   public class PurchaseOrder {
     private String comment;

     private Date orderDate;

     private OrderStatus status;

     private int totalAmount;

     private Customer customer;

     private PurchaseOrder previousOrder;

     private Item items;

     private Address billTo;

     private Address shipTo;
 
     public String getComment() {
       return this.comment;
     }

     public Date getOrderDate() {
       return this.orderDate;
     }

     public OrderStatus getStatus() {
       return this.status;
     }

     public int getTotalAmount() {
       return this.totalAmount;
     }

     public Customer getCustomer() {
       return this.customer;
     }

     public PurchaseOrder getPreviousOrder() {
       return this.previousOrder;
     }

     public Item getItems() {
       return this.items;
     }

     public Address getBillTo() {
       return this.billTo;
     }

     public Address getShipTo() {
       return this.shipTo;
     }
 
   }

