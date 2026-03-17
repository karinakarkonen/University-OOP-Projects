/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coordinateproject;

/**
 *
 * @author Karina
 */
public class Line {
    
    private Point p1;
    private Point p2;
    private double length;
    
    public Line(Point p1, Point p2){
        
        this.p1=p1;
        this.p2=p2;
        this.length=this.p1.calculateDistance(this.p2);
        
    }
    
    public Line(){
        
        this.p1= new Point();
        this.p2=new Point();
        this.length=this.p1.calculateDistance(this.p2);
    }
    
    public Point getP1(){
        return this.p1;
    }
    
    public Point getP2(){
        return this.p2;
    }
    
    public double getLength(){
        return this.length;
    }
    
    public void setP1(Point p1){
        this.p1=p1;
        this.length=this.p1.calculateDistance(this.p2);
    }
    
    public void setP2( Point p2){
        this.p2=p2;
        this.length=this.p2.calculateDistance(this.p1);
    }
    
    
}
