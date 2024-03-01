package es.uah.matcomp.mp.e1.ejerciciosclases.Parte1.Ejercicio7;

public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second){

        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }

    public int getHour(){

        return hour;

    }

    public int getMinute(){

        return minute;

    }

    public int getSecond(){

        return second;

    }

    public void setHour(int hour){

        this.hour = hour;

    }

    public void setMinute(int minute){

        this.minute = minute;

    }

    public void setSecond(int second){

        this.second = second;

    }

    public void setTime(int hour, int minute, int second){

        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }

    public boolean a = true;
    public String toString(){

        if (hour < 10){

            if (minute < 10) {

                if (second < 10) {

                    return "0" + hour + " :  0" + minute + " :  0" + second;

                } else {

                    return "0" + hour + " :  0" + minute + " : " + second;

                }
            }else {

                if (second < 10) {

                    return "0" + hour + " : " + minute + " :  0" + second;

                } else {

                    return "0" + hour + " : " + minute + " : " + second;

                }

            }

        } else if (minute < 10) {

            if (second < 10){

                return hour + " :  0" + minute + " :  0" + second;

            }else {

                return hour + " :  0" + minute + " : " + second;

            }

        } else if (second < 10) {

            return hour + " : " + minute + " :  0" + second;

        }else {

            return hour + " : " + minute + " : " + second;

        }

    }

    public Time nextSecond(){

        Time tiempo = new Time(this.hour,this.minute,this.second);

        tiempo.second = tiempo.second + 1;

        if (tiempo.second > 59){

            tiempo.setTime(tiempo.hour, tiempo.minute + 1, 0);

            if (tiempo.minute > 59){

                tiempo.setTime(tiempo.hour + 1,0,0);

                if (tiempo.hour > 23){

                    tiempo.setTime(0,0,0);

                }

            }

        }

        this.hour = tiempo.hour;
        this.minute = tiempo.minute;
        this.second = tiempo.second;

        return tiempo;

    }

    public Time previousSecond(){

        Time tiempo = new Time(this.hour,this.minute,this.second);

        tiempo.second = tiempo.second - 1;

        if (tiempo.second < 0){

            tiempo.setTime(tiempo.hour, tiempo.minute - 1, 59);

            if (tiempo.minute < 0) {

                tiempo.setTime(tiempo.hour - 1, 59, tiempo.second);

                if (tiempo.hour < 0){

                    tiempo.setTime(23,59,59);

                }

            }

        }

        this.hour = tiempo.hour;
        this.minute = tiempo.minute;
        this.second = tiempo.second;

        return tiempo;

    }

}
