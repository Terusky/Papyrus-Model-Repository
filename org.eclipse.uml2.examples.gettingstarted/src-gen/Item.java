
   public class Item {
     private String productName;

     private int quantity;

     private int usPrice;

     private String comment;

     private Date shipDate;

     private SKU partNum;

     private PurchaseOrder order;
 
     public String getProductName() {
       return this.productName;
     }

     public int getQuantity() {
       return this.quantity;
     }

     public int getUsPrice() {
       return this.usPrice;
     }

     public String getComment() {
       return this.comment;
     }

     public Date getShipDate() {
       return this.shipDate;
     }

     public SKU getPartNum() {
       return this.partNum;
     }

     public PurchaseOrder getOrder() {
       return this.order;
     }
 
   }

