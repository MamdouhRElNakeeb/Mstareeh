package com.ibrandcity.mstareeh.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.ibrandcity.mstareeh.R;

/**
 * Created by mamdouhelnakeeb on 10/21/17.
 */

public class Home extends AppCompatActivity {

    Button buildingOrderBtn, buildingFormBtn, buildingEvaluationBtn, appEvaluationBtn;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_activity);

        buildingOrderBtn = (Button) findViewById(R.id.buildingOrderBtn);
        buildingFormBtn = (Button) findViewById(R.id.buildingFormBtn);
        buildingEvaluationBtn = (Button) findViewById(R.id.buildingEvaluationBtn);
        appEvaluationBtn = (Button) findViewById(R.id.appEvaluationBtn);

        buildingOrderBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(Home.this, BuildingOrder.class));
            }
        });

        buildingFormBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(Home.this, BuildingForm.class));
            }
        });

        buildingEvaluationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(Home.this, BuildingEvaluation.class));
            }
        });

        appEvaluationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(Home.this, AppEvaluation.class));
            }
        });

    }
}
