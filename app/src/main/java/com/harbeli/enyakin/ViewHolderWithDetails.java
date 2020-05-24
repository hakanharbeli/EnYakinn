package com.harbeli.enyakin;


import androidx.recyclerview.selection.ItemDetailsLookup;

/**
 * Created by brijesh on 27/3/18.
 */

public interface ViewHolderWithDetails {
    ItemDetailsLookup.ItemDetails getItemDetails();
}