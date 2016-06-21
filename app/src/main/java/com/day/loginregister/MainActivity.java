package com.day.loginregister;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText etYourName = (EditText) findViewById(R.id.etYourName);
        final EditText etYourAge = (EditText) findViewById(R.id.etYourAge);
        final EditText etUserName = (EditText) findViewById(R.id.etUserName);
        final Button bLogout = (Button) findViewById(R.id.bLogout);
        bLogout.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.bLogout:

                startActivity(new Intent(this, Login.class));

            break;
        }
    }
}
