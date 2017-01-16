package com.android.vik.androidlibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AndroidLibraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_library);

        TextView jokeText = (TextView) findViewById(R.id.joke_text_view);

        Intent intent = getIntent();
        String text = intent.getStringExtra(Intent.EXTRA_TEXT);
        jokeText.setText(text);
    }
}
