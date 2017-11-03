package com.ibrandcity.mstareeh.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;

import com.ibrandcity.mstareeh.R;

/**
 * Created by mamdouhelnakeeb on 10/22/17.
 */

public class BuildingEvaluation extends AppCompatActivity {

    Toolbar toolbar;
    TextView toolbarTitleTV;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.building_evaluation_activity);


        toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbarTitleTV = (TextView) findViewById(R.id.toolbarTitleTV);
        setSupportActionBar(toolbar);
        getSupportActionBar().setTitle("");

        toolbarTitleTV.setText(R.string.building_evaluation);
    }
}
