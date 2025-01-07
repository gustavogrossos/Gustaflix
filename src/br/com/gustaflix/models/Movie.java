package br.com.gustaflix.models;

public class Movie {
    private String name;
    private int yearOfRelease;
    private boolean includeInThePlan;
    private double sumReviews;
    private int totalReviews;
    private int durationInMinutes;

    public int getTotalReviews(){
        return totalReviews;
    }

    double getSumReviews(){
        return sumReviews;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIncludeInThePlan(boolean includeInThePlan) {
        this.includeInThePlan = includeInThePlan;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public void setDurationInMinutes(int durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    public String getName() {
        return name;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public boolean isIncludeInThePlan() {
        return includeInThePlan;
    }

    public int getDurationInMinutes() {
        return durationInMinutes;
    }

    public void informations(){
        System.out.println("Name: " + name);
        System.out.println("Year of realise: " + yearOfRelease);
    }

    public void review(double score){
        sumReviews += score;
        totalReviews++;
    }

    public double mediaReviews(){
        return sumReviews / totalReviews;
    }


}
