package com.harbeli.enyakin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class ActivitySirketAyrinti extends AppCompatActivity {
    private TextView Sirketİsmi;
    private Button TarifBtn;
    private TextView SirketAdresi;
    private ImageButton Backbutton;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sirket_ayrinti);

        //bilgileri aktar
        Sirketİsmi= findViewById(R.id.Sirketİsmi);
        SirketAdresi = findViewById(R.id.SirketAdresi);
        TarifBtn = findViewById(R.id.TarifButton);
        Sirketİsmi.setText(SirketsAdapter.SirketİsmiAyrinti);
        Backbutton = findViewById(R.id.BackButton);

        // toolbardaki geri tuşu//
        Backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent button= new Intent(ActivitySirketAyrinti.this,ActivityCorparateList.class);
                startActivity(button);
            }
        });

        // toolbardaki geri tuşu//

        //yol tarifi al
        TarifBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri gmmIntentUri = Uri.parse("geo:0,0?q="+SirketAdresi.getText());
                Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
                mapIntent.setPackage("com.google.android.apps.maps");
                startActivity(mapIntent);
            }
        });



    }
}
