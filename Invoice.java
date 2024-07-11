// Exercise 3.12
// Invoice Class

public class Invoice{
    private String partNumber; // part number
    private String partDescription; // part description
    private int quantity;      // Quantity of item
    private double pricePerItem; // Price per item
    
    public Invoice() {
        partNumber = "None";
        partDescription = "None";
        quantity = 0;
        pricePerItem = 0.0;   
    }

    public String getPartNumber(){
        return partNumber;
    }
    public String getpartDescription(){
        return partDescription;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getPricePerItem(){
        return pricePerItem;
    }
  
    public void setPartNumber(String partNumber){
        this.partNumber = partNumber;
    }
    public void setPartDescription(String partDescription){
        this.partDescription = partDescription;
    }
    public void setQuantity(int quantity){
        this.quantity = quantity;        
    }
    public void setPricePerItem(double pricePerItem){
        this.pricePerItem = pricePerItem;        
    }
    public double getInvoiceAmount(){
        return (quantity * pricePerItem);
    } 
}