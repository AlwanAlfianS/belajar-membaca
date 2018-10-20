package com.permana.belajarmembaca;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class VokalActivity extends AppCompatActivity {

    int imageId, stringId;
    ImageView imageView;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vokal);

        imageView = findViewById(R.id.image_detail);
        textView = findViewById(R.id.text_detail);

        if (getIntent().getExtras() != null){
            imageId = getIntent().getExtras().getInt("CARD_IMAGE");
            stringId = getIntent().getExtras().getInt("CARD_STRING");
            imageView.setImageResource(imageId);
            textView.setText(stringId);
        }
    }
}
