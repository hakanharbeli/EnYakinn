package com.harbeli.enyakin;

import androidx.annotation.Nullable;
import androidx.recyclerview.selection.ItemDetailsLookup;


/**
 * Created by brijesh on 27/3/18.
 */

public class MyItemDetail extends ItemDetailsLookup.ItemDetails {
    private final int adapterPosition;
    private final BankaSecViewItem selectionKey;

    public MyItemDetail(int adapterPosition, BankaSecViewItem selectionKey) {
        this.adapterPosition = adapterPosition;
        this.selectionKey = selectionKey;
    }

    @Override
    public int getPosition() {
        return adapterPosition;
    }

    @Nullable
    @Override
    public Object getSelectionKey() {
        return selectionKey;
    }
}