package com.example.android.tollywood;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int points;
    String ans4 = "Kathi";
    String ans10_1 = "Disha Patani";
    String ans10_2 = "Dishapatani";
    String ans10_3 = "Disha";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submit(View view) {
        points = 0;
        EditText participant_name = (EditText) findViewById(R.id.participant_name);
        String name = participant_name.getText().toString();
        CheckBox a_1 = (CheckBox) findViewById(R.id.a_1);
        boolean a1 = a_1.isChecked();
        CheckBox b_1 = (CheckBox) findViewById(R.id.b_1);
        boolean b1 = b_1.isChecked();
        CheckBox c_1 = (CheckBox) findViewById(R.id.c_1);
        boolean c1 = c_1.isChecked();
        CheckBox d_1 = (CheckBox) findViewById(R.id.d_1);
        boolean d1 = d_1.isChecked();
        if (a1 != b1 == c1 == d1)
            points += 10;
        CheckBox a_2 = (CheckBox) findViewById(R.id.a_2);
        boolean a2 = a_2.isChecked();
        CheckBox b_2 = (CheckBox) findViewById(R.id.b_2);
        boolean b2 = b_2.isChecked();
        CheckBox c_2 = (CheckBox) findViewById(R.id.c_2);
        boolean c2 = c_2.isChecked();
        CheckBox d_2 = (CheckBox) findViewById(R.id.d_2);
        boolean d2 = d_2.isChecked();
        if (a2 && c2 && !b2 && !d2)
            points += 10;
        CheckBox a_3 = (CheckBox) findViewById(R.id.a_3);
        boolean a3 = a_3.isChecked();
        CheckBox b_3 = (CheckBox) findViewById(R.id.b_3);
        boolean b3 = b_3.isChecked();
        CheckBox c_3 = (CheckBox) findViewById(R.id.c_3);
        boolean c3 = c_3.isChecked();
        CheckBox d_3 = (CheckBox) findViewById(R.id.d_3);
        boolean d3 = d_3.isChecked();
        if (a3 && d3 && !c3 && !b3)
            points += 10;
        EditText text_4 = (EditText) findViewById(R.id.text_4);
        String text4 = text_4.getText().toString();
        if (text4.equals(ans4))
            points += 10;
        RadioButton a_5 = (RadioButton) findViewById(R.id.a_5);
        ans5(a_5);
        CheckBox a_6 = (CheckBox) findViewById(R.id.a_6);
        boolean a6 = a_6.isChecked();
        CheckBox b_6 = (CheckBox) findViewById(R.id.b_6);
        boolean b6 = b_6.isChecked();
        CheckBox c_6 = (CheckBox) findViewById(R.id.c_6);
        boolean c6 = c_6.isChecked();
        CheckBox d_6 = (CheckBox) findViewById(R.id.d_6);
        boolean d6 = d_6.isChecked();
        if (d6 != a6 == b6 == c6)
            points += 10;
        CheckBox a_7 = (CheckBox) findViewById(R.id.a_7);
        boolean a7 = a_7.isChecked();
        CheckBox b_7 = (CheckBox) findViewById(R.id.b_7);
        boolean b7 = b_7.isChecked();
        CheckBox c_7 = (CheckBox) findViewById(R.id.c_7);
        boolean c7 = c_7.isChecked();
        CheckBox d_7 = (CheckBox) findViewById(R.id.d_7);
        boolean d7 = d_7.isChecked();
        if (a7 == b7 != c7 == d7)
            points += 10;
        EditText text_8 = (EditText) findViewById(R.id.text_8);
        String text8 = text_8.getText().toString();
        if (text8.equals(ans10_1) || text8.equals(ans10_2) || text8.equals(ans10_3))
            points += 10;
        CheckBox a_9 = (CheckBox) findViewById(R.id.a_9);
        boolean a9 = a_9.isChecked();
        CheckBox b_9 = (CheckBox) findViewById(R.id.b_9);
        boolean b9 = b_9.isChecked();
        CheckBox c_9 = (CheckBox) findViewById(R.id.c_9);
        boolean c9 = c_9.isChecked();
        CheckBox d_9 = (CheckBox) findViewById(R.id.d_9);
        boolean d9 = d_9.isChecked();
        if (a9 && b9 && c9 && d9)
            points += 10;

        RadioButton b_10 = (RadioButton) findViewById(R.id.b_10);

        ans10(b_10);
        Toast.makeText(this, name + " has scored " + points + " points.", Toast.LENGTH_LONG).show();
        points = 0;
    }

    public void ans5(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        if (checked)
            points += 10;
    }

    public void ans10(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        if (checked)
            points += 10;
    }
}

