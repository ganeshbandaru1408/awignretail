package com.awign.retail.service;

import com.awign.retail.model.DiscountInfo;
import com.awign.retail.model.PaymentInfo;

/**
 * Service, which calculates a discount for a payment based on the payment properties.
 */
public interface DiscountService {

    /**
     * Calculates a discount based on a PaymentInfo.
     */
    DiscountInfo calculateDiscount(PaymentInfo paymentInfo);
}
