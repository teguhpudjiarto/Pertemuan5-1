package com.example.pertemuan5a;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list = (ListView) findViewById(R.id.listview);
        String[] namaBuah = {"Jeruk","Apel","Mangga","Pisang"};
        ArrayAdapter<String> myAdapter = new ArrayAdapter<> (this, android.R.layout.simple_list_item_1, namaBuah);
        list.setAdapter(myAdapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    startActivity(new Intent(MainActivity.this,jeruk.class));
                }else if(position==1){
                    startActivity(new Intent(MainActivity.this,apel.class));
                }else if(position==2){
                    startActivity(new Intent(MainActivity.this,mangga.class));
                }else{
                    startActivity(new Intent(MainActivity.this,pisang.class));
                }
            }
        });
    }
}