package de.danoeh.antennapod.debug;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import de.danoeh.antennapod.R;
import de.danoeh.antennapod.fragment.ItemFragment;


public class SampleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);

        Intent intent = getIntent();
        String message = intent.getStringExtra(ItemFragment.EXTRA_MESSAGE);

       EditText editText = (EditText) findViewById(R.id.editText);
       editText.setText(message);
    }
}
