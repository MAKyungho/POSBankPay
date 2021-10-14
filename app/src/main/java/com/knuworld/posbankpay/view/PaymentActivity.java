package com.knuworld.posbankpay.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;

import com.knuworld.posbankpay.model.PaymentModel;
import com.knuworld.posbankpay.R;
import com.knuworld.posbankpay.viewmodel.PaymentViewModel;
import com.knuworld.posbankpay.databinding.ActivityPaymentBinding;

public class PaymentActivity extends AppCompatActivity {

    private ActivityPaymentBinding mBinding;
    PaymentModel paymentModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        paymentModel = new PaymentModel();
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_payment);
        PaymentViewModel paymentViewModel = new ViewModelProvider(this).get(PaymentViewModel.class);
        mBinding.setViewViewModel(paymentViewModel);    // XML 내부 변수 "viewModel"
        mBinding.setLifecycleOwner(this);               // XML 생명주기 알림
    }

    //  1-1. SEND PAYMENT DATA
    public void sendPaymentData() {
        Intent payIntent = new Intent(Intent.ACTION_MAIN, paymentModel.getPayAddress());
        startActivityForResult(payIntent, 7000);
    }

    //  1-2. RECEIVE PAYMENT DATA
    protected void onPayActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    //  2-1. SEND REFUND DATA
    public void sendRefundData() {

    }

    // 2-2. RECEIVE REFUND DATA
    protected void onRefundActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

}