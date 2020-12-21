/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eren
 */
import java.util.ArrayList;

public class Grades {
    private ArrayList<Integer> points;
    
    public Grades(){
        this.points = new ArrayList<>();
    }
    
    public void addPoint(int point){
        if (point > -1 && point < 101){
            this.points.add(point);
        }
    }
    
    public ArrayList<Integer> getArray(){
        return this.points;
    }
    
    public int toGrade(int point){
        if (point < 50){
            return 0;
        }
        if (point < 60){
            return 1;
        }
        if (point < 70){
            return 2;
        }
        if (point < 80){
            return 3;
        }
        if (point < 90){
            return 4;
        } else {
            return 5;
        }       
    }
    
    public double getAverage(){
        int sum = 0;
        for (Integer point : this.points){
            sum += point;
        }
        return (double) sum / this.points.size();
    }
}
