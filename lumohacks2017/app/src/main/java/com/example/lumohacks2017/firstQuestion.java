package com.example.lumohacks2017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class firstQuestion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_question);

        TextView firstQuestion = (TextView) findViewById(R.id.question1);
        firstQuestion.setText("Do you have any drug allergies?");
    }

    public void sendMessageYes(View view) {
        Intent intent = new Intent(this, firstQuestion2.class);
        intent.putExtra(EXTRA_MESSAGE, "");
        startActivity(intent);
    }

    public void sendMessageNo(View view) {
        Intent intent = new Intent(this, secondQuestion.class);
        intent.putExtra(EXTRA_MESSAGE, "");
        startActivity(intent);
    }



}
