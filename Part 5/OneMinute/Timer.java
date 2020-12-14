/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eren
 */
public class Timer {
    private int hundreths;
    private int seconds;
    
    public Timer(){
        this.hundreths = 0;
        this.seconds = 0;
    }
    
    public String converter(int initialValue){
        if (initialValue < 10){
            return "0" + initialValue;
        }
        return String.valueOf(initialValue);
    }
    public String toString(){
        return converter(seconds) + ":" + converter(hundreths);
    }
    
    public void advance(){
        this.hundreths++;
        if (this.hundreths == 100){
            this.hundreths = 0;
            this.seconds++;
            if (this.seconds == 60){
                this.seconds = 0;
            }
        }
    }
}
