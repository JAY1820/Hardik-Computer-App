package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class ProductActivity extends AppCompatActivity {

    private RecyclerView rvProduct;
    private RvProductDetailAdapter adapter;
    private ArrayList<Model> mouseList, laptopList, monitorList, keyboardList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product);

        rvProduct = findViewById(R.id.rvProduct);
        String productName = getIntent().getStringExtra("product_name");
        mouseList = new ArrayList<>();
        laptopList = new ArrayList<>();
        keyboardList = new ArrayList<>();
        monitorList = new ArrayList<>();

        mouseList.add(new Model(R.drawable.logo1, "Dell Mouse 121i", "2001", "ksbrkggroufgWEUFLRWGEFLUWgeofugwEOUG"));
        mouseList.add(new Model(R.drawable.logo1, "Dell Mouse 121i", "2001", "ksbrkggroufgWEUFLRWGEFLUWgeofugwEOUG"));
        mouseList.add(new Model(R.drawable.logo1, "Dell Mouse 121i", "2001", "ksbrkggroufgWEUFLRWGEFLUWgeofugwEOUG"));
        mouseList.add(new Model(R.drawable.logo1, "Dell Mouse 121i", "2001", "ksbrkggroufgWEUFLRWGEFLUWgeofugwEOUG"));
        mouseList.add(new Model(R.drawable.logo1, "Dell Mouse 121i", "2001", "ksbrkggroufgWEUFLRWGEFLUWgeofugwEOUG"));
        mouseList.add(new Model(R.drawable.logo1, "Dell Mouse 121i", "2001", "ksbrkggroufgWEUFLRWGEFLUWgeofugwEOUG"));
        mouseList.add(new Model(R.drawable.logo1, "Dell Mouse 121i", "2001", "ksbrkggroufgWEUFLRWGEFLUWgeofugwEOUG"));
        mouseList.add(new Model(R.drawable.logo1, "Dell Mouse 121i", "2001", "ksbrkggroufgWEUFLRWGEFLUWgeofugwEOUG"));
        mouseList.add(new Model(R.drawable.logo1, "Dell Mouse 121i", "2001", "ksbrkggroufgWEUFLRWGEFLUWgeofugwEOUG"));
        mouseList.add(new Model(R.drawable.logo1, "Dell Mouse 121i", "2001", "ksbrkggroufgWEUFLRWGEFLUWgeofugwEOUG"));
        mouseList.add(new Model(R.drawable.logo1, "Dell Mouse 121i", "2001", "ksbrkggroufgWEUFLRWGEFLUWgeofugwEOUG"));
        mouseList.add(new Model(R.drawable.logo1, "Dell Mouse 121i", "2001", "ksbrkggroufgWEUFLRWGEFLUWgeofugwEOUG"));
        mouseList.add(new Model(R.drawable.logo1, "Dell Mouse 121i", "2001", "ksbrkggroufgWEUFLRWGEFLUWgeofugwEOUG"));

        laptopList.add(new Model(R.drawable.logo1, "Hp Laptop", "50000", "KHVEFJ,WgveyirlgWELRIYGFieyrgfywegfufwudfajhvdjgv"));
        laptopList.add(new Model(R.drawable.logo1, "Hp Laptop", "50000", "KHVEFJ,WgveyirlgWELRIYGFieyrgfywegfufwudfajhvdjgv"));
        laptopList.add(new Model(R.drawable.logo1, "Hp Laptop", "50000", "KHVEFJ,WgveyirlgWELRIYGFieyrgfywegfufwudfajhvdjgv"));
        laptopList.add(new Model(R.drawable.logo1, "Hp Laptop", "50000", "KHVEFJ,WgveyirlgWELRIYGFieyrgfywegfufwudfajhvdjgv"));
        laptopList.add(new Model(R.drawable.logo1, "Hp Laptop", "50000", "KHVEFJ,WgveyirlgWELRIYGFieyrgfywegfufwudfajhvdjgv"));
        laptopList.add(new Model(R.drawable.logo1, "Hp Laptop", "50000", "KHVEFJ,WgveyirlgWELRIYGFieyrgfywegfufwudfajhvdjgv"));
        laptopList.add(new Model(R.drawable.logo1, "Hp Laptop", "50000", "KHVEFJ,WgveyirlgWELRIYGFieyrgfywegfufwudfajhvdjgv"));
        laptopList.add(new Model(R.drawable.logo1, "Hp Laptop", "50000", "KHVEFJ,WgveyirlgWELRIYGFieyrgfywegfufwudfajhvdjgv"));
        laptopList.add(new Model(R.drawable.logo1, "Hp Laptop", "50000", "KHVEFJ,WgveyirlgWELRIYGFieyrgfywegfufwudfajhvdjgv"));

        if(productName.equals("Laptop")){
            setRecyclerview(laptopList);
        }else if(productName.equals("Monitor")){
            setRecyclerview(monitorList);
        }else if(productName.equals("Keyboard")){
            setRecyclerview(keyboardList);
        }else if(productName.equals("Mouse")){
            setRecyclerview(mouseList);
        }
    }

    private void setRecyclerview(ArrayList<Model> list){
        adapter = new RvProductDetailAdapter(list, ProductActivity.this);
        rvProduct.setLayoutManager(new LinearLayoutManager(ProductActivity.this));
        rvProduct.setAdapter(adapter);
    }
}