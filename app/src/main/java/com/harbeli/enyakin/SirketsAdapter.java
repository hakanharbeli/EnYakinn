package com.harbeli.enyakin;

import android.content.Context;
import android.content.Intent;
import android.gesture.GestureOverlayView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class SirketsAdapter  extends RecyclerView.Adapter<SirketsAdapter.CardNesneTutucu>{
    private Context mContext;
    private List<Sirketlerİtem> Sirketler;
    public static String SirketİsmiAyrinti;

    public SirketsAdapter(Context mContext, List<Sirketlerİtem> sirketler) {
        this.mContext = mContext;
        Sirketler = sirketler;
    }

    @NonNull
    @Override
    public CardNesneTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemview = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.sirket_card_tasarim,parent,false);

        return new CardNesneTutucu(itemview);
    }

    @Override
    public void onBindViewHolder(@NonNull CardNesneTutucu holder, int position) {
        final Sirketlerİtem sirket = Sirketler.get(position);
        holder.SirketTextAdi.setText(sirket.getSirketAdi());
        holder.SirketTextAdresi.setText(sirket.getSirketAdresİlce()+", "+sirket.getSirketAdresiİl());
        holder.SirketTextKampanya.setText("Taksit: "+sirket.getSirketKampanya());
        holder.SirketTextParapuan.setText("Parapuan: "+sirket.getSirketParapuan());
        holder.SirketResim.setImageResource(R.drawable.business);

        holder.SirketCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mContext.startActivity(new Intent(mContext,ActivitySirketAyrinti.class));
                SirketİsmiAyrinti = sirket.getSirketAdi();
            }
        });


    }

    @Override
    public int getItemCount() {
        return Sirketler.size();
    }

    public class CardNesneTutucu extends RecyclerView.ViewHolder{
      public CardView SirketCard;
      public TextView SirketTextAdi;
      public TextView SirketTextAdresi;
      public TextView SirketTextKampanya;
      public TextView SirketTextParapuan;
        public ImageView SirketResim;
        public ImageButton TarifAlButton;



      public CardNesneTutucu(@NonNull View itemView) {
          super(itemView);
          SirketCard= itemView.findViewById(R.id.SirketCard);
          SirketTextAdi= itemView.findViewById(R.id.Sirketİsmi);
          SirketTextAdresi= itemView.findViewById(R.id.SirketAdresi);
          SirketTextKampanya= itemView.findViewById(R.id.kampanyaDurumu);
          SirketTextParapuan= itemView.findViewById(R.id.ParapunDurumu);
          SirketResim = itemView.findViewById(R.id.imageView2);
          TarifAlButton = itemView.findViewById(R.id.DetayArrowButton);


      }
  }
}
