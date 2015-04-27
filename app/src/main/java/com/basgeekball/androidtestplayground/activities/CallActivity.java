package com.basgeekball.androidtestplayground.activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.basgeekball.androidtestplayground.R;

public class CallActivity extends AppCompatActivity {

    private String telephoneNumber = "123-456-789";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);
        Button btnCall = (Button) findViewById(R.id.btnCall);
        btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("tel:" + telephoneNumber));
                startActivity(intent);
                finish();
            }
        });
    }

}
