
public class ProductPurchaseCalculator {

    public static void main(String[] args) {

        // Hard-coded details
        String productName = "Laptop Bag";
        double productPrice = 1800.0;
        int quantity = 3;
        int customerCategory = 2; // 1-Regular, 2-Student, 3-Premium
        boolean membershipStatus = false;
        double taxPercentage = 18.0;
        double deliveryCharge = 120.0;

        // Discount values
        double regularDiscount = 5.0;
        double studentDiscount = 10.0;
        double premiumDiscount = 15.0;
        double membershipDiscountPercentage = 5.0;

        // Arithmetic operator
        double originalAmount = productPrice * quantity;

        // Variable to store customer discount percentage
        double customerDiscountPercentage = 0.0;

        // Switch statement
        switch (customerCategory) {

            case 1:
                customerDiscountPercentage = regularDiscount;
                break;

            case 2:
                customerDiscountPercentage = studentDiscount;
                break;

            case 3:
                customerDiscountPercentage = premiumDiscount;
                break;

            default:
                customerDiscountPercentage = 0.0;
                System.out.println("Invalid customer category");
        }

        // Customer discount
        double customerDiscount
                = originalAmount * customerDiscountPercentage / 100.0;

        // Nested condition + logical operator
        double membershipDiscount = 0.0;

        if (membershipStatus) {

            if (customerCategory >= 1 && customerCategory <= 3) {
                membershipDiscount
                        = originalAmount * membershipDiscountPercentage / 100.0;
            }
        }

        // Amount after discount
        double amountAfterDiscount
                = originalAmount - customerDiscount - membershipDiscount;

        // Tax calculation
        double taxAmount
                = amountAfterDiscount * taxPercentage / 100.0;

        // Final amount
        double finalPayableAmount
                = amountAfterDiscount + taxAmount + deliveryCharge;

        // Relational operator + logical operator
        boolean eligibleForBenefit
                = finalPayableAmount < 10000 && membershipStatus;

        // Ternary operator
        String benefitStatus = eligibleForBenefit
                ? "Membership benefit applied."
                : "No membership benefit available.";

        // Type casting
        int roundedFinalAmount = (int) finalPayableAmount;

        // Assignment operator
        roundedFinalAmount += 0;

        // Output
        System.out.println("PURCHASE BILL");
        System.out.println();

        System.out.println("Product: " + productName);
        System.out.println("Original Amount: " + originalAmount);
        System.out.println("Customer Discount: " + customerDiscount);
        System.out.println("Membership Discount: " + membershipDiscount);
        System.out.println("Amount After Discount: " + amountAfterDiscount);
        System.out.println("Tax Amount: " + taxAmount);
        System.out.println("Delivery Charge: " + deliveryCharge);

        System.out.println();
        System.out.println("Final Payable Amount: " + finalPayableAmount);
        System.out.println("Benefit Status: " + benefitStatus);
    }
}
