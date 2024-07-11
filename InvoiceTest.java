// Exercise 3.12
// InvoiceTest Class
    
import java.util.Scanner;

public class InvoiceTest{     
    public static void main (String[] args) {
        Scanner scnr = new Scanner(System.in);
        String partNum;
        String partDescr;
        int quantity;
        double price;

        Invoice invoiceOne = new Invoice();
        Invoice invoiceTwo = new Invoice();
        Invoice invoiceThree = new Invoice();
        Invoice invoiceFour = new Invoice();


        System.out.println("Invoice #1");
        System.out.print("Enter the part number: ");
        partNum = scnr.nextLine();

        System.out.print("Enter the part description: ");
        partDescr = scnr.nextLine();

        System.out.print("Enter the quantity: ");
        quantity = scnr.nextInt();

        System.out.print("Enter the price: ");
        price = scnr.nextDouble();

        System.out.println("");

        invoiceOne.setPartNumber(partNum);
        invoiceOne.setPartDescription(partDescr);
        invoiceOne.setQuantity(quantity);
        invoiceOne.setPricePerItem(price);


        System.out.println("Invoice #2");
        System.out.print("Enter the part number: ");
        scnr.nextLine();
        partNum = scnr.nextLine();

        System.out.print("Enter the part description: ");
        partDescr = scnr.nextLine();

        System.out.print("Enter the quantity: ");
        quantity = scnr.nextInt();

        System.out.print("Enter the price: ");
        price = scnr.nextDouble();

        System.out.println("");

        invoiceTwo.setPartNumber(partNum);
        invoiceTwo.setPartDescription(partDescr);
        invoiceTwo.setQuantity(quantity);
        invoiceTwo.setPricePerItem(price);


        System.out.println("Invoice #3");
        System.out.print("Enter the part number: ");
        scnr.nextLine();
        partNum = scnr.nextLine();

        System.out.print("Enter the part description: ");
        partDescr = scnr.nextLine();

        System.out.print("Enter the quantity: ");
        quantity = scnr.nextInt();

        System.out.print("Enter the price: ");
        price = scnr.nextDouble();

        System.out.println("");

        invoiceThree.setPartNumber(partNum);
        invoiceThree.setPartDescription(partDescr);
        invoiceThree.setQuantity(quantity);
        invoiceThree.setPricePerItem(price);


        System.out.println("Invoice #4");
        System.out.print("Enter the part number: ");
        scnr.nextLine();
        partNum = scnr.nextLine();

        System.out.print("Enter the part description: ");
        partDescr = scnr.nextLine();

        System.out.print("Enter the quantity: ");
        quantity = scnr.nextInt();

        System.out.print("Enter the price: ");
        price = scnr.nextDouble();

        System.out.println("");

        invoiceFour.setPartNumber(partNum);
        invoiceFour.setPartDescription(partDescr);
        invoiceFour.setQuantity(quantity);
        invoiceFour.setPricePerItem(price);


        System.out.println("Invoice # 1 Information");
        System.out.println("Part number: " + invoiceOne.getPartNumber());
        System.out.println("Description: " + invoiceOne.getpartDescription());
        System.out.println("Quantity: " + invoiceOne.getQuantity());
        System.out.println("Price: $" + invoiceOne.getPricePerItem());
        System.out.printf("Invoice amount: $%.2f", invoiceOne.getInvoiceAmount());
        System.out.println("\n--------------------------------\n");
        

        invoiceOne.setPartNumber(partNum);
        invoiceOne.setPartDescription(partDescr);
        invoiceOne.setQuantity(quantity);
        invoiceOne.setPricePerItem(price);


    
        System.out.println("Invoice # 2 Information");
        System.out.println("Part number: " + invoiceTwo.getPartNumber());
        System.out.println("Description: " + invoiceTwo.getpartDescription());
        System.out.println("Quantity: " + invoiceTwo.getQuantity());
        System.out.println("Price: $" + invoiceTwo.getPricePerItem());
        System.out.printf("Invoice amount: $%.2f", invoiceTwo.getInvoiceAmount());
        System.out.println("\n--------------------------------\n");

        invoiceTwo.setPartNumber(partNum);
        invoiceTwo.setPartDescription(partDescr);
        invoiceTwo.setQuantity(quantity);
        invoiceTwo.setPricePerItem(price);


    
        System.out.println("Invoice # 3 Information");
        System.out.println("Part number: " +invoiceThree.getPartNumber());
        System.out.println("Description: " +invoiceThree.getpartDescription());
        System.out.println("Quantity: " +invoiceThree.getQuantity());
        System.out.println("Price: $" +invoiceThree.getPricePerItem());
        System.out.printf("Invoice amount: $%.2f", invoiceThree.getInvoiceAmount());
        System.out.println("\n--------------------------------\n");


        invoiceThree.setPartNumber(partNum);
        invoiceThree.setPartDescription(partDescr);
        invoiceThree.setQuantity(quantity);
        invoiceThree.setPricePerItem(price);


    
        System.out.println("Invoice # 4 Information");
        System.out.println("Part number: " +invoiceFour.getPartNumber());
        System.out.println("Description: " +invoiceFour.getpartDescription());
        System.out.println("Quantity: " +invoiceFour.getQuantity());
        System.out.println("Price: $" +invoiceFour.getPricePerItem());
        System.out.printf("Invoice amount: $%.2f", invoiceFour.getInvoiceAmount());
        System.out.println("\n--------------------------------\n");


        invoiceFour.setPartNumber(partNum);
        invoiceFour.setPartDescription(partDescr);
        invoiceFour.setQuantity(quantity);
        invoiceFour.setPricePerItem(price);
        
    }
}