package com.example.firstapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btntoggle2;
    TextView txtchangecolor2;
    TextView showcodetxt;
    private int BUTTON_STATE = 0;
    private final int BUTTON_STATE_ONCE = 0;
    private final int BUTTON_STATE_TWICE = 1;
    private final int BUTTON_STATE_THRICE = 2;
    private final int BUTTON_STATE_FOURTH = 3;
    private final int BUTTON_STATE_FIFTH = 4;
    private final int BUTTON_STATE_SIXTH = 5;
    private final int BUTTON_STATE_SEVENTH = 6;
    private final int BUTTON_STATE_EIGTH = 7;
    private final int BUTTON_STATE_NINTH = 8;
    private final int BUTTON_STATE_TENTH = 9;
    private final int BUTTON_STATE_ELEVENTH = 10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showcodetxt=findViewById(R.id.colortxt);
        txtchangecolor2=findViewById(R.id.txtcolor);
        btntoggle2=findViewById(R.id.btntap2);

        btntoggle2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (BUTTON_STATE==BUTTON_STATE_ONCE){
                    txtchangecolor2.setText("COLOR:");
                    txtchangecolor2.setTextColor(getResources().getColor(R.color.ch_yellow));
                    showcodetxt.setText("#FDE500");
                    showcodetxt.setTextColor(getResources().getColor(R.color.ch_yellow));
                    BUTTON_STATE =BUTTON_STATE_TWICE;
                }
                else if (BUTTON_STATE==BUTTON_STATE_TWICE){
                    txtchangecolor2.setText("COLOR:");
                    txtchangecolor2.setTextColor(getResources().getColor(R.color.ch_blue));
                    showcodetxt.setTextColor(getResources().getColor(R.color.ch_blue));
                    showcodetxt.setText("#0257F7");
                    BUTTON_STATE =BUTTON_STATE_THRICE;

                }
                else if (BUTTON_STATE ==BUTTON_STATE_THRICE){
                    txtchangecolor2.setText("COLOR:");
                    txtchangecolor2.setTextColor(getResources().getColor(R.color.ch_green));
                    showcodetxt.setTextColor(getResources().getColor(R.color.ch_green));
                    showcodetxt.setText("#61FD00");
                    BUTTON_STATE =BUTTON_STATE_FOURTH;
                }
                else if (BUTTON_STATE ==BUTTON_STATE_FOURTH){
                    txtchangecolor2.setText("COLOR:");
                    txtchangecolor2.setTextColor(getResources().getColor(R.color.colorAccent));
                    showcodetxt.setTextColor(getResources().getColor(R.color.colorAccent));
                    showcodetxt.setText("#D81B60");
                    BUTTON_STATE =BUTTON_STATE_FIFTH;
                }
                else if (BUTTON_STATE ==BUTTON_STATE_FIFTH){
                    txtchangecolor2.setText("COLOR:");
                    txtchangecolor2.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    showcodetxt.setTextColor(getResources().getColor(R.color.colorPrimaryDark));
                    showcodetxt.setText("#00574B");
                    BUTTON_STATE =BUTTON_STATE_SIXTH;
                }
                else if (BUTTON_STATE ==BUTTON_STATE_SIXTH){
                    txtchangecolor2.setText("COLOR:");
                    txtchangecolor2.setTextColor(getResources().getColor(R.color.ch_purple));
                    showcodetxt.setTextColor(getResources().getColor(R.color.ch_purple));
                    showcodetxt.setText("#FD00F0");
                    BUTTON_STATE =BUTTON_STATE_SEVENTH;
                }
                else if (BUTTON_STATE ==BUTTON_STATE_SEVENTH){
                    txtchangecolor2.setText("COLOR:");
                    txtchangecolor2.setTextColor(getResources().getColor(R.color.ch_black));
                    showcodetxt.setTextColor(getResources().getColor(R.color.ch_black));
                    showcodetxt.setText("#000000");
                    BUTTON_STATE =BUTTON_STATE_EIGTH;
                }
                else if (BUTTON_STATE ==BUTTON_STATE_EIGTH){
                    txtchangecolor2.setText("COLOR:");
                    txtchangecolor2.setTextColor(getResources().getColor(R.color.ch_red));
                    showcodetxt.setTextColor(getResources().getColor(R.color.ch_red));
                    showcodetxt.setText("#FD0000");
                    BUTTON_STATE =BUTTON_STATE_NINTH;
                }
                else if (BUTTON_STATE ==BUTTON_STATE_NINTH){
                    txtchangecolor2.setText("COLOR:");
                    txtchangecolor2.setTextColor(getResources().getColor(R.color.ch_orange));
                    showcodetxt.setTextColor(getResources().getColor(R.color.ch_orange));
                    showcodetxt.setText("#FF9800");
                    BUTTON_STATE =BUTTON_STATE_TENTH;
                }
                else if (BUTTON_STATE ==BUTTON_STATE_TENTH){
                    txtchangecolor2.setText("COLOR:");
                    txtchangecolor2.setTextColor(getResources().getColor(R.color.ch_magenta));
                    showcodetxt.setTextColor(getResources().getColor(R.color.ch_magenta));
                    showcodetxt.setText("#3D5321");
                    BUTTON_STATE =BUTTON_STATE_ELEVENTH;
                }
                else if (BUTTON_STATE ==BUTTON_STATE_ELEVENTH){
                    txtchangecolor2.setText("COLOR:");
                    txtchangecolor2.setTextColor(getResources().getColor(R.color.ch_white));
                    showcodetxt.setTextColor(getResources().getColor(R.color.ch_white));
                    showcodetxt.setText("#00FDCA");
                    BUTTON_STATE =BUTTON_STATE_ONCE;
                }
            }
        });

    }
}
