
public class Main {

    public static void main(String[] args) {

        String productName = "Headphones";
        double productPrice = 2500.0;
        int quantity = 2;
        int customerCategory = 1;
        boolean membershipStatus = true;
        double taxPercentage = 18.0;
        double deliveryCharge = 100.0;

        double regularDiscount = 5.0;
        double studentDiscount = 10.0;
        double premiumDiscount = 15.0;
        double membershipDiscountPercentage = 5.0;

        double originalAmount = productPrice * quantity;

        double customerDiscountPercentage = 0.0;

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

        double customerDiscount = originalAmount * customerDiscountPercentage / 100.0;

        double membershipDiscount = 0.0;

        if (membershipStatus) {

            if (customerCategory >= 1 && customerCategory <= 3) {
                membershipDiscount
                        = originalAmount * membershipDiscountPercentage / 100.0;
            }
        }

        double amountAfterDiscount
                = originalAmount - customerDiscount - membershipDiscount;

        double taxAmount
                = amountAfterDiscount * taxPercentage / 100.0;

        double finalPayableAmount
                = amountAfterDiscount + taxAmount + deliveryCharge;

        boolean eligibleForBenefit
                = finalPayableAmount < 10000 && membershipStatus;

        String benefitStatus = eligibleForBenefit
                ? "Membership benefit applied."
                : "No membership benefit.";

        int roundedFinalAmount = (int) finalPayableAmount;

        roundedFinalAmount += 0;

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
