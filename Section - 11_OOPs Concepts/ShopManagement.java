/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dell
 */

class Product{
    private int itemNo;
    private String name;
    private int price;
    private int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getItemNo() {
        return itemNo;
    }
    
    //Constructors 
    
    public Product(int itemNo,String name,int price,int quantity){
        this.itemNo = itemNo;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    @Override
    public String toString(){
        return String.format("Item Number: %d\nItem Name %s\nPrice %d\nQuantity : %d\n",itemNo,name,price,quantity);
    }
}

class Customer{
    
    private int custNo;
    private String address;
    private String name;
    private int phno;

    public int getCustNo() {
        return custNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhno() {
        return phno;
    }

    public void setPhno(int phno) {
        this.phno = phno;
    }
    
    public Customer(int custId,String name,String address,int phno){
        this.custNo = custId;
        this.name = name;
        this.address = address;
        this.phno = phno;
    }
    
    @Override
    public String toString(){
        return String.format("Customer Number: %d\nCustomer Name %s\nAddress %s\nContact : %d\n",custNo,name,address,phno);
    }
}

public class ShopManagement {
    public static void main(String[] args) {
        Product product = new Product(121,"Television",25000,45);
        Customer customer = new Customer(1101,"Akshay","XYZ",253647895);
        
        System.out.println(product.toString());
        System.out.println(customer.toString());
    }
}
