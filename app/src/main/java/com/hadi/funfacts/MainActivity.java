package com.hadi.funfacts;

import android.support.constraint.ConstraintLayout;
import android.support.design.button.MaterialButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private MaterialButton button;
    private ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        textView = findViewById(R.id.fact_text);
        button = findViewById(R.id.show_facts);
        layout = findViewById(R.id.layout_parent);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int randomColor = new Facts().getColor();
                textView.setText(new Facts().getFacts());
                button.setTextColor(randomColor);
                layout.setBackgroundColor(randomColor);
            }
        });
    }
}
