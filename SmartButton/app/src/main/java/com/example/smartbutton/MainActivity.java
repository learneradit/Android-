package com.example.smartbutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button AditButton=(Button)findViewById(R.id.AditButton);

        AditButton.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v)
                    {
                        TextView AditText=(TextView)findViewById(R.id.AditText);
                        //if(AditText.equals("See the Color change in me")) {
                            AditText.setText("See I have changed my color");
                            AditText.setBackgroundColor(Color.LTGRAY);
                            AditText.setTextColor(Color.BLUE);
                        //}
                        /*else {
                            AditText.setText("See the Color change in me");
                            AditText.setBackgroundColor(Color.YELLOW);
                            AditText.setTextColor(Color.DKGRAY);
                        }*/
                    }
                }
        );

        AditButton.setOnLongClickListener(
                new Button.OnLongClickListener(){
                    public boolean onLongClick(View v)
                    {
                            TextView AditText=(TextView)findViewById(R.id.AditText);
                            AditText.setText("Yeah, that was a long Click !");
                            return true;
                            // return false;  // As soon as I release the finger after double click,
                                              // onclick() will be executed if return value is false
                        // while return true instructs onclick() that the event is already handled
                        // and it should not get execute
                    }
                }
        );
    }
}