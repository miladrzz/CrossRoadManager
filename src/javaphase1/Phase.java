/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaphase1;

import java.util.ArrayList;
import java.util.List;

public class Phase {
     private String name;
    private int duration;
    private int green;
    private List<Segment> segments;

    public Phase(String name, int duration, int green) {
        this.name = name;
        this.duration = duration;
        this.green = green;
        segments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getDuration() {
        return duration;
    }

    public int getGreen() {
        return green;
    }

    public List<Segment> getSegments() {
        return segments;
    }

    public void addSegment(Segment segment) {
        segments.add(segment);
    }
    
     public void removeSegment(Segment segment) {
        segments.remove(segment);
    }

    public void removeSegment(String name) {
        for (Segment segment : segments) {
            if (segment.getName().equals(name)) {
                segments.remove(segment);
                break;
            }
        }
    }

    public void removeSegment(int index) {
        segments.remove(index);
    }

    public void clearSegments() {
        segments.clear();
    }

    public String ToString() {
        System.out.println("Phase: " + name + " Duration: " + duration + " Green: " + green);
        for (Segment segment : segments) {
            System.out.println("Segment: " + segment.getName() + " Length: " + segment.getLength() + " Capacity: " + segment.getCapacity());
        }
        return  name + "," + duration + "," + green;
    }
    
}
