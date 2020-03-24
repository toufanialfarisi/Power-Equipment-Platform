package com.example.powerequipment;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toolbar;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class Detail extends AppCompatActivity {

    public static final String EXTRA_NAMA_PERALATAN = "peralatan";
    public static final String FUNGSI = "fungsi";
    public static final String FOTO = "foto";
    public static final String SPESIFIKASI = "spesifikasi";
    public static final String PRINSIP_KERJA = "prinsip_kerja";

    TextView fungsiTitle, spesifikasiTitle, spesifikasi, namaPeralatan, fungsi, prinsipTitle, prinsip;
    ImageView foto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("Detail");


        fungsiTitle = findViewById(R.id.title_fungsi);
        spesifikasiTitle = findViewById(R.id.title_spesifikasi);
        prinsipTitle = findViewById(R.id.prinsip_kerja_title);

        prinsip = findViewById(R.id.prinsip_kerja);
        String prinsipKerja = getIntent().getStringExtra(PRINSIP_KERJA);
        prinsip.setText(prinsipKerja);

        spesifikasi = findViewById(R.id.spesifikasi);
        String spek = getIntent().getStringExtra(SPESIFIKASI);
        spesifikasi.setText(spek);

        foto = findViewById(R.id.foto);
        int img = getIntent().getIntExtra(FOTO,0);
        Glide.with(Detail.this).load(img).apply(new RequestOptions().override(350, 550)).into(foto);

        namaPeralatan  = findViewById(R.id.nama_alat);
        String saveNamaPeralatan = getIntent().getStringExtra(EXTRA_NAMA_PERALATAN);
        namaPeralatan.setText(saveNamaPeralatan);

        fungsi = findViewById(R.id.fungsi);
        String saveFungsi = getIntent().getStringExtra(FUNGSI);
        fungsi.setText(saveFungsi);

    }

}
