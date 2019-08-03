package com.example.kiit.cam1;

import android.content.Intent;
import android.provider.MediaStore;
import android.service.media.MediaBrowserService;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AC1 extends AppCompatActivity {

    Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ac1);
        b1=findViewById(R.id.bv1);
    b1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent ob=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivity(ob);
        }
    });
    }
}
