package com.example.ruwang.myachacedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button save,quray;
    private TextView showData;
    private EditText mEditText;

    private ACache mCache;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        save = (Button) findViewById(R.id.save);
        quray = (Button) findViewById(R.id.quray);
        mCache = ACache.get(this);
        showData = (TextView) findViewById(R.id.show_data);
        mEditText = (EditText) findViewById(R.id.save_data);


        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mCache.put("data",mEditText.getText().toString());
            }
        });


        quray.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showData.setText(mCache.getAsString("data"));
            }
        });



    }
}
