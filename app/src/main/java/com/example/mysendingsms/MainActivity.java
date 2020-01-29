package com.example.mysendingsms;

import android.os.Bundle;
import android.provider.Telephony;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    //EditText phone_number, message;
   // Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendSMS() {
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText phone_number = (EditText) findViewById(R.id.phone_number);
                EditText message = (EditText) findViewById(R.id.message);

                String ph = phone_number.getText().toString();
                String sms = message.getText().toString();

                SmsManager smsManager = SmsManager.getDefault();
                smsManager.sendTextMessage(ph, null, sms, null, null);

                Toast.makeText(getApplicationContext(), "SMS Send Successfully!",
                        Toast.LENGTH_SHORT).show();


            }
        });
    }

}
