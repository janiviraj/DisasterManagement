
package UserInterface.CustomerRole;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.Disaster;
import UserInterface.CustomerRole.SOSTypeJPanel;
//import Business.userinterface.SystemAdminWorkArea.ManageNetworkJPanel;
import java.awt.CardLayout;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class CustomerWorkPanel extends javax.swing.JPanel {
    
    private JPanel userProcessContainer;
    private Disaster disaster;
    private CustomerDirectory cusDir;
    private Customer cus;
  
 
    public CustomerWorkPanel(JPanel userProcessContainer, CustomerDirectory cusDir,Disaster disaster) {
        initComponents();
        
        this.disaster=disaster;
        this.userProcessContainer=userProcessContainer;
        this.cusDir=cusDir;
        
        populateTable();
        populateReportIncident();
    }

    public void populateTable(){
   
    DefaultTableModel dtm=(DefaultTableModel) Customer_JTable.getModel();
        dtm.setRowCount(0); 
        for(Customer c: cusDir.getCusDir()) {  
            Object row[]=new Object[3];  
            row[0]=c;     
            row[1]=c.getPhoneNumber();
            row[2]=c.getEmail();
            dtm.addRow(row);        
        }
    }
     
    public void populateReportIncident(){
        DefaultTableModel dtm1=(DefaultTableModel) CustomerWorkPanel_JTable.getModel();
        dtm1.setRowCount(0);
            for(Customer c:cusDir.getCusDir()){
                Object row[]=new Object[3];  
                row[0]=c.getType();     
                row[1]=c.getLocation();
                row[2]=c.getDescription();
                dtm1.addRow(row);
            }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        Title_JLabel = new javax.swing.JLabel();
        SOS_JButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CustomerWorkPanel_JTable = new javax.swing.JTable();
        Dashboard_JLabel = new javax.swing.JLabel();
        ReportIncident_JButton = new javax.swing.JButton();
        Donation_JButton = new javax.swing.JButton();
        Emergency_JLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Customer_JTable = new javax.swing.JTable();
        Alert_JButton1 = new javax.swing.JButton();

        jButton2.setText("jButton2");

        Title_JLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Title_JLabel.setText("Civilian Work Panel");

        SOS_JButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        SOS_JButton.setForeground(new java.awt.Color(255, 51, 51));
        SOS_JButton.setText("SOS /!\\");
            SOS_JButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    SOS_JButtonActionPerformed(evt);
                }
            });

            CustomerWorkPanel_JTable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            CustomerWorkPanel_JTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                    "Type", "Location", "Disaster Description"
                }
            ));
            jScrollPane1.setViewportView(CustomerWorkPanel_JTable);

            Dashboard_JLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            Dashboard_JLabel.setText("Recent Disaster Dash Board");

            ReportIncident_JButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            ReportIncident_JButton.setText("Report Incident >>");
            ReportIncident_JButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    ReportIncident_JButtonActionPerformed(evt);
                }
            });

            Donation_JButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            Donation_JButton.setText("Donation");
            Donation_JButton.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Donation_JButtonActionPerformed(evt);
                }
            });

            Emergency_JLabel.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
            Emergency_JLabel.setText("Click in case of Emergency");

            Customer_JTable.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
            Customer_JTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                    "Name", "Phone Number", "Email"
                }
            ) {
                Class[] types = new Class [] {
                    java.lang.Object.class, java.lang.String.class, java.lang.String.class
                };
                boolean[] canEdit = new boolean [] {
                    false, false, false
                };

                public Class getColumnClass(int columnIndex) {
                    return types [columnIndex];
                }

                public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
                }
            });
            jScrollPane2.setViewportView(Customer_JTable);

            Alert_JButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
            Alert_JButton1.setForeground(new java.awt.Color(255, 51, 51));
            Alert_JButton1.setText("Alert!!");
            Alert_JButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    Alert_JButton1ActionPerformed(evt);
                }
            });

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
            this.setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(Emergency_JLabel)
                    .addGap(537, 537, 537))
                .addGroup(layout.createSequentialGroup()
                    .addGap(205, 205, 205)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(Title_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(Dashboard_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(8, 8, 8)))
                            .addGap(185, 185, 185))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(Alert_JButton1)
                            .addGap(38, 38, 38)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(ReportIncident_JButton)
                                    .addGap(61, 61, 61)
                                    .addComponent(SOS_JButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Donation_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addContainerGap(306, Short.MAX_VALUE))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(11, 11, 11)
                    .addComponent(Title_JLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(Dashboard_JLabel)
                    .addGap(33, 33, 33)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(SOS_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ReportIncident_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Donation_JButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Alert_JButton1))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(Emergency_JLabel)
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(41, Short.MAX_VALUE))
            );
        }// </editor-fold>//GEN-END:initComponents

    private void SOS_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SOS_JButtonActionPerformed

       
        
        int selectedRow=CustomerWorkPanel_JTable.getSelectedRow();
        //int selectedRow1=Customer_JTable.getSelectedRow();
            if (selectedRow < 0){
                return;
            } 
            String street=CustomerWorkPanel_JTable.getModel().getValueAt(selectedRow,1).toString();
            String type=CustomerWorkPanel_JTable.getModel().getValueAt(selectedRow,0).toString();
            SOSTypeJPanel sOSTypeJPanel = new SOSTypeJPanel(userProcessContainer, cusDir,street,type,disaster);
            userProcessContainer.add("sOSTypeJPanel",sOSTypeJPanel);
            CardLayout layout=(CardLayout)userProcessContainer.getLayout();
            layout.next(userProcessContainer);
    }//GEN-LAST:event_SOS_JButtonActionPerformed

    private void ReportIncident_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportIncident_JButtonActionPerformed
        int selectedRow=Customer_JTable.getSelectedRow();
        if (selectedRow < 0){
            return;
        }
        ReportIncidentJPanel reportIncidentJPanel = new ReportIncidentJPanel(userProcessContainer, cusDir);
        userProcessContainer.add("ReportIncidentJPanel",reportIncidentJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);        
    }//GEN-LAST:event_ReportIncident_JButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SignUpJPanel sjp = new SignUpJPanel(userProcessContainer,disaster,cusDir);
        userProcessContainer.add("SIGN UP PANEL",sjp);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void customer_JTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customer_JTableMouseClicked
        populateReportIncident();    
    }//GEN-LAST:event_customer_JTableMouseClicked

    private void Alert_JButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Alert_JButton1ActionPerformed
        // TODO add your handling code here:
         try {
			// Construct data
			/*String apiKey = "apikey=" + APIKeyTextField.getText();
			String message = "&message=" + messageTextArea.getText();
			String sender = "&sender=" + senderTextField.getText();
			String numbers = "&numbers=" + numberTextField2.getText();*/
                        
                       // String apiKey = "apikey=" + "pAU0zWADtjE-ZjvTBoIyAQjVDL9z1FdReuiKlhpkkC";
			String message = "&message=" + "There is an Emergency";
			String sender = "&sender=" + "Customer";
			String numbers = "&numbers=" + "+18574130522";
                        //String numbers = "&numbers=" + "+16178697102";
			
			// Send data
			HttpURLConnection conn = (HttpURLConnection) new URL("https://api.txtlocal.com/send/?").openConnection();
			//String data = apiKey + numbers + message + sender;
			conn.setDoOutput(true);
			conn.setRequestMethod("POST");
			//conn.setRequestProperty("Content-Length", Integer.toString(data.length()));
			//conn.getOutputStream().write(data.getBytes("UTF-8"));
			final BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			final StringBuffer stringBuffer = new StringBuffer();
			String line;
			while ((line = rd.readLine()) != null) {
				//stringBuffer.append(line);
                            JOptionPane.showMessageDialog(null,"message"+line);
			}
			rd.close();
			
			//return stringBuffer.toString();
		} catch (Exception e) {
			//System.out.println("Error SMS "+e);
                    JOptionPane.showMessageDialog(null,e);
			//return "Error "+e;
		}
                  
        
        
        
        
        
        
        
    }//GEN-LAST:event_Alert_JButton1ActionPerformed

    private void Donation_JButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Donation_JButtonActionPerformed
        DonationJPanel donationJPanel = new DonationJPanel (userProcessContainer, disaster,cusDir);
        userProcessContainer.add("DonationJPanel",donationJPanel);
        CardLayout layout=(CardLayout)userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_Donation_JButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Alert_JButton1;
    private javax.swing.JTable CustomerWorkPanel_JTable;
    private javax.swing.JTable Customer_JTable;
    private javax.swing.JLabel Dashboard_JLabel;
    private javax.swing.JButton Donation_JButton;
    private javax.swing.JLabel Emergency_JLabel;
    private javax.swing.JButton ReportIncident_JButton;
    private javax.swing.JButton SOS_JButton;
    private javax.swing.JLabel Title_JLabel;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
