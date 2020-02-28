package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.txt_hello);
        button = findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener()
            @override
                public void onClick(View view);
        );
        textView.setText("Hello World from ProgAndro!");
    }

    protected void onStart(){
        super.onStart();
    }
    protected void onResume(){
        super.onResume();
    }
    protected void onPause(){
        super.onPause();
    }
    protected void onDestroy(){
        super.onDestroy();
    }
}
