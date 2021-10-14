package com.knuworld.posbankpay.model;

import android.net.Uri;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentModel {
    private Uri payAddress = Uri.parse("fpispkoces://default");
    private Uri receiptAddress = Uri.parse("fpispkoces://receipt");
}
