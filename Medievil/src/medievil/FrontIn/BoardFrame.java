package medievil.FrontIn;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import medievil.BackEnd.Movement;
import medievil.BackEnd.Board;

public class BoardFrame extends javax.swing.JFrame {

    public Board board;
    public boolean createdBoard = false;
    public PlayersInfoDialog information;
    public static String button;
    public Movement movement;
    
    public BoardFrame() {
        initComponents();
        information = new PlayersInfoDialog(this);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        name2 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        p4 = new javax.swing.JLabel();
        p5 = new javax.swing.JLabel();
        moverArriba = new javax.swing.JButton();
        moverIzquierda = new javax.swing.JButton();
        moverDerecha = new javax.swing.JButton();
        lanzarDado = new javax.swing.JButton();
        numDado = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        name1 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        p1 = new javax.swing.JLabel();
        p2 = new javax.swing.JLabel();
        p3 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        p6 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        moverAbajo = new javax.swing.JButton();
        panelv1 = new javax.swing.JPanel();
        panelv2 = new javax.swing.JPanel();
        panelv3 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        newGame = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(21, 14, 14));

        panel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 153), 2, true));
        panel1.setPreferredSize(new java.awt.Dimension(600, 600));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 596, Short.MAX_VALUE)
        );

        jLabel19.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 102, 204));
        jLabel19.setText("Player 2:");

        name2.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        name2.setForeground(new java.awt.Color(0, 102, 102));
        name2.setText("NOMBRE");

        jLabel22.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 102, 102));
        jLabel22.setText("CHARACTERS:");

        p4.setText("personaje 1");

        p5.setText("personaje 2");

        moverArriba.setForeground(new java.awt.Color(0, 102, 102));
        moverArriba.setText("Up");
        moverArriba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moverArribaActionPerformed(evt);
            }
        });

        moverIzquierda.setText("Left");
        moverIzquierda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moverIzquierdaActionPerformed(evt);
            }
        });

        moverDerecha.setText("Right");
        moverDerecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moverDerechaActionPerformed(evt);
            }
        });

        lanzarDado.setText("Lanzar dado");
        lanzarDado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lanzarDadoActionPerformed(evt);
            }
        });

        numDado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/dadofondo.jpg"))); // NOI18N
        numDado.setText("NUMERO DADO");
        numDado.setPreferredSize(new java.awt.Dimension(150, 150));

        jLabel27.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(0, 102, 204));
        jLabel27.setText("Player 1:");

        name1.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        name1.setForeground(new java.awt.Color(0, 102, 102));
        name1.setText("NOMBRE");

        jLabel29.setFont(new java.awt.Font("DejaVu Sans", 1, 14)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(0, 102, 102));
        jLabel29.setText("CHARACTERS:");

        p1.setText("personaje 1");

        p2.setText("personaje 2");

        p3.setText("personaje 3");

        jLabel33.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 51, 51));
        jLabel33.setText("VIDAS");

        p6.setText("personaje 3");

        jLabel36.setFont(new java.awt.Font("DejaVu Sans", 0, 18)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(0, 51, 51));
        jLabel36.setText("VIDAS");

        moverAbajo.setForeground(new java.awt.Color(0, 102, 102));
        moverAbajo.setText("Down");
        moverAbajo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                moverAbajoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelv1Layout = new javax.swing.GroupLayout(panelv1);
        panelv1.setLayout(panelv1Layout);
        panelv1Layout.setHorizontalGroup(
            panelv1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        panelv1Layout.setVerticalGroup(
            panelv1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 122, Short.MAX_VALUE)
        );

        panelv2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 153), 1, true));
        panelv2.setPreferredSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout panelv2Layout = new javax.swing.GroupLayout(panelv2);
        panelv2.setLayout(panelv2Layout);
        panelv2Layout.setHorizontalGroup(
            panelv2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
        );
        panelv2Layout.setVerticalGroup(
            panelv2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 98, Short.MAX_VALUE)
        );

        panelv3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 153), 1, true));

        javax.swing.GroupLayout panelv3Layout = new javax.swing.GroupLayout(panelv3);
        panelv3.setLayout(panelv3Layout);
        panelv3Layout.setHorizontalGroup(
            panelv3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        panelv3Layout.setVerticalGroup(
            panelv3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel27)
                            .addComponent(jLabel33))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(name1)
                            .addComponent(panelv3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(97, 97, 97)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel29)
                            .addComponent(jLabel22)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(p1)
                                    .addComponent(p2)
                                    .addComponent(p3))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelv1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel36)
                                .addGap(33, 33, 33)
                                .addComponent(panelv2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(18, 18, 18)
                                .addComponent(name2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(moverIzquierda)
                                .addGap(41, 41, 41)
                                .addComponent(moverDerecha))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(moverArriba))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addComponent(moverAbajo)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(p5)
                                    .addComponent(p4)
                                    .addComponent(p6)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(30, 30, 30)
                                        .addComponent(lanzarDado))
                                    .addComponent(numDado, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel27)
                            .addComponent(name1))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel33))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(panelv1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(panelv3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(5, 5, 5)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel19)
                            .addComponent(name2))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(panelv2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel36))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(p1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(p2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(p3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel22)
                        .addGap(18, 18, 18)
                        .addComponent(p4)
                        .addGap(12, 12, 12)
                        .addComponent(p5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(p6)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(moverArriba)
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(moverIzquierda)
                            .addComponent(moverDerecha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(moverAbajo)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(numDado, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lanzarDado)
                        .addGap(51, 51, 51))))
        );

        jMenu1.setText("Game");

        newGame.setText("New Game");
        newGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGameActionPerformed(evt);
            }
        });
        jMenu1.add(newGame);

        jMenuItem2.setText("Exit");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newGameActionPerformed
        information.setVisible(true);
        panel1.removeAll();
        panel1.repaint();
       
        panelv3.removeAll();
        panelv3.repaint();
        
        try {
            board = new Board();
            board = new Board(Integer.parseInt(information.spinnerBoard.getValue().toString()), panel1);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
     
        panelv2.removeAll();
        panelv2.repaint();

        name1.setText(information.name1.getText());
        name2.setText(information.name2.getText());
        p1.setText((String) information.pos1.getValue());
        p2.setText((String) information.pos2.getValue());
        p3.setText((String) information.pos3.getValue());
        p4.setText((String) information.pos4.getValue());
        p5.setText((String) information.pos5.getValue());
        p6.setText((String) information.pos6.getValue());
        createdBoard = true;

    }//GEN-LAST:event_newGameActionPerformed

    private void moverArribaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moverArribaActionPerformed
        button = evt.getActionCommand();
        if (!createdBoard) {
            System.out.println("Tablero no creado");
            return;
        }
        movement = new Movement(2, board);
        movement.start();
