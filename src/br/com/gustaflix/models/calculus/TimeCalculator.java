package br.com.gustaflix.models.calculus;

import br.com.gustaflix.models.Movie;
import br.com.gustaflix.models.Serie;
import br.com.gustaflix.models.Title;

public class TimeCalculator {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

   // public void include(Movie m){
   //     totalTime += m.getDurationInMinutes();
   // }

   // public void include(Serie s){
   //     totalTime += s.getDurationInMinutes();
   // }

    public void include(Title title){
        this.totalTime += title.getDurationInMinutes();
    }
}
