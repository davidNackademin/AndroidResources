package com.example.david.ons7febresources;

import android.os.LocaleList;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.text_view);


        //textView.setText( current.getDisplayLanguage());

    }

    public void buttonPressed(View view) {
        textView.setText(getString(R.string.good_bye_world));
    }

}
