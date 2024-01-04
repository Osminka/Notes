package com.example.javanotes2710;

import androidx.cardview.widget.CardView;

import com.example.javanotes2710.Models.Notes;

public interface NotesClickListener {

    void onClick(Notes notes);
    void onLongClick(Notes notes, CardView cardView);

}
