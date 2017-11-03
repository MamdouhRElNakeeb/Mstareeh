package com.ibrandcity.mstareeh.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.ibrandcity.mstareeh.R;

/**
 * Created by mamdouhelnakeeb on 10/21/17.
 */

public class Register extends AppCompatActivity {

    TextInputLayout mobileTIL, veriCodeTIL;

    TextView loginLblTV, regMsgTV;
    EditText mobileET, veriCodeET;
    Button regBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register_activity);

        mobileTIL = (TextInputLayout) findViewById(R.id.mobileNoTIL);
        veriCodeTIL = (TextInputLayout) findViewById(R.id.veriCodeTIL);

        loginLblTV = (TextView) findViewById(R.id.loginLblTV);
        regMsgTV = (TextView) findViewById(R.id.regMsgTV);
        mobileET = (EditText) findViewById(R.id.mobileET);
        veriCodeET = (EditText) findViewById(R.id.verifCodeET);
        regBtn = (Button) findViewById(R.id.regBtn);

        regBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (mobileTIL.getVisibility() == View.VISIBLE){

                    if (mobileET.getText().toString().isEmpty()){
                        Toast.makeText(Register.this, getResources().getString(R.string.mobile_fail_msg), Toast.LENGTH_SHORT).show();
                        return;
                    }

                    loginLblTV.setText(getResources().getString(R.string.acc_verification));

                    mobileET.clearFocus();
                    mobileTIL.setVisibility(View.GONE);
                    veriCodeTIL.setVisibility(View.VISIBLE);
                    regMsgTV.setVisibility(View.INVISIBLE);

                    regBtn.setText(getResources().getString(R.string.acc_verification));

                    return;
                }

                if (veriCodeTIL.getVisibility() == View.VISIBLE) {

                    if (veriCodeET.getText().toString().trim().isEmpty()){
                        Toast.makeText(Register.this, getResources().getString(R.string.verification_fail_msg), Toast.LENGTH_SHORT).show();
                        return;
                    }

                    startActivity(new Intent(Register.this, Home.class));
                    finish();

                    return;
                }
            }
        });
    }
}
