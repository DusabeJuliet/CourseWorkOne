package com.example.firstinitialjulietcolorswap;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
      Button btntapme;
      TextView changecolortext;
      TextView showcode;
    private int BUTTON_STATE = 0;
    private final int BUTTON_STATE_ONCE = 0;
    private final int BUTTON_STATE_TWICE = 1;
    private final int BUTTON_STATE_THRICE = 2;
    private final int BUTTON_STATE_FOURTH = 3;
    private final int BUTTON_STATE_FIFTH = 4;

      int Count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        changecolortext=findViewById(R.id.txtcc);
        showcode=findViewById(R.id.txtcolor);
        btntapme=findViewById(R.id.tapbtn);

        btntapme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    if (BUTTON_STATE==BUTTON_STATE_ONCE){
                        changecolortext.setText("COLOR:");
                        changecolortext.setTextColor(getResources().getColor(R.color.ch_yellow));
                        showcode.setText("#FDE500");
                        showcode.setTextColor(getResources().getColor(R.color.ch_yellow));
                        BUTTON_STATE =BUTTON_STATE_TWICE;
                    }
                    else if (BUTTON_STATE==BUTTON_STATE_TWICE){
                        changecolortext.setText("COLOR:");
                        changecolortext.setTextColor(getResources().getColor(R.color.ch_blue));
                        showcode.setTextColor(getResources().getColor(R.color.ch_blue));
                        showcode.setText("#0257F7");
                        BUTTON_STATE =BUTTON_STATE_THRICE;

                    }
                    else if (BUTTON_STATE ==BUTTON_STATE_THRICE){
                        changecolortext.setText("COLOR:");
                        changecolortext.setTextColor(getResources().getColor(R.color.ch_green));
                        showcode.setTextColor(getResources().getColor(R.color.ch_green));
                        showcode.setText("#61FD00");
                        BUTTON_STATE =BUTTON_STATE_FOURTH;
                    }
                    else if (BUTTON_STATE ==BUTTON_STATE_FOURTH){
                        changecolortext.setText("COLOR:");
                        changecolortext.setTextColor(getResources().getColor(R.color.colorAccent));
                        showcode.setTextColor(getResources().getColor(R.color.colorAccent));
                        showcode.setText("#D81B60");
                        BUTTON_STATE =BUTTON_STATE_FIFTH;
                    }
                    else if (BUTTON_STATE ==BUTTON_STATE_FIFTH){
                        changecolortext.setText("COLOR:");
                        changecolortext.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                        showcode.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                        showcode.setText("#00574B");
                        BUTTON_STATE =BUTTON_STATE_ONCE;
                    }

                }



       /*
                ColorStateList myList=changecolortext.getTextColors();
                int myColor=myList.getDefaultColor();
                switch(myColor)
                {
                    case Color.BLACK:
                        changecolortext.setTextColor(Color.BLUE);
                        break;

                    case Color.BLUE:
                        changecolortext.setTextColor(Color.BLACK);
                        break;
                    case Color.GREEN:
                        changecolortext.setTextColor(Color.BLACK);
                        break;
                }  */

        });
    }
}
