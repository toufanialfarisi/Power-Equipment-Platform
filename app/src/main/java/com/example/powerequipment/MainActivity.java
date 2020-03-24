package com.example.powerequipment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recview;
    private ArrayList<DataController> list = new ArrayList<>();
    TextView sizeList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recview = findViewById(R.id.recview);
        recview.setHasFixedSize(true);

        list.addAll(DataAlat.getData());
        showListView();
        sizeList = findViewById(R.id.total);
        int tot = list.size();
        sizeList.setText(String.valueOf(tot));
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemVal = item.getItemId();
        setMenu(itemVal);
        return super.onOptionsItemSelected(item);
    }

    private void setMenu(int selectedMenu){
        switch (selectedMenu){
            case R.id.list_view:
                showListView();
                break;

            case R.id.grid_view:
                showGridView();
                break;

            case R.id.about:
                Intent intent = new Intent(MainActivity.this, About.class);
                startActivity(intent);
                break;







        }

    }

    public void showSelectedItem(DataController data){
        Toast.makeText(this, "Anda memilih " + data.getNamaPeralatan(), Toast.LENGTH_SHORT).show();
    }

    public void showListView(){
        recview.setLayoutManager(new LinearLayoutManager(this));
        DataAdapter dataAdapter = new DataAdapter(list);
        recview.setAdapter(dataAdapter);

        dataAdapter.setOnItemPowerClickCallback(new DataAdapter.OnItemPowerClickCallback() {
            @Override
            public void onItemClicked(DataController data) {
                //showSelectedItem(data);
                Intent detail = new Intent(MainActivity.this, Detail.class);
                detail.putExtra(Detail.EXTRA_NAMA_PERALATAN, data.getNamaPeralatan());
                detail.putExtra(Detail.FUNGSI, data.getFungsi());
                detail.putExtra(Detail.FOTO, data.getFoto());
                detail.putExtra(Detail.SPESIFIKASI, data.getSpesifikasi());
                detail.putExtra(Detail.PRINSIP_KERJA, data.getPrinsipKerja());
                startActivity(detail);

            }
        });
    }

    public void showGridView(){
        recview.setLayoutManager(new GridLayoutManager(this,2));
        DataGridAdapter dataGridAdapter = new DataGridAdapter(list);
        recview.setAdapter(dataGridAdapter);
        dataGridAdapter.setOnItemGridClickCallback(new DataGridAdapter.OnItemGridClickCallback() {
            @Override
            public void onItemClicked(DataController data) {
                Intent detail = new Intent(MainActivity.this, Detail.class);
                detail.putExtra(Detail.EXTRA_NAMA_PERALATAN, data.getNamaPeralatan());
                detail.putExtra(Detail.FUNGSI, data.getFungsi());
                detail.putExtra(Detail.FOTO, data.getFoto());
                detail.putExtra(Detail.SPESIFIKASI, data.getSpesifikasi());
                detail.putExtra(Detail.PRINSIP_KERJA, data.getPrinsipKerja());
                startActivity(detail);
            }
        });




    }
}
