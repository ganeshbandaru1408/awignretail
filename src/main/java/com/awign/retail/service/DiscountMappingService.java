package com.awign.retail.service;

import java.util.function.Function;

import com.awign.retail.model.DiscountType;
import com.awign.retail.model.UserType;

/**
 * Service that maps:
 *  - the UserType to the DiscountType
 *  - the DiscountType to a callback function, which calculates the percentage discount with complexity of 1
 */
public interface DiscountMappingService {

    DiscountType getDiscountByUserType(UserType userType);
    Function<Double, Double> getFunctionByDiscount(DiscountType discountType);
}
