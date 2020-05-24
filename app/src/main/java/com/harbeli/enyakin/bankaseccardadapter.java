package com.harbeli.enyakin;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.ActionMode;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.selection.ItemDetailsLookup;
import androidx.recyclerview.selection.SelectionTracker;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.mikiloz.fancyadapters.SelectableAdapter;

import java.util.ArrayList;
import java.util.List;


public class bankaseccardadapter extends RecyclerView.Adapter<bankaseccardadapter.bankaCardTutucu>{
    private Context mContext;
    private ArrayList<BankaSecViewItem> Bankalar;
    private SelectionTracker selectionTracker;
    private int checkedPosition = 0;
    private int lastPosition = -1;
    int row_index = -1;




    public bankaseccardadapter(Context mContext, ArrayList<BankaSecViewItem> bankalar) {
        this.mContext = mContext;
        Bankalar = bankalar;
    }

    public SelectionTracker getSelectionTracker() {
        return selectionTracker;
    }


    public void setSelectionTracker(SelectionTracker selectionTracker) {
        this.selectionTracker = selectionTracker;
    }
    public class bankaCardTutucu extends RecyclerView.ViewHolder implements ViewHolderWithDetails{
        public ImageView imageBank;
        public CardView CardBanka;
        public String TagText;

        public bankaCardTutucu(View view) {
            super(view);
            imageBank = view.findViewById(R.id.imageBank);
            CardBanka = view.findViewById(R.id.CardBanka);

        }
        public final void bind(BankaSecViewItem item) {


            imageBank.setTag(item.getTagText());
           imageBank.setImageResource(mContext.getResources().getIdentifier(item.getImageName(),"drawable", mContext.getPackageName()));
        }
        @Override
        public ItemDetailsLookup.ItemDetails getItemDetails() {
            return new MyItemDetail(getAdapterPosition(), Bankalar.get(getAdapterPosition()));
        }
    }

        @NonNull
        @Override
        public bankaCardTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
           View itemview = LayoutInflater.from(parent.getContext()).inflate(R.layout.banka_sec_cardtasarim,parent,false);
            return new bankaCardTutucu(itemview);
        }


    @Override
    public void onBindViewHolder(@NonNull bankaCardTutucu holder, final int position) {

        BankaSecViewItem item = Bankalar.get(position);
holder.bind(item);

/*        holder.bind(item, selectionTracker.isSelected(item));
        if (selectionTracker.isSelected(position))
            holder.CardBanka.setCardBackgroundColor(
                    ContextCompat.getColor( this.mContext,R.color.shadow));
        else
            holder.CardBanka.setCardBackgroundColor(
                    ContextCompat.getColor( this.mContext,R.color.cardview_light_background));*/

holder.CardBanka.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        row_index = position;
        notifyDataSetChanged();

    }
});

        if (row_index==position) {
            holder.CardBanka.setCardBackgroundColor(ContextCompat.getColor( this.mContext,R.color.shadow));
        } else {
            holder.CardBanka.setCardBackgroundColor(ContextCompat.getColor( this.mContext,R.color.backround));

        }


       setAnimation(holder.itemView, position);

    }

    @Override
    public int getItemCount() {
        return Bankalar.size();
    }


    private void setAnimation(View viewToAnimate, int position) {
        // If the bound view wasn't previously displayed on screen, it's animated
        if (position > lastPosition) {
            //TranslateAnimation anim = new TranslateAnimation(0,-1000,0,-1000);
            ScaleAnimation anim = new ScaleAnimation(0.0f, 1.0f, 0.0f, 1.0f, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
            //anim.setDuration(new Random().nextInt(501));//to make duration random number between [0,501)
            anim.setDuration(550);//to make duration random number between [0,501)
            viewToAnimate.startAnimation(anim);
            lastPosition = position;

        }
    }

}





