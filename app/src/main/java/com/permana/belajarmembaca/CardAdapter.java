package com.permana.belajarmembaca;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import java.util.List;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.CardViewHolder> {

    List<CardData> cardDataList;
    Context context;

    public CardAdapter(List<CardData> cardDataList, Context context) {
        this.cardDataList = cardDataList;
        this.context = context;
    }

    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.card_view, parent, false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        final int imageId = cardDataList.get(position).getImageId();
        final int stringId = cardDataList.get(position).getStringId();
        holder.imageView.setImageResource(imageId);
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, VokalActivity.class);
                intent.putExtra("CARD_IMAGE", imageId);
                intent.putExtra("CARD_STRING", stringId);
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return (cardDataList != null) ? cardDataList.size() : 0;
    }

    class CardViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;

        public CardViewHolder(View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.image_view);
        }
    }
}
