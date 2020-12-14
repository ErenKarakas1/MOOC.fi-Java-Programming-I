/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Eren
 */
public class Book {
    private String name;
    private int pages;
    private int publicYear;
    
    public Book(String initialName, int initialPages, int initialPublicYear){
        this.name = initialName;
        this.pages = initialPages;
        this.publicYear = initialPublicYear;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String toString(){
        return this.name + ", " + this.pages + " pages, " + this.publicYear;
    }
}
