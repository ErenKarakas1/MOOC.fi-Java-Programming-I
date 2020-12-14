/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eren
 */
public class Cube {
    private int edgeHeight;
    
    public Cube(int edgeHeight){
        this.edgeHeight = edgeHeight;
    }
    
    public int volume(){
        return this.edgeHeight * this.edgeHeight * this.edgeHeight;
    }
    
    public String toString(){
        return "The length of the edge is " + this.edgeHeight + " and the volume " + this.volume();
    }
}
