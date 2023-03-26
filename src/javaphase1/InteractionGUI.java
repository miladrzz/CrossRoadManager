/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaphase1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 
 */
public class InteractionGUI extends javax.swing.JFrame {

    /**
     * Creates new form InteractionGUI
     */
      DefaultTableModel model ;
      DefaultTableModel modelphases ;
      DefaultTableModel modelstatatics;
      
     //Code for read vehicle
      private void  GetVehicleData()
      {
          String file="D:\\vehicle.csv";

         String line = null;

            try {
    
             
    
                FileReader fileReader =     new FileReader(file);
    
                // Always wrap FileReader in BufferedReader.
    
                BufferedReader bufferedReader = 
    
                    new BufferedReader(fileReader);
    
                while((line = bufferedReader.readLine()) != null) {
    
                    System.out.println(line);
    
                    String[] tokens = line.split(",");
    
                   // model.addRow(new Object[]{tokens[0],tokens[1],tokens[2],tokens[3],tokens[4],tokens[5],tokens[6],tokens[7]});
    
                }   
    
                // Always close files.
    
                bufferedReader.close();         
    
            }
    
            catch(FileNotFoundException ex) {
    
                System.out.println(
    
                    "Unable to open file '" + 
    
                    file + "'");                
    
            }
    
            catch(IOException ex) {
    
                System.out.println(
    
                    "Error reading file '" 
    
                    + file + "'");                  
    
                // Or we could just do this: 
    
                // ex.printStackTrace();
    
            }   
      }
      
      
      //code for read statastics
       private void  GetStatasticsData()
      {
          String file="D:\\Statistics.csv";

         String line = null;

            try {
    
             
    
                FileReader fileReader =     new FileReader(file);
    
                // Always wrap FileReader in BufferedReader.
    
                BufferedReader bufferedReader = 
    
                    new BufferedReader(fileReader);
    
                while((line = bufferedReader.readLine()) != null) {
    
                    System.out.println(line);
    
                    String[] tokens = line.split(",");
    
                  //  modelstatatics.addRow(new Object[]{tokens[0],tokens[1],tokens[2],tokens[3]});
    
                }   
    
                // Always close files.
    
                bufferedReader.close();         
    
            }
    
            catch(FileNotFoundException ex) {
    
                System.out.println(
    
                    "Unable to open file '" + 
    
                    file + "'");                
    
            }
    
            catch(IOException ex) {
    
                System.out.println(
    
                    "Error reading file '" 
    
                    + file + "'");                  
    
                // Or we could just do this: 
    
                // ex.printStackTrace();
    
            }   
      }
      
      
      //Code for read Phases
       private void  GetPhasesData()
      {
          String file="D:\\intersection.csv";

         String line = null;

            try {
    
             
    
                FileReader fileReader =     new FileReader(file);
    
            
    
                BufferedReader bufferedReader = 
    
                    new BufferedReader(fileReader);
    
                while((line = bufferedReader.readLine()) != null) {
    
                    System.out.println(line);
    
                    String[] tokens = line.split(",");
    
                  //  modelphases.addRow(new Object[]{tokens[0],tokens[1]});
    
                }   
    
               
    
                bufferedReader.close();         
    
            }
    
            catch(FileNotFoundException ex) {
    
                System.out.println(
    
                    "Unable to open file '" + 
    
                    file + "'");                
    
            }
    
            catch(IOException ex) {
    
                System.out.println(
    
                    "Error reading file '" 
    
                    + file + "'");                  
    
                
    
            }   
      }
       
    public InteractionGUI() {
        initComponents();
        
         String[] vehicleColumnNames = {  "Vehicle", "Type", "Closing Time" ,"Direction" ,"length","emmision","status","segment"};
        jTableVehicle.setModel(new javax.swing.table.DefaultTableModel(
           // new Object [][] {
            //    {null, null, null, null, null, null, null, null}
           // },
                null,
            vehicleColumnNames
        ));
        
        model = (DefaultTableModel) jTableVehicle.getModel();
     //   model.addRow(new Object[]{"","","","","","","",""});
        
        String[] phasesColumnNames = { "Phase", "Duration" };
        
        jTablePhases.setModel(new javax.swing.table.DefaultTableModel(
            //new Object [][] {
              //  {null, null}
            //},
                null,
            phasesColumnNames
        ));
        
         modelphases = (DefaultTableModel) jTablePhases.getModel();
       // modelphases.addRow(new Object[]{"",""});
        
        String[] statisticsColumnNames = { "Segment", "Waiting time", "Wiating Length", "Cross Time"};
        
                
       jTableStatastics.setModel(new javax.swing.table.DefaultTableModel(
            //new Object [][] {
                //{null, null, null, null}
            //}, 
             null,
            statisticsColumnNames
        ));
        
         modelstatatics = (DefaultTableModel) jTableStatastics.getModel();
       // modelstatatics.addRow(new Object[]{"","","",""});
        
        
        jTableVehicleAdd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
               {null, null, null, null, null, null, null, null}
            },
                
