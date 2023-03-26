/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaphase1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Intersection {
      private List<Segment> segments;
    private List<Phase> phases;
    private List<Vehicle> vehicles;
    private int co2;

    public Intersection() {
        segments = new ArrayList<>();
        phases = new ArrayList<>();
        vehicles = new ArrayList<>();
    }
  
    public void readSegments(String filename) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line = br.readLine();
            while (line != null) {
                String[] data = line.split(",");
                Segment segment = new Segment(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]));
                segments.add(segment);
                line = br.readLine();
            }
        } catch (IOException ex) {
            Logger.getLogger(Intersection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void readPhases(String filename) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line = br.readLine();
            while (line != null) {
                String[] data = line.split(",");
                Phase phase = new Phase(data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]));
                phases.add(phase);
                line = br.readLine();
            }
        } catch (IOException ex) {
            Logger.getLogger(Intersection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void readVehicles(String filename) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line = br.readLine();
            while (line != null) {
                String[] data = line.split(",");
          
                Vehicle vehicle = new Vehicle(data[0],data[1], Integer.parseInt(data[2]),data[3], Integer.parseInt(data[4]),Integer.parseInt(data[5]),data[6],data[7],Integer.parseInt(data[8]));
                vehicles.add(vehicle);
               
            
               line = br.readLine();
            }
        } catch (IOException ex) {
            Logger.getLogger(Intersection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void readCO2(String filename) {
        try {
            BufferedReader br = new BufferedReader(new FileReader(filename));
            String line = br.readLine();
            while (line != null) {
                String[] data = line.split(",");
                co2 = Integer.parseInt(data[0]);
                line = br.readLine();
            }
        } catch (IOException ex) {
            Logger.getLogger(Intersection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public List<Segment> getSegments() {
        return segments;
    }

    public List<Phase> getPhases() {
        return phases;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }


    public int getCO2() {
        return co2;
    }

    public void setCO2(int co2) {
        this.co2 = co2;
    }
    //method that estimates the CO2 emission
    public int estimateCO2() {
        int co2 = 0;
        for (Vehicle vehicle : vehicles) {
            co2 += vehicle.getCO2();
        }
        return co2;
    }

    public void addSegment(Segment segment) {
        segments.add(segment);
    }


    public void addPhase(Phase phase) {
        phases.add(phase);
    }

    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    public void removeSegment(Segment segment) {
        segments.remove(segment);
    }


   

}
