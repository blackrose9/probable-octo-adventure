package com.example.sarah.alkosh;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.sarah.alkosh.Customer.CustomerActivity;
import com.example.sarah.alkosh.Supplier.SupplierActivity;

public class MainAct extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void gotoCustomer(View view){
        Intent intent = new Intent(this, CustomerActivity.class);
        startActivity(intent);
    }
    public void gotoSupplier(View view){
        Intent intent = new Intent(this, SupplierActivity.class);
        startActivity(intent);
    }
}
