package com.example.helloconstraint;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this, R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount ++;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
        if (mCount % 2 == 0) {
            ((Button)view).setBackgroundColor(0x00FF00);
        } else {
            ((Button)view).setBackgroundColor(0x00BCD4);
        }

        findViewById(R.id.button_zero).setBackgroundColor(0xFFCC1E1E);
    }

    public void makeZero(View view) {
        mCount = 0;
        if (mShowCount != null) {
            mShowCount.setText(Integer.toString(mCount));
        }
        view.setBackgroundColor(0x757171);
    }
}