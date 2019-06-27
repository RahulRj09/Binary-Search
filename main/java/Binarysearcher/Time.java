package Binarysearcher;

public class Time implements Comparable{
    private  int hour;
    public Time(int hour) {
        this.hour = hour;
    }
    @Override
    public int compareTo(Object o) {
        return hour;
    }
}
