package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class CurrentDayActivity extends AppCompatActivity {
    EditText editText;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_current_day);

        Intent intent = getIntent();

        editText = findViewById(R.id.edittext);
        String day = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = findViewById(R.id.textView);
        textView.setText("За " + day + "Вы выпили:");
        Toast.makeText(this, day, Toast.LENGTH_LONG);


//        DataInstance data = new DataInstance(day);
//        MainActivity.data.add(data);
        recyclerView = findViewById(R.id.recycleView);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("11");
        arrayList.add("22");
        arrayList.add("33");
        CustomAdapter adapter = new CustomAdapter(arrayList);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new RecyclerView.LayoutManager() {
            @Override
            public RecyclerView.LayoutParams generateDefaultLayoutParams() {
                return null;
            }
        });
        Toast.makeText(CurrentDayActivity.this, "day", Toast.LENGTH_SHORT);


    }

    public void add_drink(View view) {
        String drink = editText.getText().toString();
    }
}