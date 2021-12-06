import java.awt.Font;
import java.awt.Color;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;

public class MainForm extends javax.swing.JFrame {

    public MainForm() {
    	setResizable(true);
    	getContentPane().setBackground(Color.BLACK);
    
    	initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel3.setBounds(-16, 0, 279, 825);
        jPanel4 = new javax.swing.JPanel();
        jPanel4.setBounds(0, 59, 302, 6);
        jLabel5 = new javax.swing.JLabel();
        jLabel5.setBounds(103, 20, 80, 29);
        jLabel10 = new javax.swing.JLabel();
        jLabel10.setBounds(113, 399, 71, 25);
        jLabel11 = new javax.swing.JLabel();
        jLabel11.setBounds(20, 430, 68, 32);
        jLabel12 = new javax.swing.JLabel();
        jLabel12.setBounds(20, 468, 100, 32);
        jLabel17 = new javax.swing.JLabel();
        jLabel17.setBounds(20, 284, 68, 32);
        jLabel18 = new javax.swing.JLabel();
        jLabel18.setBounds(118, 266, 61, 25);
        jLabel22 = new javax.swing.JLabel();
        jLabel22.setBounds(20, 506, 129, 32);
        jLabel24 = new javax.swing.JLabel();
        jLabel24.setBounds(20, 540, 257, 32);
        welUser = new javax.swing.JLabel();
        welUser.setBounds(741, 50, 300, 48);
        jLabel25 = new javax.swing.JLabel();
        jLabel25.setForeground(Color.WHITE);
        jLabel25.setBackground(new Color(240, 240, 240));
        jLabel25.setBounds(684, 90, 357, 60);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(Color.GRAY);

        jPanel3.setBackground(Color.BLACK);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 6, Short.MAX_VALUE)
        );

        jLabel5.setFont(new Font("Agency FB", Font.BOLD, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Dashboard");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Teacher");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add_user.png"))); // NOI18N
        jLabel11.setText("Add");
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jLabel11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel11KeyPressed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/manage.png"))); // NOI18N
        jLabel12.setText("Manage");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel12MousePressed(evt);
            }
        });

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add_user.png"))); // NOI18N
        jLabel17.setText("Add");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jLabel17.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel17KeyPressed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Course");

        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/attendance.png"))); // NOI18N
        jLabel22.setText("Attendance");
        jLabel22.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel22MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel22MousePressed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/allAttendance.png"))); // NOI18N
        jLabel24.setText("Show Teachers Attendance");
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel24MousePressed(evt);
            }
        });
        
        jPanel4_1 = new JPanel();
        jPanel4_1.setBounds(0, 250, 292, 6);
        jPanel4_1.setBackground(Color.WHITE);
        GroupLayout gl_jPanel4_1 = new GroupLayout(jPanel4_1);
        gl_jPanel4_1.setHorizontalGroup(
        	gl_jPanel4_1.createParallelGroup(Alignment.LEADING)
        		.addGap(0, 292, Short.MAX_VALUE)
        		.addGap(0, 292, Short.MAX_VALUE)
        );
        gl_jPanel4_1.setVerticalGroup(
        	gl_jPanel4_1.createParallelGroup(Alignment.LEADING)
        		.addGap(0, 6, Short.MAX_VALUE)
        		.addGap(0, 6, Short.MAX_VALUE)
        );
        jPanel4_1.setLayout(gl_jPanel4_1);
        
        jPanel4_2 = new JPanel();
        jPanel4_2.setBounds(0, 375, 292, 6);
        jPanel4_2.setBackground(Color.WHITE);
        GroupLayout gl_jPanel4_2 = new GroupLayout(jPanel4_2);
        gl_jPanel4_2.setHorizontalGroup(
        	gl_jPanel4_2.createParallelGroup(Alignment.LEADING)
        		.addGap(0, 292, Short.MAX_VALUE)
        		.addGap(0, 292, Short.MAX_VALUE)
        );
        gl_jPanel4_2.setVerticalGroup(
        	gl_jPanel4_2.createParallelGroup(Alignment.LEADING)
        		.addGap(0, 6, Short.MAX_VALUE)
        		.addGap(0, 6, Short.MAX_VALUE)
        );
        jPanel4_2.setLayout(gl_jPanel4_2);
        
        jPanel4_3 = new JPanel();
        jPanel4_3.setBounds(0, 579, 292, 6);
        jPanel4_3.setBackground(Color.WHITE);
        GroupLayout gl_jPanel4_3 = new GroupLayout(jPanel4_3);
        gl_jPanel4_3.setHorizontalGroup(
        	gl_jPanel4_3.createParallelGroup(Alignment.LEADING)
        		.addGap(0, 292, Short.MAX_VALUE)
        		.addGap(0, 292, Short.MAX_VALUE)
        );
        gl_jPanel4_3.setVerticalGroup(
        	gl_jPanel4_3.createParallelGroup(Alignment.LEADING)
        		.addGap(0, 6, Short.MAX_VALUE)
        		.addGap(0, 6, Short.MAX_VALUE)
        );
        jPanel4_3.setLayout(gl_jPanel4_3);
        jLabel9 = new javax.swing.JLabel();
        jLabel9.setBounds(237, 10, 39, 22);
        
                jLabel9.setFont(new Font("Agency FB", Font.BOLD, 18)); // NOI18N
                jLabel9.setForeground(new java.awt.Color(255, 255, 255));
                jLabel9.setText("Logout");
                jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        jLabel9MouseClicked(evt);
                    }
                });

        welUser.setFont(new Font("Agency FB", Font.PLAIN, 40)); // NOI18N
        welUser.setForeground(Color.WHITE);
        welUser.setText("Welcome");

        jLabel25.setFont(new Font("Agency FB", Font.PLAIN, 50)); // NOI18N
        jLabel25.setText("University Management");
        jPanel3.setLayout(null);
        jPanel3.add(jPanel4);
        jPanel3.add(jLabel5);
        jPanel3.add(jLabel9);
        jPanel3.add(jPanel4_1);
        jPanel3.add(jLabel10);
        jPanel3.add(jPanel4_3);
        jPanel3.add(jLabel17);
        jPanel3.add(jLabel18);
        jPanel3.add(jLabel24);
        jPanel3.add(jLabel22);
        jPanel3.add(jLabel12);
        jPanel3.add(jLabel11);
        jPanel3.add(jPanel4_2);
        
        panel = new JPanel();
        panel.setBounds(10, 64, 292, 192);
        panel.setBackground(SystemColor.textHighlight);
        panel.setForeground(SystemColor.textHighlight);
        jPanel3.add(panel);
        panel.setLayout(null);
        jLabel6 = new javax.swing.JLabel();
        jLabel6.setBounds(10, 40, 68, 32);
        panel.add(jLabel6);
        
                jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
                jLabel6.setForeground(new java.awt.Color(255, 255, 255));
                jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add_user.png"))); // NOI18N
                jLabel6.setText("Add");
                jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                        jLabel6MouseClicked(evt);
                    }
                });
                jLabel6.addKeyListener(new java.awt.event.KeyAdapter() {
                    public void keyPressed(java.awt.event.KeyEvent evt) {
                        jLabel6KeyPressed(evt);
                    }
                });
        jLabel4 = new javax.swing.JLabel();
        jLabel4.setBounds(103, 10, 68, 25);
        panel.add(jLabel4);
        
                jLabel4.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
                jLabel4.setForeground(new java.awt.Color(255, 255, 255));
                jLabel4.setText("Student");
                jLabel7 = new javax.swing.JLabel();
                jLabel7.setBounds(10, 78, 100, 32);
                panel.add(jLabel7);
                
                        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
                        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
                        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/manage.png"))); // NOI18N
                        jLabel7.setText("Manage");
                        jLabel21 = new javax.swing.JLabel();
                        jLabel21.setBounds(10, 120, 129, 32);
                        panel.add(jLabel21);
                        
                                jLabel21.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
                                jLabel21.setForeground(new java.awt.Color(255, 255, 255));
                                jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/attendance.png"))); // NOI18N
                                jLabel21.setText("Attendance");
                                jLabel23 = new javax.swing.JLabel();
                                jLabel23.setBounds(10, 158, 256, 32);
                                panel.add(jLabel23);
                                
                                        jLabel23.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
                                        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
                                        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/allAttendance.png"))); // NOI18N
                                        jLabel23.setText("Show Students Attendance");
                                        
                                        panel_1 = new JPanel();
                                        panel_1.setBounds(0, 254, 297, 121);
                                        panel_1.setBackground(new Color(139, 0, 0));
                                        jPanel3.add(panel_1);
                                        panel_1.setLayout(null);
                                        jLabel16 = new javax.swing.JLabel();
                                        jLabel16.setBounds(22, 68, 100, 32);
                                        panel_1.add(jLabel16);
                                        
                                                jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
                                                jLabel16.setForeground(new java.awt.Color(255, 255, 255));
                                                jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/manage.png"))); // NOI18N
                                                jLabel16.setText("Manage");
                                                jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
                                                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                                                        jLabel16MouseClicked(evt);
                                                    }
                                                    public void mousePressed(java.awt.event.MouseEvent evt) {
                                                        jLabel16MousePressed(evt);
                                                    }
                                                });
                                        
                                        panel_2 = new JPanel();
                                        panel_2.setBounds(0, 379, 282, 201);
                                        panel_2.setBackground(new Color(128, 0, 128));
                                        jPanel3.add(panel_2);
                                        
                                        panel_3 = new JPanel();
                                        panel_3.setBounds(0, 579, 282, 141);
                                        panel_3.setBackground(new Color(139, 69, 19));
                                        jPanel3.add(panel_3);
                                        panel_3.setLayout(null);
                                        jLabel14 = new javax.swing.JLabel();
                                        jLabel14.setBounds(23, 30, 68, 32);
                                        panel_3.add(jLabel14);
                                        
                                                jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
                                                jLabel14.setForeground(new java.awt.Color(255, 255, 255));
                                                jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add_user.png"))); // NOI18N
                                                jLabel14.setText("Add");
                                                jLabel15 = new javax.swing.JLabel();
                                                jLabel15.setBounds(115, 10, 50, 25);
                                                panel_3.add(jLabel15);
                                                
                                                        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
                                                        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
                                                        jLabel15.setText("Score");
                                                        jLabel13 = new javax.swing.JLabel();
                                                        jLabel13.setBounds(23, 72, 100, 32);
                                                        panel_3.add(jLabel13);
                                                        
                                                                jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
                                                                jLabel13.setForeground(new java.awt.Color(255, 255, 255));
                                                                jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/manage.png"))); // NOI18N
                                                                jLabel13.setText("Manage");
                                                                jLabel8 = new javax.swing.JLabel();
                                                                jLabel8.setBounds(23, 103, 183, 32);
                                                                panel_3.add(jLabel8);
                                                                
                                                                        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
                                                                        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
                                                                        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/grade.png"))); // NOI18N
                                                                        jLabel8.setText("All Students Score");
                                                                        
                                                                        jPanel4_4 = new JPanel();
                                                                        jPanel4_4.setBounds(0, 145, 292, 6);
                                                                        panel_3.add(jPanel4_4);
                                                                        jPanel4_4.setBackground(Color.WHITE);
                                                                        GroupLayout gl_jPanel4_4 = new GroupLayout(jPanel4_4);
                                                                        gl_jPanel4_4.setHorizontalGroup(
                                                                        	gl_jPanel4_4.createParallelGroup(Alignment.LEADING)
                                                                        		.addGap(0, 292, Short.MAX_VALUE)
                                                                        		.addGap(0, 292, Short.MAX_VALUE)
                                                                        );
                                                                        gl_jPanel4_4.setVerticalGroup(
                                                                        	gl_jPanel4_4.createParallelGroup(Alignment.LEADING)
                                                                        		.addGap(0, 6, Short.MAX_VALUE)
                                                                        		.addGap(0, 6, Short.MAX_VALUE)
                                                                        );
                                                                        jPanel4_4.setLayout(gl_jPanel4_4);
                                                                        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
                                                                            public void mouseClicked(java.awt.event.MouseEvent evt) {
                                                                                jLabel8MouseClicked(evt);
                                                                            }
                                                                        });
                                                                jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
                                                                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                                                                        jLabel13MouseClicked(evt);
                                                                    }
                                                                    public void mousePressed(java.awt.event.MouseEvent evt) {
                                                                        jLabel13MousePressed(evt);
                                                                    }
                                                                });
                                                jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
                                                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                                                        jLabel14MouseClicked(evt);
                                                    }
                                                });
                                                jLabel14.addKeyListener(new java.awt.event.KeyAdapter() {
                                                    public void keyPressed(java.awt.event.KeyEvent evt) {
                                                        jLabel14KeyPressed(evt);
                                                    }
                                                });
                                        
                                        panel_4 = new JPanel();
                                        panel_4.setBounds(0, 726, 282, 293);
                                        panel_4.setBackground(new Color(47, 79, 79));
                                        jPanel3.add(panel_4);
                                        panel_4.setLayout(null);
                                        jLabel20 = new javax.swing.JLabel();
                                        jLabel20.setBounds(23, 10, 68, 32);
                                        panel_4.add(jLabel20);
                                        
                                                jLabel20.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
                                                jLabel20.setForeground(new java.awt.Color(255, 255, 255));
                                                jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add_user.png"))); // NOI18N
                                                jLabel20.setText("Add");
                                                jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
                                                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                                                        jLabel20MouseClicked(evt);
                                                    }
                                                });
                                                jLabel20.addKeyListener(new java.awt.event.KeyAdapter() {
                                                    public void keyPressed(java.awt.event.KeyEvent evt) {
                                                        jLabel20KeyPressed(evt);
                                                    }
                                                });
                                        jLabel19 = new javax.swing.JLabel();
                                        jLabel19.setBounds(110, 0, 56, 25);
                                        panel_4.add(jLabel19);
                                        
                                                jLabel19.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
                                                jLabel19.setForeground(new java.awt.Color(255, 255, 255));
                                                jLabel19.setText("Admin");
                                                
                                                jPanel4_5 = new JPanel();
                                                jPanel4_5.setBounds(0, 720, 292, 6);
                                                jPanel4_5.setBackground(Color.WHITE);
                                                jPanel3.add(jPanel4_5);
                                                GroupLayout gl_jPanel4_5 = new GroupLayout(jPanel4_5);
                                                gl_jPanel4_5.setHorizontalGroup(
                                                	gl_jPanel4_5.createParallelGroup(Alignment.LEADING)
                                                		.addGap(0, 292, Short.MAX_VALUE)
                                                		.addGap(0, 292, Short.MAX_VALUE)
                                                );
                                                gl_jPanel4_5.setVerticalGroup(
                                                	gl_jPanel4_5.createParallelGroup(Alignment.LEADING)
                                                		.addGap(0, 6, Short.MAX_VALUE)
                                                		.addGap(0, 6, Short.MAX_VALUE)
                                                );
                                                jPanel4_5.setLayout(gl_jPanel4_5);
                                        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
                                            public void mouseClicked(java.awt.event.MouseEvent evt) {
                                                jLabel23MouseClicked(evt);
                                            }
                                            public void mousePressed(java.awt.event.MouseEvent evt) {
                                                jLabel23MousePressed(evt);
                                            }
                                        });
                                jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
                                    public void mouseClicked(java.awt.event.MouseEvent evt) {
                                        jLabel21MouseClicked(evt);
                                    }
                                    public void mousePressed(java.awt.event.MouseEvent evt) {
                                        jLabel21MousePressed(evt);
                                    }
                                });
                        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
                            public void mouseClicked(java.awt.event.MouseEvent evt) {
                                jLabel7MouseClicked(evt);
                            }
                            public void mousePressed(java.awt.event.MouseEvent evt) {
                                jLabel7MousePressed(evt);
                            }
                        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 1485, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 782, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel1.setLayout(null);
        jPanel1.add(jPanel3);
        jPanel1.add(welUser);
        jPanel1.add(jLabel25);
        
        JPanel panel_5 = new JPanel();
        panel_5.setBorder(new LineBorder(new Color(0, 0, 0), 8, true));
        panel_5.setBackground(Color.DARK_GRAY);
        panel_5.setBounds(329, 561, 1101, 194);
        jPanel1.add(panel_5);
        panel_5.setLayout(null);
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setBounds(862, 20, 128, 128);
        panel_5.add(jLabel1);
        
                jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/teacher.png"))); // NOI18N
                jLabel3 = new javax.swing.JLabel();
                jLabel3.setBounds(491, 20, 128, 128);
                panel_5.add(jLabel3);
                
                        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/course.png"))); // NOI18N
                        jLabel2 = new javax.swing.JLabel();
                        jLabel2.setBounds(129, 20, 128, 128);
                        panel_5.add(jLabel2);
                        
                                jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/student.png"))); // NOI18N
                                CT = new javax.swing.JLabel();
                                CT.setForeground(Color.WHITE);
                                CT.setBounds(862, 156, 237, 22);
                                panel_5.add(CT);
                                
                                        CT.setBackground(new java.awt.Color(255, 255, 255));
                                        CT.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
                                        CT.setText("Current Teachers =");
                                        CC = new javax.swing.JLabel();
                                        CC.setForeground(Color.WHITE);
                                        CC.setBounds(491, 156, 232, 22);
                                        panel_5.add(CC);
                                        
                                                CC.setBackground(new java.awt.Color(255, 255, 255));
                                                CC.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
                                                CC.setText("Current Courses =");
                                                CS = new javax.swing.JLabel();
                                                CS.setForeground(Color.WHITE);
                                                CS.setBounds(129, 156, 249, 22);
                                                panel_5.add(CS);
                                                
                                                        CS.setBackground(new java.awt.Color(255, 255, 255));
                                                        CS.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
                                                        CS.setText("Current Students =");
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setBounds(263, -25, 1269, 852);
        lblNewLabel.setIcon(new ImageIcon(MainForm.class.getResource("/images/16.jpg")));
        jPanel1.add(lblNewLabel);
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        ManageStudents ms = new ManageStudents();
        ms.setVisible(true);
        ms.pack();
        ms.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MousePressed

    private void jLabel6KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel6KeyPressed

    }//GEN-LAST:event_jLabel6KeyPressed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        AddStudent s = new AddStudent();
        s.setVisible(true);
        s.pack();
        s.setLocationRelativeTo(null);

    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        ShowScore ss = new ShowScore();
        ss.setVisible(true);
        ss.pack();
        ss.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel11MouseClicked
        AddTeacher at = new AddTeacher();
        at.setVisible(true);
        at.pack();
        at.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabel11MouseClicked

    private void jLabel11KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel11KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel11KeyPressed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseClicked

    private void jLabel12MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MousePressed
        ManageTeachers mt = new ManageTeachers();
        mt.setVisible(true);
        mt.pack();
        mt.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabel12MousePressed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        ManageScore ms = new ManageScore();
        ms.setVisible(true);
        ms.pack();
        ms.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel13MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MousePressed

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        AddScore as = new AddScore();
        as.setVisible(true);
        as.pack();
        as.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabel14MouseClicked

    private void jLabel14KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel14KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel14KeyPressed

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        ManageCourse mc = new ManageCourse();
        mc.setVisible(true);
        mc.pack();
        mc.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel16MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel16MousePressed

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        AddCourse ac = new AddCourse();
        ac.setVisible(true);
        ac.pack();
        ac.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel17KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel17KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel17KeyPressed

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        AddAdmin ad = new AddAdmin();
        ad.setVisible(true);
        ad.pack();
        ad.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel20KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel20KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel20KeyPressed

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        Students_Attendance sa = new Students_Attendance();
        sa.setVisible(true);
        sa.pack();
        sa.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabel21MouseClicked

    private void jLabel21MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel21MousePressed

    private void jLabel22MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MouseClicked
        Teacher_Attendance ta = new Teacher_Attendance();
        ta.setVisible(true);
        ta.pack();
        ta.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabel22MouseClicked

    private void jLabel22MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel22MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel22MousePressed

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
        ShowAllStudentsAttendance sas = new ShowAllStudentsAttendance();
        sas.setVisible(true);
        sas.pack();
        sas.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel23MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel23MousePressed

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        ShowAllTeachersAttendance ast = new ShowAllTeachersAttendance();
        ast.setVisible(true);
        ast.pack();
        ast.setLocationRelativeTo(null);
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel24MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel24MousePressed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel CC;
    public static javax.swing.JLabel CS;
    public static javax.swing.JLabel CT;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    public static javax.swing.JLabel welUser;
    private JPanel jPanel4_1;
    private JPanel jPanel4_2;
    private JPanel jPanel4_3;
    private JPanel jPanel4_4;
    private JPanel panel;
    private JPanel panel_1;
    private JPanel panel_2;
    private JPanel panel_3;
    private JPanel panel_4;
    private JPanel jPanel4_5;
}
