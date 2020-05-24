package com.harbeli.enyakin;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.ActionMode;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.selection.ItemDetailsLookup;
import androidx.recyclerview.selection.OnDragInitiatedListener;
import androidx.recyclerview.selection.OnItemActivatedListener;
import androidx.recyclerview.selection.SelectionTracker;
import androidx.recyclerview.selection.StorageStrategy;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.AndroidException;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AbsSpinner;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import com.toptoche.searchablespinnerlibrary.SearchableSpinner;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    MenuItem selectedItemCount;
    private RecyclerView rv;
    private Button SrcButton;
    private CardView card;
    private ArrayList<BankaSecViewItem> BsArraylist;
    private bankaseccardadapter adapter;
    private ActionMode actionMode;
    private SearchableSpinner spinner;
    private SearchableSpinner spinnerCity;
    SelectionTracker selectionTracker;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //banka sec recylview menüsü//
        rv = findViewById(R.id.BankaSecRv);
        rv.setHasFixedSize(true);


        BankaSecViewItem b1 = new BankaSecViewItem("QNB", "ic_qnbsvg");
        BankaSecViewItem b2 = new BankaSecViewItem("Garanti", "ic_garantilogo");
        BankaSecViewItem b3 = new BankaSecViewItem("isbankasi", "ic_isbankasi");
        BankaSecViewItem b4 = new BankaSecViewItem("yapikredi", "yapikredi");
        BsArraylist = new ArrayList<>();
        BsArraylist.add(b1);
        BsArraylist.add(b2);
        BsArraylist.add(b3);
        BsArraylist.add(b4);

        adapter = new bankaseccardadapter(this, BsArraylist);
        rv.setAdapter(adapter);
        rv.setLayoutManager(new StaggeredGridLayoutManager(1, StaggeredGridLayoutManager.HORIZONTAL));

        //search button//
        SrcButton=findViewById(R.id.SearchButton);
        SrcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent button= new Intent(MainActivity.this,ActivityCorparateList.class);
                startActivity(button);
            }
        });

        // il listesi kategori listesi/
        List<String> city = Arrays.asList(getResources().getStringArray(R.array.Cities));
        ArrayAdapter<String> dataCity;

        dataCity = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_item,city);
        dataCity.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerCity = findViewById(R.id.SpinnerCity);
        spinnerCity.setAdapter(dataCity);

        List<String> kategori = Arrays.asList(getResources().getStringArray(R.array.Kategori));
        ArrayAdapter<String> dataKategori;

        dataKategori = new ArrayAdapter<>(MainActivity.this, android.R.layout.simple_spinner_item,kategori);
        dataKategori.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner = findViewById(R.id.SpinnerKategori);
        spinner.setAdapter(dataKategori);




        // il listesi kategori listesi/


    }

        //banka sec recylview menüsü//





    }

