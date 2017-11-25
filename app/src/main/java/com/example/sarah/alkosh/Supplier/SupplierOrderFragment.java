package com.example.sarah.alkosh.Supplier;

import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.sarah.alkosh.R;

/**
 * Created by Sarah on 11/24/2017.
 */

public class SupplierOrderFragment extends android.support.v4.app.Fragment{
    private static final String TAG = "Your Orders";

    private ImageButton addbtn;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.supplierorder_fragment,container,false);
        addbtn = (ImageButton) view.findViewById(R.id.orderacceptbtn);
        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(), "You said: BUY!", Toast.LENGTH_SHORT).show();
//                Intent intent = new Intent(getActivity(), OrderAct.class);
//                startActivity(intent);
            }
        });

        return view;
    }
}
