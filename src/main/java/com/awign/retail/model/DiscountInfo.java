package com.awign.retail.model;

/**
 * Data model class for discount information.
 */
public class DiscountInfo {

    private Double discount;
    private Double totalBill;
    private DiscountType type;

    public DiscountType getType() {
        return type;
    }

    public DiscountInfo setType(DiscountType type) {
        this.type = type;
        return this;
    }

    public double getDiscount() {
        return discount;
    }

    public DiscountInfo setDiscount(double discount) {
        this.discount = discount;
        return this;
    }

    public double getTotalBill() {
        return totalBill;
    }

    public DiscountInfo setTotalBill(double totalBill) {
        this.totalBill = totalBill;
        return this;
    }
}
