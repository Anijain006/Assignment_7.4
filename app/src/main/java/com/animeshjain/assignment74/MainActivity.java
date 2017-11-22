package com.animeshjain.assignment74;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    //Initialization

    Button loginBtn;
    EditText emailEdt, pwdEdt;
    String userName, pwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Object creation of Different elements of App

        loginBtn= (Button)findViewById(R.id.loginBtn);

        emailEdt= (EditText)findViewById(R.id.emailEdt);
        pwdEdt= (EditText)findViewById(R.id.pwdEdt);

        //OnClickListener

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Getting Credentials from Edit Text to String Variables
                userName = emailEdt.getText().toString();
                pwd = pwdEdt.getText().toString();

                //Credential Verification

                if (userName.equals("ani") && pwd.equals("123")) {

                    Toast.makeText(getApplicationContext(),"Credentials Match",Toast.LENGTH_SHORT).show();

                    //Initializing the Intent with putExtra(); : for sending user name to next activity

                    Intent i= new Intent(MainActivity.this, HomeScreen.class);

                    i.putExtra("User Name To Be Passed",userName);
                    startActivity(i);
                }
                else{
                    Toast.makeText(getApplicationContext(),"Login Failure",Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
