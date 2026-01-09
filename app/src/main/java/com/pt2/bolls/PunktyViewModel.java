package com.pt2.bolls;

import androidx.lifecycle.ViewModel;

public class PunktyViewModel extends ViewModel {
    private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    public void addPunkty(int s){
        score += s;
    }
}
