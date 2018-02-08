/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Root;

import Admin.AdminInformation;
import Admin.AdminPannel;
import Airport.AirportInformation;
import DatabaseHandaler.DatabaseHandler;
import MyDate.MyDate;
import Feeds.Feed;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class AddRoot extends javax.swing.JFrame {

    AdminInformation adminInformation;
    DatabaseHandler databaseHandalr = new DatabaseHandler();

    /**
     * Creates new form AddRoot
     */
    public AddRoot(AdminInformation adminInformation) {
        initComponents();
        this.adminInformation = adminInformation;
        System.out.println(adminInformation.getAdminFirstName());
    }

    public AddRoot() {
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        searchinfobutton = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        departurejtextfield = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        destinationjtextfield = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        departureairportcodeJtextField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        departureCityCountryName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        departureairportjcombobox = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        destinationairportcodejTextfield = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        destinationCityCountryName = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        destinationairportjcombobox1 = new javax.swing.JComboBox<>();
        backtoadminpannel = new javax.swing.JButton();
        savethisroot = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Search City Information\n"));

        searchinfobutton.setText("Search Information");
        searchinfobutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchinfobuttonActionPerformed(evt);
            }
        });

        jLabel3.setText("Departure City");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(departurejtextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(departurejtextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jLabel4.setText("Destination City");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(destinationjtextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(destinationjtextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(searchinfobutton)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(searchinfobutton)))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Departure City Details\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 18))); // NOI18N

        jLabel2.setText("Airport Name");

        jLabel1.setText("Country Name");

        jLabel5.setText("Airport Code");

        departureairportjcombobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", " ", " " }));
        departureairportjcombobox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                departureairportjcomboboxItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(24, 24, 24)
                        .addComponent(departureairportjcombobox, 0, 308, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(departureCityCountryName, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(departureairportcodeJtextField, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(departureCityCountryName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(departureairportjcombobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(departureairportcodeJtextField, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Destination City Details\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 3, 18))); // NOI18N

        jLabel6.setText("Airport Name");

        jLabel7.setText("Country Name");

        jLabel8.setText("Airport Code");

        destinationairportjcombobox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", " ", " " }));
        destinationairportjcombobox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                destinationairportjcombobox1ItemStateChanged(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(destinationCityCountryName, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(destinationairportcodejTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(destinationairportjcombobox1, 0, 308, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(destinationCityCountryName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(destinationairportjcombobox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(destinationairportcodejTextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        backtoadminpannel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backtoadminpannel.setText("Back To Admin Pannel");
        backtoadminpannel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backtoadminpannelActionPerformed(evt);
            }
        });

        savethisroot.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        savethisroot.setText("Save This Root");
        savethisroot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savethisrootActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(69, 69, 69)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addComponent(backtoadminpannel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(savethisroot)
                .addGap(216, 216, 216))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(98, 98, 98)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backtoadminpannel)
                    .addComponent(savethisroot))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  ArrayList<AirportInformation> departureAIlrportInformation;
    ArrayList<AirportInformation> destinationAIlrportInformation;

    private void searchinfobuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchinfobuttonActionPerformed
        // TODO add your handling code here:

        Connection connection = databaseHandalr.connectDatabase();
        String departurePlace = departurejtextfield.getText().trim().toString();
        String destinationPlace = destinationjtextfield.getText().trim().toString();

        ResultSet resultSet;

        if (!departurePlace.equals("") && !destinationPlace.equals("")) {
            resultSet = databaseHandalr.getAllAirportInformationResultSet(departurePlace, connection);
            departureAIlrportInformation = databaseHandalr.getAirportInformationList(resultSet);
            resultSet = databaseHandalr.getAllAirportInformationResultSet(destinationPlace, connection);
            destinationAIlrportInformation = databaseHandalr.getAirportInformationList(resultSet);

            if (departureAIlrportInformation.size() > 0 && destinationAIlrportInformation.size() > 0) {
                departureCityCountryName.setText(departureAIlrportInformation.get(0).getCountryName());
                for (AirportInformation airportInformation : departureAIlrportInformation) {
                    departureairportjcombobox.addItem(airportInformation.getAirportName());
                }
                destinationCityCountryName.setText(destinationAIlrportInformation.get(0).getCountryName());

                for (AirportInformation airportInformation : destinationAIlrportInformation) {
                    destinationairportjcombobox1.addItem(airportInformation.getAirportName());
                }
            } else {
                JOptionPane.showMessageDialog(null, "Painai");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please Fill up the city name");
        }
    }//GEN-LAST:event_searchinfobuttonActionPerformed

    private void departureairportjcomboboxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_departureairportjcomboboxItemStateChanged
        // TODO add your handling code here:
        // String airportName = departureairportjcombobox.getSelectedItem().toString();

        String airpotCode = "";
        if (!departureairportjcombobox.getSelectedItem().toString().equals("")) {
            String airportName = departureairportjcombobox.getSelectedItem().toString();

            for (AirportInformation airportInformation : departureAIlrportInformation) {
                if (airportInformation.getAirportName().equals(airportName)) {
                    airpotCode = airportInformation.getAirportCode();
                    break;
                }
            }

            departureairportcodeJtextField.setText(airpotCode);
        } else {
            JOptionPane.showMessageDialog(null, "Please Select an Airport");
        }
    }//GEN-LAST:event_departureairportjcomboboxItemStateChanged

    private void destinationairportjcombobox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_destinationairportjcombobox1ItemStateChanged
        // TODO add your handling code here:
        String airpotCode = "";
        if (!destinationairportjcombobox1.getSelectedItem().toString().equals("")) {
            String airportName = destinationairportjcombobox1.getSelectedItem().toString();

            for (AirportInformation airportInformation : destinationAIlrportInformation) {
                if (airportInformation.getAirportName().equals(airportName)) {
                    airpotCode = airportInformation.getAirportCode();
                    break;
                }
            }

            destinationairportcodejTextfield.setText(airpotCode);
        } else {
            JOptionPane.showMessageDialog(null, "Please Select an Airport");
        }
    }//GEN-LAST:event_destinationairportjcombobox1ItemStateChanged

    private void savethisrootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savethisrootActionPerformed
        // TODO add your handling code here:
                    /*  departurejtextfield.setText("");
                    departureairportjcombobox.removeAllItems();
                    departureCityCountryName.setText("");
                    departureairportcodeJtextField.setText("");
                    
                    destinationjtextfield.setText("");
                    destinationairportjcombobox1.removeAllItems();
                    destinationCityCountryName.setText("");
                    destinationairportcodejTextfield.setText("");*/
                    
        Connection connection = databaseHandalr.connectDatabase();

        String departurecityName = departurejtextfield.getText().trim().toString();
        String departureAirportName = departureairportjcombobox.getSelectedItem().toString();
        String departureCountryName = departureCityCountryName.getText().trim().toString();
        String departureAirportCode = departureairportcodeJtextField.getText().trim().toString();

        String destinationPlace = destinationjtextfield.getText().trim().toString();
        String destinationAirportName = destinationairportjcombobox1.getSelectedItem().toString();
        String destinationCountryName = destinationCityCountryName.getText().trim().toString();
        String destinationAirportCode = destinationairportcodejTextfield.getText().trim().toString();

        if (departureAIlrportInformation.isEmpty() || destinationAIlrportInformation.isEmpty()) {
            JOptionPane.showMessageDialog(null, "No Airport Found");
        } else {
            
            RootInformation rootInformation = new RootInformation(adminInformation.getAdminId(),departureAirportCode, destinationAirportCode);
            
            ResultSet resultSet = databaseHandalr.getAllRootInformationResultSet(rootInformation, connection);
            ArrayList<RootInformation> roots = databaseHandalr.getALlRootInformationList(resultSet);
            
            if(roots.size()==0){
                int res = databaseHandalr.insertRootInformation(rootInformation, connection);
                
                if(res>0){
                    Feed feed = new Feed(adminInformation.getAdminId(),"Added "+rootInformation.getDepartureCityAirportCode()+" "+rootInformation.getDestinationCityAirporCode(),MyDate.getCurrentdate());
                    databaseHandalr.insertFeed(feed, connection);
                    JOptionPane.showMessageDialog(null, "Successfully Saved This Root");
                  /*  departurejtextfield.setText("");
                    departureairportjcombobox.removeAllItems();
                    departureCityCountryName.setText("");
                    departureairportcodeJtextField.setText("");
                    
                    destinationjtextfield.setText("");
                    destinationairportjcombobox1.removeAllItems();
                    destinationCityCountryName.setText("");
                    destinationairportcodejTextfield.setText("");*/
                }
                else{
                    JOptionPane.showMessageDialog(null, "Error!! Saved This Root");
                     /*departurejtextfield.setText("");
                    departureairportjcombobox.removeAllItems();
                    departureCityCountryName.setText("");
                    departureairportcodeJtextField.setText("");
                    
                    destinationjtextfield.setText("");
                    destinationairportjcombobox1.removeAllItems();
                    destinationCityCountryName.setText("");
                    destinationairportcodejTextfield.setText("");*/
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "This Root Is Alrady Saved In Database");
                   /* departurejtextfield.setText("");
                    departureairportjcombobox.removeAllItems();
                    departureCityCountryName.setText("");
                    departureairportcodeJtextField.setText("");
                    
                    destinationjtextfield.setText("");
                    destinationairportjcombobox1.removeAllItems();
                    destinationCityCountryName.setText("");
                    destinationairportcodejTextfield.setText("");*/
            }
        }
    }//GEN-LAST:event_savethisrootActionPerformed

    private void backtoadminpannelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backtoadminpannelActionPerformed
        // TODO add your handling code here:
        RootPannel rootpannel = new RootPannel(adminInformation);
        this.setVisible(false);
        rootpannel.setVisible(true);
    }//GEN-LAST:event_backtoadminpannelActionPerformed

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
            java.util.logging.Logger.getLogger(AddRoot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddRoot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddRoot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddRoot.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddRoot().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backtoadminpannel;
    private javax.swing.JTextField departureCityCountryName;
    private javax.swing.JTextField departureairportcodeJtextField;
    private javax.swing.JComboBox<String> departureairportjcombobox;
    private javax.swing.JTextField departurejtextfield;
    private javax.swing.JTextField destinationCityCountryName;
    private javax.swing.JTextField destinationairportcodejTextfield;
    private javax.swing.JComboBox<String> destinationairportjcombobox1;
    private javax.swing.JTextField destinationjtextfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JButton savethisroot;
    private javax.swing.JButton searchinfobutton;
    // End of variables declaration//GEN-END:variables
}
