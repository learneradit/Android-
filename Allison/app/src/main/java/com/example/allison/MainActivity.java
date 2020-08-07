package com.example.allison;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

// My imports
import android.widget.RelativeLayout;
import android.widget.Button;
import android.widget.EditText;
import android.graphics.Color;
import android.content.res.Resources;
import android.util.TypedValue;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Creating a layout using Java
        RelativeLayout AditsLayout = new RelativeLayout(this);
        AditsLayout.setBackgroundColor(Color.LTGRAY);

        // Button
        Button redButton=new Button(this);
        redButton.setText("LOG IN");
        redButton.setBackgroundColor(Color.YELLOW);

        //Username Input
        EditText username=new EditText(this);

        redButton.setId(1);
        username.setId(2);


        RelativeLayout.LayoutParams buttonDetails=new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        RelativeLayout.LayoutParams usernameDetails=new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );

        // Give rules ot position widgets
        usernameDetails.addRule(RelativeLayout.ABOVE,redButton.getId());
        usernameDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        usernameDetails.setMargins(0,0,0,50);


        // To position it at center horizontally as well as vertically
        buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);

        Resources r=getResources();
        int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,200,
                r.getDisplayMetrics()
                );

        username.setWidth(px);

        AditsLayout.addView(redButton,buttonDetails);
        AditsLayout.addView(username,usernameDetails);

        setContentView(AditsLayout);

    }
}