            vehicleColumnNames
        ));
        
        DefaultTableModel modeladd = (DefaultTableModel) jTableVehicleAdd.getModel();
      //  modeladd.addRow(new Object[]{"","","","","","","",""});
                
      GetVehicleData();
      GetPhasesData();
      GetStatasticsData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableVehicle = new javax.swing.JTable();
        jButtonCancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePhases = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableStatastics = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableVehicleAdd = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldCO2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButtonAdd = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jTableVehicle.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableVehicle);

        jButtonCancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonCancel.setText("Cancel");
        jButtonCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Vehicles");

        jTablePhases.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTablePhases);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("Statastics");

        jTableStatastics.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTableStatastics);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setText("Phases");

        jTableVehicleAdd.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(jTableVehicleAdd);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel4.setText("Add Vehicle");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Kg");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("CO2");

        jButtonAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });

        jButtonExit.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButtonExit.setText("Exit");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(176, 176, 176))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 531, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(229, 229, 229)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(199, 199, 199)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jTextFieldCO2, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel5))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 772, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(256, 256, 256)
                        .addComponent(jLabel4))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(478, 478, 478)
                        .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 44, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(636, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(611, 611, 611)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(318, 318, 318)
                    .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(965, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(45, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(60, 60, 60)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldCO2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(29, 29, 29)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(59, 59, 59)
                    .addComponent(jLabel3)
                    .addContainerGap(588, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(656, Short.MAX_VALUE)
                    .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jButtonCancelActionPerformed

    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        // TODO add your handling code here:
  
       String[][]  vehicleData = new String[jTableVehicleAdd.getRowCount()][jTableVehicleAdd.getColumnCount()];
        for (int i = 0; i < jTableVehicleAdd.getRowCount(); i++) {
            for (int j = 0; j < jTableVehicleAdd.getColumnCount(); j++) {
                vehicleData[i][j] = (String) jTableVehicleAdd.getValueAt(i, j);
            }
        }

       
        for (int i = 0; i < vehicleData.length; i++) {
            model.addRow(vehicleData[i]);
        }
        
       
          
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        // TODO add your handling code here:
         try {
                    FileWriter fw = new FileWriter("D:\\statistics1.txt");
                    BufferedWriter bw = new BufferedWriter(fw);
                    for (int i = 0; i < jTableStatastics.getRowCount(); i++) {//rows
                        for (int j = 0; j < jTableStatastics.getColumnCount(); j++) {//columns
                            bw.write(jTableStatastics.getModel().getValueAt(i, j)+"\t");
                        }
                        bw.write("\n");//break line at the begin


                    }
                    bw.close();
                    fw.close();
                    JOptionPane.showMessageDialog(null, "Report generated successfully");
                    System.exit(0);
                } catch (IOException ex) {

                }
         
         ////////////////////////////////////////////////////
          int CO2= Integer.parseInt(jTextFieldCO2.getText());

         //get TotalWaitingTime from jTableStatistics
          String[][]  statisticsData = new String[jTableStatastics.getRowCount()][jTableStatastics.getColumnCount()];

         for (int i = 0; i < jTableStatastics.getRowCount(); i++) {
            for (int j = 0; j < jTableStatastics.getColumnCount(); j++) {
                statisticsData[i][j] = (String) jTableStatastics.getValueAt(i, j);
            }

            }
            int TotalWaitingTime= Integer.parseInt(statisticsData[0][1]);

           



      
        int TotalVehiclecross= model.getRowCount();
        int TotalEmissions= TotalVehiclecross*CO2;
        int AverageWaitingTime= TotalWaitingTime/TotalVehiclecross;
        
             try{
              FileWriter fw = new FileWriter("D:\\Statistics2.txt");
              BufferedWriter bw = new BufferedWriter(fw);
              PrintWriter pw = new PrintWriter(bw);
              pw.println("Total number of vehicles crossed per phase: " + TotalVehiclecross);
              pw.println("Average waiting time to cross: " + AverageWaitingTime);
              pw.println("Total emissions: " + TotalEmissions);
              pw.close();   
            }catch(Exception e){
                System.out.println("Error");
            }
            
 
          //display the total number of vehicles crossed per phase, the average waiting time to cross, and the total emissions
         JOptionPane.showMessageDialog(null, "Total number of vehicles crossed per phase: " + TotalVehiclecross + "\n" + "Average waiting time to cross: " + AverageWaitingTime + "\n" + "Total emissions: " + TotalEmissions);
         System.exit(0);
         
         
         //////////////////////////////////////////////////
    
        System.exit(0);

    }//GEN-LAST:event_jButtonExitActionPerformed
   void Analysis()
   {
          Intersection intersection = new Intersection();
        intersection.readSegments("D:\\data file\\segments.txt");
        intersection.readPhases("D:\\data file\\phases.txt");
        intersection.readVehicles("D:\\data file\\vehicles.txt");
        intersection.readCO2("D:\\data file\\co2.txt");
          //Display intersection.getSegments()

        for (Segment segment : intersection.getSegments()) {
            
            System.out.println(segment.getName() + "," + segment.getLength() + "," + segment.getCapacity() + "," + segment.getVehicles());
           // System.out.println(segment.getLength());
            //System.out.println(segment.getCapacity());
            //System.out.println(segment.getVehicles());

        }

        for (Segment segment : intersection.getSegments()) {
            for (Vehicle vehicle : intersection.getVehicles()) {
                if (vehicle.getSegments().contains(segment)) {
                    segment.addVehicle(vehicle);
                }
            }
        }




        System.out.println(intersection.getPhases());
        for (Phase phase : intersection.getPhases()) {
            System.out.println(phase.getName() + "," + phase.getGreen() + "," + phase.getDuration() + "," + phase.getSegments());
            //System.out.println(phase.getGreen());
          //  System.out.println(phase.getDuration());
           // System.out.println(phase.getSegments());
        }

        for (Phase phase : intersection.getPhases()) {
               String line=phase.ToString();
                    String[] tokens = line.split(",");
            modelphases.addRow(new Object[]{tokens[0],tokens[1]});
            for (Segment segment : intersection.getSegments()) {
                if (segment.getName().equals(phase.getName())) {
                    phase.addSegment(segment);
                }
            }
        }


       //Display intersection.getVehicles()
       for (Vehicle vehicle : intersection.getVehicles()) {
            System.out.println(vehicle.getName() + "," + vehicle.getSegments()  + "," + vehicle.getSpeed() + "," + vehicle.getSegments());
            
 
                    String line=vehicle.ToString();
                    String[] tokens = line.split(",");
    
                    model.addRow(new Object[]{tokens[0],tokens[1],tokens[2],tokens[3],tokens[4],tokens[5],tokens[6],tokens[7]});
    
           
            //System.out.println(vehicle.getSegments());
           // System.out.println(vehicle.getSpeed());
            //System.out.println(vehicle.getSegments());
        }


        
        System.out.println(intersection.getVehicles());
        for (Vehicle vehicle : intersection.getVehicles()) {
            for (Segment segment : intersection.getSegments()) {
                if (segment.getName().equals(vehicle.getSegments())) {
                    vehicle.addSegment(segment);
                }
            }
        }

        //Display intersection.getCO2()
    
        System.out.println(intersection.getCO2());

        for (Phase phase : intersection.getPhases()) {
            for (Segment segment : intersection.getSegments()) {
                if (segment.getName().equals(phase.getSegments())) {
                    phase.addSegment(segment);
                }
            }
        }
        int CO2=0;
         for (Vehicle vehicle : intersection.getVehicles())
         {
             String s="";
             s=vehicle.getSegment();
             int  Waitingtime=0;
             int WiatingLength= vehicle.getLength();
             int CrossTime= vehicle.getSpeed();

            for (Phase phase : intersection.getPhases()) {
               Waitingtime= vehicle.getClosingTime() - phase.getDuration();
               
               if(Waitingtime<0)
               {
                   Waitingtime=Waitingtime*-1;
               }
               
            }
             modelstatatics.addRow(new Object[]{s,String.valueOf(Waitingtime),String.valueOf(WiatingLength),String.valueOf(CrossTime)});
                CO2= CO2 +vehicle.getEmmision() * vehicle.getLength() * vehicle.getSpeed();
         }
         
      jTextFieldCO2.setText(String.valueOf(CO2));
   }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        Analysis();
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InteractionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InteractionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InteractionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InteractionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InteractionGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonCancel;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTablePhases;
    private javax.swing.JTable jTableStatastics;
    private javax.swing.JTable jTableVehicle;
    private javax.swing.JTable jTableVehicleAdd;
    private javax.swing.JTextField jTextFieldCO2;
    // End of variables declaration//GEN-END:variables
}
