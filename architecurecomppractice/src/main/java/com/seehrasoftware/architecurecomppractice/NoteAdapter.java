package com.seehrasoftware.architecurecomppractice;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class NoteAdapter extends RecyclerView.Adapter<NoteAdapter.NoteItemViewHolder> {

    private List<Note> notes = new ArrayList<>();

    @NonNull
    @Override
    public NoteItemViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.rv_item, parent, false);
        return new NoteItemViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull NoteItemViewHolder holder, int position) {
        Note note = notes.get(position);
        holder.tvTilte.setText(note.getTitle());
        holder.tvDescription.setText(note.getDescription());
        holder.tvPriority.setText(String.valueOf(note.getPriority()));
    }

    @Override
    public int getItemCount() {
        return notes.size();
    }


    public void setNoteList(List<Note> list) {
        notes = list;
        notifyDataSetChanged();
    }

    class NoteItemViewHolder extends RecyclerView.ViewHolder {

        public TextView tvTilte, tvDescription, tvPriority;

        public NoteItemViewHolder(@NonNull View itemView) {
            super(itemView);
            tvTilte = itemView.findViewById(R.id.tvTitle);
            tvDescription = itemView.findViewById(R.id.tvDescription);
            tvPriority = itemView.findViewById(R.id.tvPriority);

        }
    }


}
