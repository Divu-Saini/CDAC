public class DiscountCalculation {
    public static void main(String[] args) {
        double totalPurchaseAmount = 1200; 
        boolean hasMembershipCard = true; 

      double discountPercentage;
         if (totalPurchaseAmount >= 1000) {
            discountPercentage = 20;
 }
          else if (totalPurchaseAmount >= 500) {
            discountPercentage = 10;
 } 
          else {
            discountPercentage = 5;
 }

       
         if (hasMembershipCard) {
            discountPercentage += 5;
 }

        double discountAmount = (discountPercentage / 100) * totalPurchaseAmount;
        double finalAmount = totalPurchaseAmount - discountAmount;

        System.out.println("Total Purchase Amount: " + totalPurchaseAmount);
        System.out.println("Discount Percentage: " + discountPercentage + "%");
        System.out.println("Discount Amount: Rs." + discountAmount);
        System.out.println("Final Amount After Discount: " + finalAmount);
  }
}
