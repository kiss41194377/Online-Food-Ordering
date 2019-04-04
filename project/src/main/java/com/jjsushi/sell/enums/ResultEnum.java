package com.jjsushi.sell.enums;

import lombok.Data;
import lombok.Getter;

@Getter
public enum ResultEnum {
    PARAM_ERROR(1,"Incorrect parameters"),
    PRODUCT_NOT_EXIST(10,"Product doesn't exist"),
    PRODUCT_OUT_OF_STOCK(11,"Product is out of stock"),
    ORDER_DOES_NOT_EXIST(12,"Order does not exist"),
    ORDERDETAIL_DOENST_NOT_EXIST(13,"Order detail does not exist"),
    ORDER_STATUS_ERROR(14,"Incorredct order status"),
    ORDER_UPDATE_FAIL(15,"Failed to update the order"),
    ORDER_DETAIL_EMPTY(16,"Order detail is empty"),
    ORDER_PAY_STATUS_ERROR(17,"Incorrect payment status"),
    CART_EMPTY(18,"Cart is empty")

    ;
    private Integer code;

    private String message;

    ResultEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }


}
