package projectskipv2;

import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;

public class GUI extends javax.swing.JFrame {

    BookingList booking = new BookingList();
    Booking book;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private String staffName, studentName, time, location, date, condition, state, crossSearch,
            deleteInfo, purpose;
    private int staffID, matricNo,
            i = 0, // index for staff array
            c = 0; // index for student array
    private double totalFees, venueFees, projectorFees, microphoneFees;
    //basic fees for 2 hours of booking is RM30
    //projector renting fees RM15
    //microphone renting fees is RM20

    public GUI() {
        initComponents();
        txtBookingFeesDetails.setEditable(false);
        txtBookingDetails.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        lblTitle = new javax.swing.JLabel();
        panelMain = new javax.swing.JPanel();
        layeredPane = new javax.swing.JLayeredPane();
        panelMenu = new javax.swing.JPanel();
        btnViewBookingDetails = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnAddNewBooking = new javax.swing.JButton();
        btnDeleteOldBooking = new javax.swing.JButton();
        panelAddBooking = new javax.swing.JPanel();
        lblBookingOrder = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblTime = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        cboTime = new javax.swing.JComboBox<>();
        lblDate = new javax.swing.JLabel();
        lblLocation = new javax.swing.JLabel();
        cboLocation = new javax.swing.JComboBox<>();
        btnConfirm = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        spBookingFeesDetails = new javax.swing.JScrollPane();
        txtBookingFeesDetails = new javax.swing.JTextArea();
        btnCalculateBookingFees = new javax.swing.JButton();
        lblBookingFeesDetails = new javax.swing.JLabel();
        chbProjector = new javax.swing.JCheckBox();
        chbMicrophone = new javax.swing.JCheckBox();
        lblItems = new javax.swing.JLabel();
        lblPurpose = new javax.swing.JLabel();
        txtPurpose = new javax.swing.JTextField();
        bookingDate = new com.toedter.calendar.JDateChooser();
        lblBookersAdd = new javax.swing.JLabel();
        rdStaffAdd = new javax.swing.JRadioButton();
        rdStudentAdd = new javax.swing.JRadioButton();
        panelViewDetailsMenu = new javax.swing.JPanel();
        btnReturnToMenu2 = new javax.swing.JButton();
        btnBookingSearch = new javax.swing.JButton();
        lblNewBookingMenu1 = new javax.swing.JLabel();
        btnViewAllBooking = new javax.swing.JButton();
        panelSearch = new javax.swing.JPanel();
        lblBookingSearch = new javax.swing.JLabel();
        btnSearchConfirm = new javax.swing.JButton();
        btnSearchReset = new javax.swing.JButton();
        btnSearchBack = new javax.swing.JButton();
        rdStaffSearch = new javax.swing.JRadioButton();
        rdStudentSearch = new javax.swing.JRadioButton();
        lblBookersSearch = new javax.swing.JLabel();
        panelShowDetails = new javax.swing.JPanel();
        lblBookingDetails = new javax.swing.JLabel();
        scpBookingDetails = new javax.swing.JScrollPane();
        txtBookingDetails = new javax.swing.JTextArea();
        btnBackBookingDetails = new javax.swing.JButton();
        btnResetBookingDetails = new javax.swing.JButton();
        panelDelete = new javax.swing.JPanel();
        lblBookingDelete = new javax.swing.JLabel();
        btnDeleteConfirm = new javax.swing.JButton();
        btnDeleteReset = new javax.swing.JButton();
        btnDeleteBack = new javax.swing.JButton();
        rdStaffDelete = new javax.swing.JRadioButton();
        rdStudentDelete = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));

        lblTitle.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("LECTURE HALL AND TUTORIAL ROOM BOOKING SYSTEM");

        panelMain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        layeredPane.setLayout(new java.awt.CardLayout());

        panelMenu.setBackground(new java.awt.Color(255, 204, 0));
        panelMenu.setPreferredSize(new java.awt.Dimension(594, 520));

        btnViewBookingDetails.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        btnViewBookingDetails.setText("VIEW BOOKING DETAILS");
        btnViewBookingDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewBookingDetailsActionPerformed(evt);
            }
        });

        btnExit.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        btnExit.setText("EXIT");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        btnAddNewBooking.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        btnAddNewBooking.setText("ADD NEW BOOKING");
        btnAddNewBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewBookingActionPerformed(evt);
            }
        });

        btnDeleteOldBooking.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        btnDeleteOldBooking.setText("DELETE OLD BOOKING");
        btnDeleteOldBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteOldBookingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDeleteOldBooking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAddNewBooking, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnViewBookingDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(162, Short.MAX_VALUE))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                .addContainerGap(106, Short.MAX_VALUE)
                .addComponent(btnAddNewBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnViewBookingDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDeleteOldBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );

        layeredPane.add(panelMenu, "card2");

        panelAddBooking.setBackground(new java.awt.Color(51, 153, 255));

        lblBookingOrder.setFont(new java.awt.Font("Serif", 0, 28)); // NOI18N
        lblBookingOrder.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBookingOrder.setText("BOOKING FORM");

        lblName.setText("NAME:");

        lblTime.setText("TIME:");

        cboTime.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "8.00a.m.-10.00a.m.", "10.00a.m.-12.00p.m.", "2.00p.m.-4.00p.m.", "4.00p.m.-6.00p.m." }));

        lblDate.setText("DATE:");

        lblLocation.setText("LOCATION:");

        cboLocation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECT", "DKG 4/1", "DKG 4/2", "DKG 4/3", "DKG 4/4", "TUTO 4/1", "TUTO 4/2", "TUTO 4/3", "TUTO 4/4", " " }));

        btnConfirm.setText("CONFIRM");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        btnReset.setText("RESET");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtBookingFeesDetails.setColumns(20);
        txtBookingFeesDetails.setRows(5);
        spBookingFeesDetails.setViewportView(txtBookingFeesDetails);

        btnCalculateBookingFees.setText("CALCULATE FEES");
        btnCalculateBookingFees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalculateBookingFeesActionPerformed(evt);
            }
        });

        lblBookingFeesDetails.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblBookingFeesDetails.setText("YOUR BOOKING FEES IS:");

        chbProjector.setText("PROJECTOR");

        chbMicrophone.setText("MICROPHONE");

        lblItems.setText("ITEMS:");

        lblPurpose.setText("PURPOSE:");

        lblBookersAdd.setText("BOOKERS:");

        buttonGroup3.add(rdStaffAdd);
        rdStaffAdd.setText("STAFF");

        buttonGroup3.add(rdStudentAdd);
        rdStudentAdd.setText("STUDENT");

        javax.swing.GroupLayout panelAddBookingLayout = new javax.swing.GroupLayout(panelAddBooking);
        panelAddBooking.setLayout(panelAddBookingLayout);
        panelAddBookingLayout.setHorizontalGroup(
            panelAddBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddBookingLayout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addGroup(panelAddBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelAddBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblItems, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelAddBookingLayout.createSequentialGroup()
                            .addGroup(panelAddBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(panelAddBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelAddBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(spBookingFeesDetails)
                                        .addGroup(panelAddBookingLayout.createSequentialGroup()
                                            .addComponent(lblLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(panelAddBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(panelAddBookingLayout.createSequentialGroup()
                                                    .addGroup(panelAddBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(btnCalculateBookingFees, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, panelAddBookingLayout.createSequentialGroup()
                                                            .addComponent(btnConfirm)
                                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                            .addComponent(btnReset)))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(btnBack))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAddBookingLayout.createSequentialGroup()
                                                    .addGap(0, 0, Short.MAX_VALUE)
                                                    .addGroup(panelAddBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(chbProjector, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(cboLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(chbMicrophone)
                                                        .addComponent(txtPurpose, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                        .addComponent(lblBookingFeesDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(panelAddBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(cboTime, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(panelAddBookingLayout.createSequentialGroup()
                                                .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(bookingDate, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addComponent(lblPurpose, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(panelAddBookingLayout.createSequentialGroup()
                                    .addGroup(panelAddBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblBookersAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(panelAddBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(panelAddBookingLayout.createSequentialGroup()
                                            .addComponent(rdStaffAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(rdStudentAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(6, 6, 6)))
                            .addGap(49, 49, 49)))
                    .addGroup(panelAddBookingLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(lblBookingOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)))
                .addGap(90, 90, 90))
        );
        panelAddBookingLayout.setVerticalGroup(
            panelAddBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAddBookingLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblBookingOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(panelAddBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblBookersAdd)
                    .addComponent(rdStaffAdd)
                    .addComponent(rdStudentAdd))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelAddBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAddBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTime, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cboTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAddBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bookingDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAddBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cboLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelAddBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblItems)
                    .addComponent(chbProjector))
                .addGap(8, 8, 8)
                .addComponent(chbMicrophone)
                .addGap(12, 12, 12)
                .addGroup(panelAddBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPurpose)
                    .addComponent(txtPurpose, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(panelAddBookingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnConfirm)
                    .addComponent(btnReset)
                    .addComponent(btnBack))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCalculateBookingFees)
                .addGap(11, 11, 11)
                .addComponent(lblBookingFeesDetails)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spBookingFeesDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        layeredPane.add(panelAddBooking, "card3");

        panelViewDetailsMenu.setBackground(new java.awt.Color(204, 255, 102));

        btnReturnToMenu2.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        btnReturnToMenu2.setText("RETURN TO MENU");
        btnReturnToMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnToMenu2ActionPerformed(evt);
            }
        });

        btnBookingSearch.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        btnBookingSearch.setText("SEARCH BOOKING");
        btnBookingSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookingSearchActionPerformed(evt);
            }
        });

        lblNewBookingMenu1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        lblNewBookingMenu1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNewBookingMenu1.setText("VIEW DETAILS MENU");

        btnViewAllBooking.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        btnViewAllBooking.setText("VIEW ALL BOOKINGS");
        btnViewAllBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllBookingActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelViewDetailsMenuLayout = new javax.swing.GroupLayout(panelViewDetailsMenu);
        panelViewDetailsMenu.setLayout(panelViewDetailsMenuLayout);
        panelViewDetailsMenuLayout.setHorizontalGroup(
            panelViewDetailsMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewDetailsMenuLayout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(panelViewDetailsMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNewBookingMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelViewDetailsMenuLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(panelViewDetailsMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnBookingSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnReturnToMenu2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnViewAllBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        panelViewDetailsMenuLayout.setVerticalGroup(
            panelViewDetailsMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelViewDetailsMenuLayout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addComponent(lblNewBookingMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBookingSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnViewAllBooking, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReturnToMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        layeredPane.add(panelViewDetailsMenu, "card8");

        panelSearch.setBackground(new java.awt.Color(255, 102, 255));

        lblBookingSearch.setFont(new java.awt.Font("Serif", 0, 28)); // NOI18N
        lblBookingSearch.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBookingSearch.setText("BOOKING SEARCH");

        btnSearchConfirm.setText("CONFIRM");
        btnSearchConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchConfirmActionPerformed(evt);
            }
        });

        btnSearchReset.setText("RESET");
        btnSearchReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchResetActionPerformed(evt);
            }
        });

        btnSearchBack.setText("BACK");
        btnSearchBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchBackActionPerformed(evt);
            }
        });

        buttonGroup2.add(rdStaffSearch);
        rdStaffSearch.setText("STAFF");

        buttonGroup2.add(rdStudentSearch);
        rdStudentSearch.setText("STUDENT");

        lblBookersSearch.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblBookersSearch.setText("BOOKERS: ");

        javax.swing.GroupLayout panelSearchLayout = new javax.swing.GroupLayout(panelSearch);
        panelSearch.setLayout(panelSearchLayout);
        panelSearchLayout.setHorizontalGroup(
            panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSearchLayout.createSequentialGroup()
                .addGap(148, 148, 148)
                .addGroup(panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelSearchLayout.createSequentialGroup()
                        .addComponent(btnSearchConfirm)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearchReset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearchBack)
                        .addContainerGap(215, Short.MAX_VALUE))
                    .addGroup(panelSearchLayout.createSequentialGroup()
                        .addGroup(panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelSearchLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblBookersSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelSearchLayout.createSequentialGroup()
                                .addComponent(rdStaffSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(rdStudentSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblBookingSearch))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        panelSearchLayout.setVerticalGroup(
            panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSearchLayout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(lblBookingSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(lblBookersSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdStaffSearch)
                    .addComponent(rdStudentSearch))
                .addGap(24, 24, 24)
                .addGroup(panelSearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSearchConfirm)
                    .addComponent(btnSearchReset)
                    .addComponent(btnSearchBack))
                .addContainerGap(217, Short.MAX_VALUE))
        );

        layeredPane.add(panelSearch, "card7");

        panelShowDetails.setBackground(new java.awt.Color(102, 0, 102));

        lblBookingDetails.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblBookingDetails.setForeground(new java.awt.Color(255, 255, 255));
        lblBookingDetails.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBookingDetails.setText("BOOKING DETAILS");

        txtBookingDetails.setColumns(20);
        txtBookingDetails.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtBookingDetails.setRows(5);
        scpBookingDetails.setViewportView(txtBookingDetails);

        btnBackBookingDetails.setText("Back");
        btnBackBookingDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackBookingDetailsActionPerformed(evt);
            }
        });

        btnResetBookingDetails.setText("Reset");
        btnResetBookingDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetBookingDetailsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelShowDetailsLayout = new javax.swing.GroupLayout(panelShowDetails);
        panelShowDetails.setLayout(panelShowDetailsLayout);
        panelShowDetailsLayout.setHorizontalGroup(
            panelShowDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShowDetailsLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(scpBookingDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 519, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(56, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShowDetailsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelShowDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShowDetailsLayout.createSequentialGroup()
                        .addComponent(lblBookingDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(148, 148, 148))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelShowDetailsLayout.createSequentialGroup()
                        .addComponent(btnResetBookingDetails)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBackBookingDetails)
                        .addGap(59, 59, 59))))
        );
        panelShowDetailsLayout.setVerticalGroup(
            panelShowDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelShowDetailsLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(lblBookingDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scpBookingDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelShowDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBackBookingDetails)
                    .addComponent(btnResetBookingDetails))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        layeredPane.add(panelShowDetails, "card6");

        panelDelete.setBackground(new java.awt.Color(153, 255, 204));

        lblBookingDelete.setFont(new java.awt.Font("Serif", 0, 28)); // NOI18N
        lblBookingDelete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblBookingDelete.setText("BOOKING DELETE");

        btnDeleteConfirm.setText("CONFIRM");
        btnDeleteConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteConfirmActionPerformed(evt);
            }
        });

        btnDeleteReset.setText("RESET");
        btnDeleteReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteResetActionPerformed(evt);
            }
        });

        btnDeleteBack.setText("BACK");
        btnDeleteBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteBackActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdStaffDelete);
        rdStaffDelete.setText("STAFF");

        buttonGroup1.add(rdStudentDelete);
        rdStudentDelete.setText("STUDENT");

        javax.swing.GroupLayout panelDeleteLayout = new javax.swing.GroupLayout(panelDelete);
        panelDelete.setLayout(panelDeleteLayout);
        panelDeleteLayout.setHorizontalGroup(
            panelDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDeleteLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addGroup(panelDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblBookingDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelDeleteLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(panelDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelDeleteLayout.createSequentialGroup()
                                .addComponent(btnDeleteConfirm)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDeleteReset)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDeleteBack))
                            .addGroup(panelDeleteLayout.createSequentialGroup()
                                .addComponent(rdStaffDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(rdStudentDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        panelDeleteLayout.setVerticalGroup(
            panelDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDeleteLayout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(lblBookingDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdStaffDelete)
                    .addComponent(rdStudentDelete))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeleteConfirm)
                    .addComponent(btnDeleteReset)
                    .addComponent(btnDeleteBack))
                .addContainerGap(223, Short.MAX_VALUE))
        );

        layeredPane.add(panelDelete, "card11");

        panelMain.add(layeredPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(88, 88, 88)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 636, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(96, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(94, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //--------------------------MENU---------------------------------
    private void btnAddNewBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewBookingActionPerformed
        layeredPane.removeAll();
        layeredPane.add(panelAddBooking);
        layeredPane.repaint();
        layeredPane.revalidate();

    }//GEN-LAST:event_btnAddNewBookingActionPerformed

    private void btnViewBookingDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewBookingDetailsActionPerformed
        layeredPane.removeAll();
        layeredPane.add(panelViewDetailsMenu);
        layeredPane.repaint();
        layeredPane.revalidate();
    }//GEN-LAST:event_btnViewBookingDetailsActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

    //-------------------------- ADD NEW BOOKING ---------------------------------
    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
        state = "";
        if (rdStaffAdd.isSelected()) {
            condition = "STAFF";

        } else if (rdStudentAdd.isSelected()) {
            condition = "STUDENT";

        }

        time = cboTime.getSelectedItem().toString();
        location = cboLocation.getSelectedItem().toString();
        date = sdf.format(bookingDate.getDate());
        purpose = txtPurpose.getText();

        venueFees = 30;
        if (chbProjector.isSelected() && chbMicrophone.isSelected()) {
            projectorFees = 15;
            microphoneFees = 20;
        } else if (chbProjector.isSelected()) {
            projectorFees = 15;
            microphoneFees = 0;

        } else if (chbMicrophone.isSelected()) {
            microphoneFees = 20;
            projectorFees = 0;
        }

        book = new Booking(purpose, time, date, location, venueFees, projectorFees, microphoneFees, totalFees);
        totalFees = book.calculateTotalFees(condition);

        if (condition.equals("STAFF")) {
            try {
                staffName = txtName.getText();
                staffID = Integer.parseInt(JOptionPane.showInputDialog("ENTER STAFF ID:"));
        
            // check whether the booking is new or already in the array
            state = booking.checkBookingState(condition, time, location, date); //check staff with staff
            crossSearch = booking.crossCheckStaffStudentBooking(condition, time, location, date); //check staff with student

            System.out.println(state);
            System.out.println(crossSearch);

            if (state.equals("NEW")) {
                if (crossSearch.equals("NOT IN STUDENT BOOKING ARRAY")) {
                    booking.addNewBooking(i, c, staffID, condition, staffName, purpose, venueFees, projectorFees, microphoneFees, totalFees, time, date, location);
                    i++;
                    JOptionPane.showConfirmDialog(this, "YOUR BOOKING IS SUCCESSFUL", "BOOKING CONFIRMATION", JOptionPane.DEFAULT_OPTION);
                } else if (crossSearch.equals("IN THE STUDENT BOOKING ARRAY")) {
                    JOptionPane.showMessageDialog(this, location + " IS ALREADY BOOKED FROM " + time + " AT " + date + " BY A STUDENT", "BOOKING ERROR", JOptionPane.ERROR_MESSAGE);
                }

            } else if (state.equals("IN THE ARRAY")) {
                JOptionPane.showMessageDialog(this, location + " IS ALREADY BOOKED FROM " + time + " AT " + date + " BY ANOTHER STAFF", "BOOKING ERROR", JOptionPane.ERROR_MESSAGE);
            }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "PLEASE ENTER THE STAFF ID.");
            }

        } else if (condition.equals("STUDENT")) {
            try {
                studentName = txtName.getText();
                matricNo = Integer.parseInt(JOptionPane.showInputDialog("ENTER MATRIC NO.:"));
                // check whether the booking is new or already in the array
                state = booking.checkBookingState(condition, time, location, date);
                crossSearch = booking.crossCheckStaffStudentBooking(condition, time, location, date);

                System.out.println(state);
                System.out.println(crossSearch);

                if (state.equals("NEW")) {
                    if (crossSearch.equals("NOT IN STAFF BOOKING ARRAY")) {
                        booking.addNewBooking(i, c, matricNo, condition, studentName, purpose, venueFees, projectorFees, microphoneFees, totalFees,
                                time, date, location);
                        c++;
                        JOptionPane.showConfirmDialog(this, "YOUR BOOKING IS SUCCESSFUL", "BOOKING CONFIRMATION", JOptionPane.DEFAULT_OPTION);

                    } else if (crossSearch.equals("IN THE STAFF BOOKING ARRAY")) {
                        JOptionPane.showMessageDialog(this, location + " IS ALREADY BOOKED FROM " + time + " AT " + date + " BY A STAFF", "BOOKING ERROR", JOptionPane.ERROR_MESSAGE);
                    }

                } else if (state.equals("IN THE ARRAY")) {
                    JOptionPane.showMessageDialog(this, location + " IS ALREADY BOOKED FROM " + time + " AT " + date + " BY ANOTHER STUDENT", "BOOKING ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "PLEASE ENTER THE MATRIC NO..");
            }
        }
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed
        //reset  NEW BOOKING form
        buttonGroup3.clearSelection();

        txtName.setText("");
        txtBookingFeesDetails.setText("");
        txtPurpose.setText("");
        cboTime.setSelectedIndex(0);
        cboLocation.setSelectedIndex(0);
        chbProjector.setSelected(false);
        chbMicrophone.setSelected(false);
        bookingDate.setDate(null);


    }//GEN-LAST:event_btnResetActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        //reset  NEW BOOKING form
        buttonGroup3.clearSelection();
        txtName.setText("");
        txtBookingFeesDetails.setText("");
        txtPurpose.setText("");
        cboTime.setSelectedIndex(0);
        cboLocation.setSelectedIndex(0);
        chbProjector.setSelected(false);
        chbMicrophone.setSelected(false);
        bookingDate.setDate(null);

        //remove previous panel and add panelMenu
        layeredPane.removeAll();
        layeredPane.add(panelMenu);
        layeredPane.repaint();
        layeredPane.revalidate();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCalculateBookingFeesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalculateBookingFeesActionPerformed
        if (rdStaffAdd.isSelected()) {
            condition = "STAFF";
        } else if (rdStudentAdd.isSelected()) {
            condition = "STUDENT";
        }

        if (condition.equals("STAFF")) {
            txtBookingFeesDetails.setText(String.format("RM %.2f", book.calculateTotalFees(condition)));
        } else if (condition.equals("STUDENT")) {
            txtBookingFeesDetails.setText(String.format("RM %.2f", book.calculateTotalFees(condition)));
        }

    }//GEN-LAST:event_btnCalculateBookingFeesActionPerformed

    //-------------------------- VIEW BOOKING DETAILS MENU---------------------------------
    private void btnBookingSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookingSearchActionPerformed
        layeredPane.removeAll();
        layeredPane.add(panelSearch);
        layeredPane.repaint();
        layeredPane.revalidate();

    }//GEN-LAST:event_btnBookingSearchActionPerformed

    private void btnViewAllBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllBookingActionPerformed
        layeredPane.removeAll();
        layeredPane.add(panelShowDetails);
        layeredPane.repaint();
        layeredPane.revalidate();

        txtBookingDetails.setText(booking.toString() + "\n\n" + booking.toString1());

    }//GEN-LAST:event_btnViewAllBookingActionPerformed

    private void btnReturnToMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnToMenu2ActionPerformed
        layeredPane.removeAll();
        layeredPane.add(panelMenu);
        layeredPane.repaint();
        layeredPane.revalidate();
    }//GEN-LAST:event_btnReturnToMenu2ActionPerformed

    //-------------------------- SEARCH AND VIEW BOOKING DETAILS---------------------------------
    private void btnSearchConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchConfirmActionPerformed
        if (rdStaffSearch.isSelected()) {
            condition = "STAFF";
            try {
                staffID = Integer.parseInt(JOptionPane.showInputDialog("ENTER STAFF ID:"));

                layeredPane.removeAll();
                layeredPane.add(panelShowDetails);
                layeredPane.repaint();
                layeredPane.revalidate();

                txtBookingDetails.setText(booking.searchArray(condition, staffID));

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "PLEASE ENTER THE STAFF ID.");
            }

        } else if (rdStudentSearch.isSelected()) {
            condition = "STUDENT";
            try {
                matricNo = Integer.parseInt(JOptionPane.showInputDialog("ENTER MATRIC NO.:"));

                layeredPane.removeAll();
                layeredPane.add(panelShowDetails);
                layeredPane.repaint();
                layeredPane.revalidate();

                txtBookingDetails.setText(booking.searchArray(condition, matricNo));

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "PLEASE ENTER THE MATRIC NO.");
            }
        }


    }//GEN-LAST:event_btnSearchConfirmActionPerformed

    private void btnSearchResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchResetActionPerformed
        //reset SEARCH form
        buttonGroup2.clearSelection();
    }//GEN-LAST:event_btnSearchResetActionPerformed

    private void btnSearchBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchBackActionPerformed
        //reset SEARCH form
        buttonGroup2.clearSelection();

        //remove previous panel and add panelViewDetailsMenu
        layeredPane.removeAll();
        layeredPane.add(panelViewDetailsMenu);
        layeredPane.repaint();
        layeredPane.revalidate();
    }//GEN-LAST:event_btnSearchBackActionPerformed

    //-------------------------- VIEW ALL BOOKING DETAILS---------------------------------
    private void btnResetBookingDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetBookingDetailsActionPerformed
        txtBookingDetails.setText("");
    }//GEN-LAST:event_btnResetBookingDetailsActionPerformed

    private void btnBackBookingDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackBookingDetailsActionPerformed
        layeredPane.removeAll();
        layeredPane.add(panelViewDetailsMenu);
        layeredPane.repaint();
        layeredPane.revalidate();
    }//GEN-LAST:event_btnBackBookingDetailsActionPerformed

    //-------------------------- DELETE OLD BOOKING MENU ---------------------------------
    private void btnDeleteOldBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteOldBookingActionPerformed
        layeredPane.removeAll();
        layeredPane.add(panelDelete);
        layeredPane.repaint();
        layeredPane.revalidate();
    }//GEN-LAST:event_btnDeleteOldBookingActionPerformed

    //-------------------------- DELETE  BOOKING  ---------------------------------
    private void btnDeleteConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteConfirmActionPerformed

        if (rdStaffDelete.isSelected()) {
            condition = "STAFF";
            try {
                staffID = Integer.parseInt(JOptionPane.showInputDialog("ENTER STAFF ID:"));
                deleteInfo = booking.deleteArray(condition, staffID);
                JOptionPane.showMessageDialog(this, deleteInfo, "DELETE BOOKING", JOptionPane.INFORMATION_MESSAGE);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "PLEASE ENTER THE STAFF ID.");
            }

        } else if (rdStudentDelete.isSelected()) {
            condition = "STUDENT";
            try {
                matricNo = Integer.parseInt(JOptionPane.showInputDialog("ENTER MATRIC NO.:"));
                deleteInfo = booking.deleteArray(condition, matricNo);
                JOptionPane.showMessageDialog(this, deleteInfo, "DELETE BOOKING", JOptionPane.INFORMATION_MESSAGE);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "PLEASE ENTER THE MATRIC NO..");
            }

        }


    }//GEN-LAST:event_btnDeleteConfirmActionPerformed

    private void btnDeleteResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteResetActionPerformed
        //reset DELETE form
        buttonGroup1.clearSelection();
    }//GEN-LAST:event_btnDeleteResetActionPerformed

    private void btnDeleteBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteBackActionPerformed
        //reset DELETE form
        buttonGroup1.clearSelection();

        //remove previous panel and add panelMenu
        layeredPane.removeAll();
        layeredPane.add(panelMenu);
        layeredPane.repaint();
        layeredPane.revalidate();
    }//GEN-LAST:event_btnDeleteBackActionPerformed

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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }
        //</editor-fold>

        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser bookingDate;
    private javax.swing.JButton btnAddNewBooking;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnBackBookingDetails;
    private javax.swing.JButton btnBookingSearch;
    private javax.swing.JButton btnCalculateBookingFees;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JButton btnDeleteBack;
    private javax.swing.JButton btnDeleteConfirm;
    private javax.swing.JButton btnDeleteOldBooking;
    private javax.swing.JButton btnDeleteReset;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnResetBookingDetails;
    private javax.swing.JButton btnReturnToMenu2;
    private javax.swing.JButton btnSearchBack;
    private javax.swing.JButton btnSearchConfirm;
    private javax.swing.JButton btnSearchReset;
    private javax.swing.JButton btnViewAllBooking;
    private javax.swing.JButton btnViewBookingDetails;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JComboBox<String> cboLocation;
    private javax.swing.JComboBox<String> cboTime;
    private javax.swing.JCheckBox chbMicrophone;
    private javax.swing.JCheckBox chbProjector;
    private javax.swing.JLayeredPane layeredPane;
    private javax.swing.JLabel lblBookersAdd;
    private javax.swing.JLabel lblBookersSearch;
    private javax.swing.JLabel lblBookingDelete;
    private javax.swing.JLabel lblBookingDetails;
    private javax.swing.JLabel lblBookingFeesDetails;
    private javax.swing.JLabel lblBookingOrder;
    private javax.swing.JLabel lblBookingSearch;
    private javax.swing.JLabel lblDate;
    private javax.swing.JLabel lblItems;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblNewBookingMenu1;
    private javax.swing.JLabel lblPurpose;
    private javax.swing.JLabel lblTime;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel panelAddBooking;
    private javax.swing.JPanel panelDelete;
    private javax.swing.JPanel panelMain;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelSearch;
    private javax.swing.JPanel panelShowDetails;
    private javax.swing.JPanel panelViewDetailsMenu;
    private javax.swing.JRadioButton rdStaffAdd;
    private javax.swing.JRadioButton rdStaffDelete;
    private javax.swing.JRadioButton rdStaffSearch;
    private javax.swing.JRadioButton rdStudentAdd;
    private javax.swing.JRadioButton rdStudentDelete;
    private javax.swing.JRadioButton rdStudentSearch;
    private javax.swing.JScrollPane scpBookingDetails;
    private javax.swing.JScrollPane spBookingFeesDetails;
    private javax.swing.JTextArea txtBookingDetails;
    private javax.swing.JTextArea txtBookingFeesDetails;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPurpose;
    // End of variables declaration//GEN-END:variables
}
