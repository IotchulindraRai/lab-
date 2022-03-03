package hello;

import java.awt.*;
import java.awt.event.*; 
import javax.swing.*; 
import javax.swing.event.*; 
import javax.swing.tree.*; 
public class Lab12 extends JApplet {
    public void init() { 
        try {
             SwingUtilities.invokeAndWait ( new Runnable() {
                  public void run() { makeGUI(); } } );
                } 
                  catch(Exception e) { System.out.println(e); 
               }
            } 
            private void makeGUI() { 
                JTabbedPane jtp=new JTabbedPane(); jtp.addTab("Cities",new CitiesPanel());
                 jtp.addTab("Color",new ColorPanel()); jtp.addTab("Flavors",new FlaverPanel()); jtp.addTab("Gender",new GenderPanel()); jtp.addTab("USN",new USNPanel());
                  jtp.addTab("Course",new CoursePanel()); 
                  add(jtp); }
                } 
                class CitiesPanel extends JPanel implements ActionListener { 
                    JLabel clab; 
   public CitiesPanel()

   { 
       JButton b1=new JButton("NewYork");
        b1.setActionCommand("NewYork"); 
        b1.addActionListener(this); 
        add(b1); 
        JButton b2=new JButton("Landon");
         b2.setActionCommand("Landon");
          b2.addActionListener(this); 
          add(b2);
        JButton b3=new JButton("HongKong");
         b3.setActionCommand("HongKong");
          b3.addActionListener(this); 
          add(b3);
           JButton b4=new JButton("Tokyo"); 
           b4.setActionCommand("Tokyo");
            b4.addActionListener(this);
             add(b4); 
        clab=new JLabel("Click a Button"); 
        add(clab); }
         public void actionPerformed(ActionEvent ae) { 
             clab.setText("You Clicked : "+ae.getActionCommand());
            } } 
            class ColorPanel extends JPanel implements ItemListener {
              JLabel colab; 
              JCheckBox cb; 
              public ColorPanel() { 
                  cb=new JCheckBox("red"); 
              cb.addItemListener(this);
               add(cb); 
               cb=new JCheckBox("green"); 
               cb.addItemListener(this); 
               add(cb); 
               cb=new JCheckBox("Blue"); 
               cb.addItemListener(this); 
               add(cb);
                colab=new JLabel("Select A Color");
                add(colab); }
                public void itemStateChanged(ItemEvent ie) {
                     JCheckBox cb=(JCheckBox)ie.getItem(); 
                     if(cb.isSelected()) colab.setText(cb.getText() + " is Selected ");
        else colab.setText(cb.getText() + " is Cleared "); 
       } 
   } 
   class FlaverPanel extends JPanel implements ActionListener {
       String clist[]={"vanila","Choclate","Strawberry"};
        JLabel flab; JComboBox jcb; 
        public FlaverPanel() { 
            jcb=new JComboBox(clist); 
            jcb.addActionListener(this); add(jcb);
             flab=new JLabel("Select from Combo"); add(flab); 
           } 
           public void actionPerformed(ActionEvent ae) { 
               flab.setText("You Selected : "+jcb.getSelectedItem()); } }
                class GenderPanel extends JPanel implements ActionListener { JLabel glab;
                    public GenderPanel() {
                         JRadioButton rb1=new JRadioButton("M");
                          rb1.addActionListener(this);
                           add(rb1); JRadioButton rb2=new JRadioButton("F");
                            rb2.addActionListener(this); add(rb2); ButtonGroup bg1=new ButtonGroup(); bg1.add(rb1); bg1.add(rb2); glab=new JLabel("Select One"); 
                            add(glab);
                            } 
                            public void actionPerformed(ActionEvent ae) { 
                              glab.setText("You Clicked : "+ae.getActionCommand()); } 
                            } 
                         class USNPanel extends JPanel implements ListSelectionListener { 
                             JLabel ulab;
                             JList jlst;
                              String Usn[]={"1BY10MCA01","1BY10MCA02","1BY10MCA03","1BY10MCA04","1BY10MCA0 5","1BY10MCA06","1BY10MCA07","1BY10MCA08","1BY10MCA09","1BY10MCA10"};
                           public USNPanel() { 
                                         jlst=new JList(Usn); jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); JScrollPane jscrlp=new JScrollPane(jlst); jscrlp.setPreferredSize(new Dimension(100,80)); jlst.addListSelectionListener(this);
                           add(jscrlp);
                           ulab=new JLabel("Select One"); 
                           add(ulab);
                        } 
                        public void valueChanged(ListSelectionEvent le) 
                        {
                             int idx=jlst.getSelectedIndex(); 
                             if(idx!=-1) ulab.setText("Current Selection "+Usn[idx]); 
                             else
                              ulab=new JLabel("Select One");
                            } 
                           } 
                           class CoursePanel extends JPanel implements TreeSelectionListener {
                                JLabel tlab; public CoursePanel() { 
                                    DefaultMutableTreeNode top =new DefaultMutableTreeNode("Course");
                                      DefaultMutableTreeNode a =new DefaultMutableTreeNode("UG");
                                     DefaultMutableTreeNode a1 =new DefaultMutableTreeNode("BA");
                                      DefaultMutableTreeNode a2 =new DefaultMutableTreeNode("BSc");
                                       DefaultMutableTreeNode a3 =new DefaultMutableTreeNode("BCA"); 
                                       DefaultMutableTreeNode b =new DefaultMutableTreeNode("PG");
                                        DefaultMutableTreeNode b1 =new DefaultMutableTreeNode("MA");
                                         DefaultMutableTreeNode b2 =new DefaultMutableTreeNode("MSc");
                                          DefaultMutableTreeNode b3 =new DefaultMutableTreeNode("MCA");
                                           top.add(a); a.add(a1);
                                            a.add(a2); a.add(a3); 
                                            top.add(b); 
                                           b.add(b1); b.add(b2);
                                            b.add(b3); JTree jt=new JTree(top); 
                                           JScrollPane jsp=new JScrollPane(jt);
                                            jsp.setPreferredSize(new Dimension(150,200)); jt.addTreeSelectionListener(this); add(jsp); tlab=new JLabel("Select One"); add(tlab); } public void valueChanged(TreeSelectionEvent tse) {
                                                tlab.setText("Current Selection "+tse.getPath()); 
                                           
                       } }