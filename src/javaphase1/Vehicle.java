/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaphase1;

import java.util.ArrayList;
import java.util.List;
public class Vehicle {
     private String name;
    private int length;
    private int speed;
    private String Type;
    private int position;
    private int ClosingTime;
    private String Direction;
    private int emmision;
    private String status;
    private List<Segment> segments;
    private String segment;

    public Vehicle(String name, int length, int speed) {
        this.name = name;
        this.length = length;
        this.speed = speed;
        segments = new ArrayList<>();
    }
    
     public Vehicle(String name, String Type, int ClosingTime,String Direction,int length,int emmision,String status,String segment,int speed)
     {
        this.name = name;
        this.Type =Type;
        this.ClosingTime=ClosingTime;
        this.Direction=Direction;
        this.length = length;
        this.emmision=emmision;
        this.status=status;
        this.segment=segment;
        this.speed = speed;
         this.segments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

    public int getSpeed() {
        return speed;
    }

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public List<Segment> getSegments() {
        return segments;
    }

    public void addSegment(Segment segment) {
        getSegments().add(segment);
    }
    public int getCO2() {
        int co2 = 0;
        for (Segment segment : getSegments()) {
            co2 += (segment.getLength() * 0.1) * (segment.getCapacity() * 0.1);
        }
        return co2;
    }
    
    //Vehicle(String name, int Type, int ClosingTime,String Direction,int length,int emmision,String status,int segment,int speed)
    public String ToString()
    {
          return getName() +"," + getType() + "," + getClosingTime() + "," + getDirection() + "," + getLength() + "," + getEmmision() + "," + getStatus() + "," + getSegment() + "," + getSpeed();    


    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param length the length to set
     */
    public void setLength(int length) {
        this.length = length;
    }

    /**
     * @param speed the speed to set
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * @return the Type
     */
    public String getType() {
        return Type;
    }

    /**
     * @param Type the Type to set
     */
    public void setType(String Type) {
        this.Type = Type;
    }

    /**
     * @return the ClosingTime
     */
    public int getClosingTime() {
        return ClosingTime;
    }

    /**
     * @param ClosingTime the ClosingTime to set
     */
    public void setClosingTime(int ClosingTime) {
        this.ClosingTime = ClosingTime;
    }

    /**
     * @return the Direction
     */
    public String getDirection() {
        return Direction;
    }

    /**
     * @param Direction the Direction to set
     */
    public void setDirection(String Direction) {
        this.Direction = Direction;
    }

    /**
     * @return the emmision
     */
    public int getEmmision() {
        return emmision;
    }

    /**
     * @param emmision the emmision to set
     */
    public void setEmmision(int emmision) {
        this.emmision = emmision;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @param segments the segments to set
     */
    public void setSegments(List<Segment> segments) {
        this.segments = segments;
    }

    /**
     * @return the segment
     */
    public String getSegment() {
        return segment;
    }

    /**
     * @param segment the segment to set
     */
    public void setSegment(String segment) {
        this.segment = segment;
    }

    
}
