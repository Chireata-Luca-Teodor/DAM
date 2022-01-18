package com.example.stitcher;

import android.view.View;

public class Genres {
    private String comedy;
    private String news;
    private String trueCrime;
    private String business;
    private String societyCulture;
    private String sports;
    private String healthFitness;
    private String arts;
    private String history;
    private String science;
    private String technology;
    private String fiction;

    public Genres(String comedy, String news, String trueCrime, String business, String societyCulture, String sports,
                  String healthFitness, String arts, String history, String science, String technology, String fiction) {
        this.comedy = comedy;
        this.news = news;
        this.trueCrime = trueCrime;
        this.business = business;
        this.societyCulture = societyCulture;
        this.sports = sports;
        this.healthFitness = healthFitness;
        this.arts = arts;
        this.history = history;
        this.science = science;
        this.technology = technology;
        this.fiction = fiction;
    }

    public Genres() {
    }

    public View.OnClickListener getComedy() {
        return null;
    }

    public void setComedy(String comedy) {
        this.comedy = comedy;
    }

    public View.OnClickListener getNews() {
        return null;
    }

    public void setNews(String news) {
        this.news = news;
    }

    public View.OnClickListener getTrueCrime() {
        return null;
    }

    public void setTrueCrime(String trueCrime) {
        this.trueCrime = trueCrime;
    }

    public View.OnClickListener getBusiness() {
        return null;
    }

    public void setBusiness(String business) {
        this.business = business;
    }

    public View.OnClickListener getSocietyCulture() {
        return null;
    }

    public void setSocietyCulture(String societyCulture) {
        this.societyCulture = societyCulture;
    }

    public View.OnClickListener getSports() {
        return null;
    }

    public void setSports(String sports) {
        this.sports = sports;
    }

    public View.OnClickListener getHealthFitness() {
        return null;
    }

    public void setHealthFitness(String healthFitness) {
        this.healthFitness = healthFitness;
    }

    public View.OnClickListener getArts() {
        return null;
    }

    public void setArts(String arts) {
        this.arts = arts;
    }

    public View.OnClickListener getHistory() {
        return null;
    }

    public void setHistory(String history) {
        this.history = history;
    }

    public View.OnClickListener getScience() {
        return null;
    }

    public void setScience(String science) {
        this.science = science;
    }

    public View.OnClickListener getTechnology() {
        return null;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    public View.OnClickListener getFiction() {
        return null;
    }

    public void setFiction(String fiction) {
        this.fiction = fiction;
    }

    @Override
    public String toString() {
        return "Genres{" +
                "comedy='" + comedy + '\'' +
                ", news='" + news + '\'' +
                ", trueCrime='" + trueCrime + '\'' +
                ", business='" + business + '\'' +
                ", societyCulture='" + societyCulture + '\'' +
                ", sports='" + sports + '\'' +
                ", healthFitness='" + healthFitness + '\'' +
                ", arts='" + arts + '\'' +
                ", history='" + history + '\'' +
                ", science='" + science + '\'' +
                ", technology='" + technology + '\'' +
                ", fiction='" + fiction + '\'' +
                '}';
    }
}
