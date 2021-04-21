package com.example.bankapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {
    private RecyclerView Recycle2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Recycle2=findViewById(R.id.Recycle2);
        ArrayList<Beneficiary> details =new ArrayList<>();
        details.add(new Beneficiary("Anandha varman",112233,"sbin001122"));
        details.add(new Beneficiary("Banumathi",112234,"sbin001122"));
        details.add(new Beneficiary("Elanchezhian",112235,"sbin009988"));
        details.add(new Beneficiary("Hema",112236,"sbin009977"));
        details.add(new Beneficiary("Rajeswari",112237,"sbin009977"));


        Adapter2 adp2=new Adapter2(this);
        Recycle2.setAdapter(adp2);
        Recycle2.setLayoutManager(new GridLayoutManager(this,2));
        adp2.setName(details);
    }
}