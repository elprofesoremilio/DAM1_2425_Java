package EjerciciosClase.ClasesYObjetos.Fecha;

import java.util.Random;

public class Fecha {
    private int day;
    private int month;
    private int year;

    public Fecha(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public void setMonth(int month) {
        this.month = month;
    }
    public void setDay(int day) {
        this.day = day;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public void setFecha(int day, int month, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public int getDay() {
        return day;
    }
    public int getMonth() {
        return month;
    }
    public int getYear() {
        return year;
    }

    public boolean esValida() {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if (day>=1 && day<=31) {
                    return true;
                } else {
                    return false;
                }
            case 4: case 6: case 9: case 11:
                return (day>=1 && day<=30);
            case 2:
                return (day>=1 && day<=28);
            default:
                return false;
        }
    }

    public String formatear() {
        return day + "/" + month + "/" + year;
    }


}
