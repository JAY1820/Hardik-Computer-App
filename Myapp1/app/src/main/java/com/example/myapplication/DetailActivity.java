package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    private ImageView imageView;
    private TextView name, description;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageView = findViewById(R.id.igDetailProduct);
        description = findViewById(R.id.txDetailDescription);
        name = findViewById(R.id.txDetailProductName);
        button = findViewById(R.id.btnDetailPrice);

        loadData();
    }
    private void loadData(){
        String productName = getIntent().getStringExtra("productname");
        String price = getIntent().getStringExtra("productprice");
        String desc = getIntent().getStringExtra("productdescription");
        int image = getIntent().getIntExtra("productimage", 0);

        imageView.setImageResource(image);
        description.setText(desc);
        name.setText(productName);
        button.setText(String.valueOf("₹" + price));
    }
}