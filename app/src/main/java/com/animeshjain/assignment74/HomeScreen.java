package com.animeshjain.assignment74;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class HomeScreen extends AppCompatActivity {

    TextView welcomeTxtView;
    String welcomeTxt= "Welcome, ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        //Getting Data From Previous Activity using getExtrs();

        Bundle usrName = getIntent().getExtras();

        //Assigning A string to data Extracted
        String userName= usrName.getString("User Name To Be Passed");

        welcomeTxtView= (TextView)findViewById(R.id.welcomeTxtView);

        //Setting Data to Welcome Text View

        welcomeTxtView.setText(welcomeTxt +userName);

    }
}
