package com.hadi.funfacts;

import android.support.constraint.ConstraintLayout;
import android.support.design.button.MaterialButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView factsTextView;
    private MaterialButton showFact;
    private ConstraintLayout layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Find The References in activity_main.xml
        factsTextView = findViewById(R.id.fact_text);
        showFact = findViewById(R.id.show_facts);
        layout = findViewById(R.id.layout_parent);

        // Set Action For showFactButton
        showFact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int randomColor = new Fact().getColor();
                factsTextView.setText(new Fact().getFacts());
                showFact.setTextColor(randomColor);
                layout.setBackgroundColor(randomColor);
            }
        });
    }
}
