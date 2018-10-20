package com.permana.belajarmembaca;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    CardAdapter adapter;
    List<CardData> cardDataList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cardDataList = addData();
        recyclerView = findViewById(R.id.recycler_view);
        adapter = new CardAdapter(cardDataList, getApplicationContext());
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);
    }

    private List<CardData> addData(){
        List<CardData> cardDataList = new ArrayList<>();
        cardDataList.add(new CardData(R.drawable.abjad, R.string.abjad));
        cardDataList.add(new CardData(R.drawable.vokal, R.string.vokal));
        cardDataList.add(new CardData(R.drawable.konsonan, R.string.konsonan));
        cardDataList.add(new CardData(R.drawable.diftong, R.string.diftong));

        return cardDataList;
    }
}
