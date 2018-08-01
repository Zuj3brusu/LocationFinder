package com.example.pulkitgaur.locationfinder;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        configurenextbutton();
    }
    private void configurenextbutton(){
        Button nextButton = (Button) findViewById(R.id.nextButton);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText lat=(EditText) findViewById(R.id.latitude);
                EditText lon=(EditText) findViewById(R.id.longitude);
//                TextView a=(TextView) findViewById(R.id.safasfasdf);
                int number = Integer.parseInt(lat.getText().toString());
                int number1 = Integer.parseInt(lon.getText().toString());
//                a.setText(String.valueOf(number));
                Intent intent=new Intent(MainActivity.this, MapsActivity.class);
                intent.putExtra("latnumber",number);
                intent.putExtra("lonnumber",number1);
                startActivity(intent);
            }
        });
    }
}
