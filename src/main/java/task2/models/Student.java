package task2.models;

import task2.interfaces.Alarm;
import task2.interfaces.AverageRating;

public class Student extends Human implements AverageRating, Alarm {
    private double avgRating;
    private String favouriteSubject;

    private String alarmWakeScholar;

    @Override
    public double addAvgRating(double newAvgRating) {
        avgRating += newAvgRating;
        return avgRating;
    }

    @Override
    public boolean isHigherAvgRating(double avgRating) {
        return this.avgRating > avgRating;
    }

    public Student(String name, int age, boolean gender, double avgRating, String favouriteSubject, String alarmWakeScholar) {
        super(name, age, gender);
        this.avgRating = avgRating;
        this.favouriteSubject = favouriteSubject;
        this.alarmWakeScholar = alarmWakeScholar;
    }

    public Student(String name, int age, boolean gender, double avgRating) {
        super(name, age, gender);
        this.avgRating = avgRating;
    }

    public double getAvgRating() {
        return avgRating;
    }

    public void setAvgRating(double avgRating) {
        this.avgRating = avgRating;
    }

    public String getFavouriteSubject() {
        return favouriteSubject;
    }

    public void setFavouriteSubject(String favouriteSubject) {
        this.favouriteSubject = favouriteSubject;
    }

    @Override
    public void changeAlarm(String newAlarm) {
        alarmWakeScholar = newAlarm;
    }

    @Override
    public boolean isDisabled() {
        return alarmWakeScholar == null || alarmWakeScholar.isBlank();
    }

    public String getAlarmWakeScholar() {
        return alarmWakeScholar;
    }

    public void setAlarmWakeScholar(String alarmWakeScholar) {
        this.alarmWakeScholar = alarmWakeScholar;
    }
}
