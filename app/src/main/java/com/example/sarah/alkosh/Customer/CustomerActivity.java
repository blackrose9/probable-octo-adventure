package com.example.sarah.alkosh.Customer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.sarah.alkosh.R;
import com.example.sarah.alkosh.Customer.CustomerHome;

public class CustomerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);
    }
    public void gotoHome(View view){
        Intent intent = new Intent(this, CustomerHome.class);
        startActivity(intent);
    }
}
