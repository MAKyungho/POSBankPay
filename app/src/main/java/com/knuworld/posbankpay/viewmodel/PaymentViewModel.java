package com.knuworld.posbankpay.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentViewModel extends AndroidViewModel {

    private String btnPayString = "결제";
    private String btnRefundString = "환불";

    public PaymentViewModel(@NonNull Application application) {
        super(application);
    }
}
