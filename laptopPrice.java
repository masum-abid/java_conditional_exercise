//Problem 3:3 
//Core i 7 HP laptop price is 76000 tk and cash payment discount 10%. What will be the purchase price?

public class laptopPrice {
    public static void main(String[] args) {
        int Price = 76000;
        double discount_Price = Price * 0.10;
        int final_Price = Price - (int)discount_Price;
        System.out.println("The price of the laptop is " + final_Price);
      }
}
