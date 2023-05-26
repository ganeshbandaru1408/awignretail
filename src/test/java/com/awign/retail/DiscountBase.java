package com.awign.retail;

import org.junit.Before;

import com.awign.retail.model.*;

import static org.junit.Assert.assertEquals;

public class DiscountBase {

    protected PaymentInfo paymentInfo;
    protected DiscountInfo discountInfo;

    @Before
    public void beforeEach() {
        paymentInfo = new PaymentInfo();
    }

    protected DiscountBase withGroceries(boolean has) {
        paymentInfo.setContainingGroceries(has);
        return this;
    }

    protected DiscountBase withUserType(UserType userType) {
        UserInfo<String> userInfo = new UserInfo<>();
        userInfo.setType(userType);
        paymentInfo.setUserInfo(userInfo);
        return this;
    }

    protected DiscountBase withAmount(Double amount) {
        paymentInfo.setAmount(amount);
        return this;
    }

    protected void assertCalculated(double total, double discount, DiscountType type) {
        assertEquals(total, discountInfo.getTotalBill(), 0.001);
        assertEquals(type, discountInfo.getType());
        assertEquals(discount, discountInfo.getDiscount(), 0.001);
    }
}
