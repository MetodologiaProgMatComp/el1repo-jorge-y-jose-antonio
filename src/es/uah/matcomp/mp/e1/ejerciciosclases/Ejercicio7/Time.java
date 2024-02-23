package es.uah.matcomp.mp.e1.ejerciciosclases.Ejercicio7;

public class Time {
    private int hour;
    private int minute;
    private int second;

    public Time(int h,int m,int s) {
        this.hour = h;
        this.minute = m;
        this.second = s;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public void setTime(int hour,int minute,int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public String toString() {

        return String.format("%02d",hour) + ":" + String.format("%02d",minute) + ":" + String.format("%02d",second);

    }

    public Time nextSecond() {
        if (second==59){
            this.second = 0;
            if (minute==59){
                this.minute = 0;
                if (hour==23){
                    this.hour = 0;
                } else {
                    this.hour = hour+1;
                }
            } else {
                this.minute = minute+1;
            }
        } else {
            this.second = second+1;
        }

        return this;
    }

    public Time previousSecond() {
        if (second==0){
            this.second = 59;
            if (minute==0){
                this.minute = 59;
                if (hour==0){
                    this.hour = 23;
                } else {
                    this.hour = hour-1;
                }
            } else {
                this.minute = minute-1;
            }
        } else {
            this.second = second-1;
        }

        return this;
    }
}
