package com.example.powerequipment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.menu.MenuView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class About extends AppCompatActivity {

    TextView github, gitlab, namaPembuat;
    Button btnUrl;
    ImageView profile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        github = findViewById(R.id.github);
        gitlab = findViewById(R.id.gitlab);
        namaPembuat = findViewById(R.id.nama_pembuat);
        btnUrl = findViewById(R.id.btn_url);
        profile = findViewById(R.id.profile);

        namaPembuat.setText("Toufani Rizal Alfarisi");
        github.setText("toufani1515@gmail.com");
        gitlab.setText("Python, Java, C, JS");

        Glide.with(this).load(R.drawable.toufan)
                .apply(new RequestOptions()
                .override(350,550))
                .into(profile);

        btnUrl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(About.this, "Redirecting to https://makeitation.com", Toast.LENGTH_SHORT).show();

                String urlWeb = "https://makeitation.com";
                Intent web = new Intent(Intent.ACTION_VIEW);
                web.setData(Uri.parse(urlWeb));
                startActivity(web);




            }
        });


        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("About Me");
    }
}
