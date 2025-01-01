package com.example.likecomment;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    ArrayList<dataclass> items;

    public Adapter(ArrayList<dataclass> items) {
        this.items = items;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);
        // Inflate the custom layout for individual list items
        View view = inflater.inflate(R.layout.activity_main, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        dataclass dataclass = items.get(position);
        // Bind the data to the UI components
        holder.image1.setImageResource(dataclass.getImageId1());
        holder.image2.setImageResource(dataclass.getImageId2());
        holder.like.setImageResource(dataclass.getLikeId());
        holder.comment.setImageResource(dataclass.getCommentId());
        holder.share.setImageResource(dataclass.getShareId());
        holder.text1.setText(dataclass.getText1());
        holder.hrs.setText(dataclass.getHrs());
        holder.allText.setText(dataclass.getAllText());
        // Additional binding if needed for like, comment, etc.
    }

    @Override
    public int getItemCount() {
        if (items == null)
            return 0;
        return items.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ImageView image1, image2, like, comment, share;
        TextView text1, hrs, allText;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image1 = itemView.findViewById(R.id.imageView);
            image2 = itemView.findViewById(R.id.image2);
            like = itemView.findViewById(R.id.like);
            comment = itemView.findViewById(R.id.comment);
            share = itemView.findViewById(R.id.share);
            text1 = itemView.findViewById(R.id.te1);
            hrs = itemView.findViewById(R.id.hrs);
            allText = itemView.findViewById(R.id.all_te);
        }
    }
}