// TODO add your handling code here:
    }//GEN-LAST:event_moverArribaActionPerformed

    private void moverIzquierdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moverIzquierdaActionPerformed
        button = evt.getActionCommand();
        if (!createdBoard) {
            System.out.println("Tablero no creado");
            return;
        }
        movement = new Movement(2, board);
        movement.start();
// TODO add your handling code here:
    }//GEN-LAST:event_moverIzquierdaActionPerformed

    private void moverDerechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moverDerechaActionPerformed
        button = evt.getActionCommand();
        if (!createdBoard) {
            System.out.println("Tablero no creado");
            return;
        }
        movement = new Movement(2, board);
        movement.start();

    }//GEN-LAST:event_moverDerechaActionPerformed

    private void lanzarDadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lanzarDadoActionPerformed

        System.out.println(diceNumber());
        diceNumber();
    }//GEN-LAST:event_lanzarDadoActionPerformed

    private void moverAbajoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moverAbajoActionPerformed

        button = evt.getActionCommand();
        if (!createdBoard) {
            System.out.println("Tablero no creado");
            return;
        }
        movement = new Movement(2, board);
        movement.start();
    }//GEN-LAST:event_moverAbajoActionPerformed

    public int diceNumber() {
        int numMovimientos = (int) (Math.random() * 6 + 1);

        switch (numMovimientos) {

            case 1:
                numDado.setIcon(new ImageIcon(getClass().getResource("/Imagen/dado1.png")));
                break;
            case 2:
                numDado.setIcon(new ImageIcon(getClass().getResource("/Imagen/dado2.png")));
                break;
            case 3:
                numDado.setIcon(new ImageIcon(getClass().getResource("/Imagen/dado3.png")));
                break;
            case 4:
                numDado.setIcon(new ImageIcon(getClass().getResource("/Imagen/dado4.png")));
                break;
            case 5:
                numDado.setIcon(new ImageIcon(getClass().getResource("/Imagen/dado5.png")));
                break;
            case 6:
                numDado.setIcon(new ImageIcon(getClass().getResource("/Imagen/dado6.png")));
                break;

        }
        return numMovimientos;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    public javax.swing.JButton lanzarDado;
    public javax.swing.JButton moverAbajo;
    public javax.swing.JButton moverArriba;
    public javax.swing.JButton moverDerecha;
    public javax.swing.JButton moverIzquierda;
    public javax.swing.JLabel name1;
    public javax.swing.JLabel name2;
    private javax.swing.JMenuItem newGame;
    public javax.swing.JLabel numDado;
    public javax.swing.JLabel p1;
    public javax.swing.JLabel p2;
    public javax.swing.JLabel p3;
    public javax.swing.JLabel p4;
    public javax.swing.JLabel p5;
    public javax.swing.JLabel p6;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panelv1;
    public javax.swing.JPanel panelv2;
    public javax.swing.JPanel panelv3;
    // End of variables declaration//GEN-END:variables
}
