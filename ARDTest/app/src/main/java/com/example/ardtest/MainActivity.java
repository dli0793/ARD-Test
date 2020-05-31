package com.example.ardtest;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.MotionEvent;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnLongClickListener, View.OnTouchListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Ignore", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        final Button key1 = findViewById(R.id.button);
        final Button key2 = findViewById(R.id.button2);
        final Button key3 = findViewById(R.id.button3);
        final Button key4 = findViewById(R.id.button4);
        final Button key5 = findViewById(R.id.button5);
        final Button key6 = findViewById(R.id.button6);

        key1.setOnLongClickListener(this);
        key2.setOnLongClickListener(this);
        key3.setOnLongClickListener(this);
        key4.setOnLongClickListener(this);
        key5.setOnLongClickListener(this);
        key6.setOnLongClickListener(this);

        final TextView text = findViewById(R.id.textView);
        //text.setText(" ");

        key1.setOnTouchListener(this);
        key2.setOnTouchListener(this);
        key3.setOnTouchListener(this);
        key4.setOnTouchListener(this);
        key5.setOnTouchListener(this);
        key6.setOnTouchListener(this);
    }

    @Override
    protected void onResume() {
        final TextView text = findViewById(R.id.textView);
        super.onResume();
        text.setText("No keys!");
    }

    int buttonpresses = 0;
    int buttonreleases = 0;
    @Override
    public boolean onLongClick(View v) {
        final TextView text = findViewById(R.id.textView);
        String t;
        t = "" + text.getText();
        t = t.replace("No keys!", "");
        text.setText(t);
        switch(v.getId()) {
            case R.id.button:
                text.append(" Key 1");
                buttonpresses++;
                break;
            case R.id.button2:
                text.append(" Key 2");
                buttonpresses++;
                break;
            case R.id.button3:
                text.append(" Key 3");
                buttonpresses++;
                break;
            case R.id.button4:
                text.append(" Key 4");
                buttonpresses++;
                break;
            case R.id.button5:
                text.append(" Key 5");
                buttonpresses++;
                break;
            case R.id.button6:
                text.append(" Key 6");
                buttonpresses++;
                break;
        }
        return true;
    }

    @Override
    public boolean onTouch(View v, MotionEvent event) {
        final TextView text = findViewById(R.id.textView);
        String t;
        switch(v.getId()) {
            case R.id.button:
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    t = "" + text.getText();
                    if(t.contains(" Key 1"))
                        buttonreleases++;
                    t = t.replace(" Key 1", "");
                    text.setText(t);
                }
                break;
            case R.id.button2:
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    t = "" + text.getText();
                    if(t.contains(" Key 2"))
                        buttonreleases++;
                    t = t.replace(" Key 2", "");
                    text.setText(t);
                }
                break;
            case R.id.button3:
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    t = "" + text.getText();
                    if(t.contains(" Key 3"))
                        buttonreleases++;
                    t = t.replace(" Key 3", "");
                    text.setText(t);
                }
                break;
            case R.id.button4:
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    t = "" + text.getText();
                    if(t.contains(" Key 4"))
                        buttonreleases++;
                    t = t.replace(" Key 4", "");
                    text.setText(t);
                }
                break;
            case R.id.button5:
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    t = "" + text.getText();
                    if(t.contains(" Key 5"))
                        buttonreleases++;
                    t = t.replace(" Key 5", "");
                    text.setText(t);
                }
                break;
            case R.id.button6:
                if (event.getAction() == MotionEvent.ACTION_UP) {
                    t = "" + text.getText();
                    if(t.contains(" Key 6"))
                        buttonreleases++;
                    t = t.replace(" Key 6", "");
                    text.setText(t);
                }
                break;
        }
        if(buttonpresses==buttonreleases)
        {
            text.setText("No keys!");
        }
        return false;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
