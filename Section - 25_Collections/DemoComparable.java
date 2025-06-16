/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collection;

import java.util.TreeSet;

/**
 *
 * @author Dell
 */

class Point implements Comparable{

    public int x;
    public int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    @Override
    public int compareTo(Object o) {
        Point p = (Point)o;
        if(this.x>p.x) return 1;
        else if(this.x<p.x)return -1;
        else{
            if(this.y > p.y ) return 1;
            else if(this.y < p.y) return -1;
            else return 0;
        }
    }

    @Override
    public String toString() {
        return "Point{" + "x=" + x + ", y=" + y + '}';
    }
    
    
}
public class DemoComparable {
    public static void main(String[] args) {
        TreeSet<Point> p = new TreeSet<>();
        p.add(new Point(1,2));
        p.add(new Point(2,2));
        p.add(new Point(3,2));
        p.add(new Point(3,5));
        p.add(new Point(1,3));
        
        p.forEach(x -> System.out.println(x));
    }
}
