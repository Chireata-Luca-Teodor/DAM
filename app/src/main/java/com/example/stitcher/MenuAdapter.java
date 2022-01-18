package com.example.stitcher;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;

import java.util.List;

public class MenuAdapter extends BaseAdapter {

    private List<Genres> list;

    public MenuAdapter(List<Genres> list) {
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View itemView = inflater.inflate(R.layout.item_genres, parent,false);
        Button b_comedy = itemView.findViewById(R.id.btnComedy);
        Button b_news = itemView.findViewById(R.id.btnNews);
        Button b_trueCrime = itemView.findViewById(R.id.btnTrueCrime);
        Button b_business = itemView.findViewById(R.id.btnBusiness);
        Button b_societyCulture = itemView.findViewById(R.id.btnSocietyCulture);
        Button b_sports = itemView.findViewById(R.id.btnSports);
        Button b_healthFitness = itemView.findViewById(R.id.btnHealthFitness);
        Button b_arts = itemView.findViewById(R.id.btnArts);
        Button b_history = itemView.findViewById(R.id.btnHistory);
        Button b_science = itemView.findViewById(R.id.btnScience);
        Button b_technology = itemView.findViewById(R.id.btnTechnology);
        Button b_fiction = itemView.findViewById(R.id.btnFiction);
        Genres current = list.get(position);
        b_comedy.setOnClickListener(current.getComedy());
        b_news.setOnClickListener(current.getNews());
        b_trueCrime.setOnClickListener(current.getTrueCrime());
        b_business.setOnClickListener(current.getBusiness());
        b_societyCulture.setOnClickListener(current.getSocietyCulture());
        b_sports.setOnClickListener(current.getSports());
        b_healthFitness.setOnClickListener(current.getHealthFitness());
        b_arts.setOnClickListener(current.getArts());
        b_history.setOnClickListener(current.getHistory());
        b_science.setOnClickListener(current.getScience());
        b_technology.setOnClickListener(current.getTechnology());
        b_fiction.setOnClickListener(current.getFiction());
        return itemView;
    }
}
