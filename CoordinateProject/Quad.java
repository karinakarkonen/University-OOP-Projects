/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coordinateproject;

/**
 *
 * @author Karina
 */
public class Quad {
    
    private Point p1;
    private Point p2;
    private Point p3;
    private Point p4;
    private double l1;
    private double l2;
    private double l3;
    private double l4;
    private double perimeter;
    
    private void calculatePerimeter(){
        
        this.l1 = this.p1.calculateDistance(this.p2);
        this.l2 = this.p1.calculateDistance(this.p3);
        this.l3 = this.p2.calculateDistance(this.p4);
        this.l4 = this.p3.calculateDistance(this.p4);
        this.perimeter = this.l1 + this.l2 + this.l3 + this.l4;
    }
    
    public Quad(){
        this.p1 = new Point (0,0);
        this.p2 = new Point (1,0);
        this.p3 = new Point (0,1);
        this.p4 = new Point (1,1);
        this.calculatePerimeter();
    }
    
    public Quad(Point p1, Point p2, Point p3, Point p4){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
        this.calculatePerimeter();
    }
    
    public Point getP1(){
        return this.p1;
    }
    
    public Point getP2(){
        return this.p2;
    }
    
    public Point getP3(){
        return this.p3;
    }
    
    public Point getP4(){
        return this.p4;
    }
    
    public double getPerimeter(){
        return this.perimeter;
    }
    
    public void setP1(Point p1){
        this.p1 = p1;
        this.calculatePerimeter();
    }
    
    public void setP2(Point p2){
        this.p2 = p2;
        this.calculatePerimeter();
    }
    
    public void setP3(Point p3){
        this.p3 = p3;
        this.calculatePerimeter();
    }
    
    public void setP4(Point p4){
        this.p4 = p4;
        this.calculatePerimeter();
    }
    
}
