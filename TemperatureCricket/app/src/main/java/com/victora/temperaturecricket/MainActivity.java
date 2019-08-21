package com.victora.temperaturecricket;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText userInput;

    Button submit;

    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        userInput = findViewById(R.id.userInput);

        submit = findViewById(R.id.submit);

        result = findViewById(R.id.result);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if(userInput.getText().toString().isEmpty())
                {
                    Toast.makeText(MainActivity.this,"Please enter all fields!",Toast.LENGTH_SHORT).show();
                }
                else {
                    double temp = (Integer.parseInt(userInput.getText().toString().trim()) / 3) + 4;

                    result.setText("The approximate temperature outside is " + temp + " degrees Celsius.");
                }

            }
        });

    }
}
