package org.axb4947.androidlife;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class MainActivity extends Activity implements OnClickListener {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // click-handlers for buttons
        View aboutButton = findViewById(R.id.about_button);
        aboutButton.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
        case R.id.about_button:
            Intent i = new Intent(this, AboutActivity.class);
            startActivity(i);
            break;
        }
    }
}