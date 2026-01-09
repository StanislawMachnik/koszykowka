package com.pt2.bolls;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PunktyViewModel extends ViewModel {
    private MutableLiveData<Integer> score;


    public MutableLiveData<Integer> getScore() {
        if(score == null){
            score = new MutableLiveData<>();
            score.setValue(0);
        }
        return score;
    }

    public void setScore(MutableLiveData<Integer> score) {
        if(score == null){
            score = new MutableLiveData<>();
            score.setValue(0);
        }
        this.score = score;
    }

    public void addPunkty(int s){
        int points = getScore().getValue();
        score.setValue(points + s);
    }
}
