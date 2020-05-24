package com.harbeli.enyakin;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import java.util.ArrayList;

public class ActivityCorparateList extends AppCompatActivity {
    private RecyclerView sirketg;
    private ArrayList<Sirketlerİtem> ac;
    private SirketsAdapter adapster;
    private ImageButton BackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_corparate_ist);
// toolbar backbutton//
        BackButton = findViewById(R.id.BackButton);
        BackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent button= new Intent(ActivityCorparateList.this,MainActivity.class);
                startActivity(button);
            }
        });
// toolbar backbutton//


        //sirketler listele//
        sirketg = findViewById(R.id.SirketListRv);
        sirketg.setHasFixedSize(true);
        sirketg.setLayoutManager(new StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.VERTICAL));
        Sirketlerİtem a1 = new Sirketlerİtem("Ahmet Ticaret A.Ş", "İstanbul", "Beyoğlu","5+5","Var");
        Sirketlerİtem a2 = new Sirketlerİtem("Lorem Ticaret A.Ş", "İstanbul", "Kadıköy","4+2","Var");
        Sirketlerİtem a3 = new Sirketlerİtem("Deri Ticaret A.Ş", "İstanbul", "Ümraniye","3+3","Var");
        ac = new ArrayList<>();
        ac.add(a1);
        ac.add(a2);
        ac.add(a3);
        adapster = new SirketsAdapter(this,ac);
        sirketg.setAdapter(adapster);




    }
}