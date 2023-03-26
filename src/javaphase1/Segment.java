/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaphase1;

import java.util.ArrayList;
import java.util.List;

public class Segment {
     private String name;
    private int length;
    private int capacity;
    private List<Vehicle> vehicles;

    public Segment(String name, int length, int capacity) {
        this.name = name;
        this.length = length;
        this.capacity = capacity;
        vehicles = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getLength() {
        return length;
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }
}
