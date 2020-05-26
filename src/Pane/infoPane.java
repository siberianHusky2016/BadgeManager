package Pane;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.PanelUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Kevin on 2015/8/6.
 */
public class infoPane extends JPanel{
    public infoPane(){

        //setLayout(new FlowLayout(FlowLayout.RIGHT));

        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        setBackground(null);
        setUI(new MyPanelUI());

        setSize(new Dimension(500, 600));

        JPanel title = new JPanel();
        title.setLayout(new FlowLayout(FlowLayout.LEFT));
        JPanel bar = new JPanel();
        JPanel info = new JPanel();
        JPanel text = new JPanel();
        text.setLayout(new FlowLayout(FlowLayout.LEFT));
        JPanel des1 = new JPanel();
        JPanel des2 = new JPanel();
        des2.setLayout(new BoxLayout(des2, BoxLayout.Y_AXIS));
        JPanel attbtn = new JPanel();
        attbtn.setLayout(new FlowLayout(FlowLayout.LEFT));
        Font fnt01 = new Font("sans-serif", Font.PLAIN, 38);
        Font fnt02 = new Font("sans-serif", Font.PLAIN, 28);
        Font fnt03 = new Font("sans-serif", Font.PLAIN, 24);

        title.setBackground(null);
        title.setOpaque(false);
        bar.setBackground(null);
        bar.setOpaque(false);
        info.setBackground(null);
        info.setOpaque(false);
        text.setBackground(null);
        text.setOpaque(false);
        des1.setBackground(null);
        des1.setOpaque(false);
        des2.setBackground(null);
        des2.setOpaque(false);
        attbtn.setBackground(null);
        attbtn.setOpaque(false);

        JLabel empty01 = new JLabel("                         " +
                "                              ");
        JLabel empty02 = new JLabel("                       ");
        empty01.setFont(fnt02);
        JLabel empty03 = new JLabel("              ");

        JButton save = new JButton("Save");
        save.setFont(fnt02);
        JButton enter = new JButton();
        enter.setText("Enter");
        enter.setFont(fnt02);
        JButton reset = new JButton();
        reset.setText("Reset");
        reset.setFont(fnt02);
        JButton attachment = new JButton();
        attachment.setFont(fnt02);
        attachment.setText("Add Attachment...");
        JTextArea description = new JTextArea(5, 25);
        Border border = BorderFactory.createLineBorder(Color.BLACK, 2);
        description.setFont(fnt03);
        description.setBorder(border);
        description.setLineWrap(true);
        JTextField date = new JTextField();
        date.setText("MM/DD/YYYY ");
        date.setFont(fnt02);
        date.setBorder(border);
        JLabel award = new JLabel();
        award.setText("          Some Award");
        award.setFont(fnt01);

        JLabel status = new JLabel();
        status.setText("Status");
        status.setFont(fnt02);
        JLabel finish = new JLabel();
        finish.setText("         Finished on");
        finish.setFont(fnt02);
        JLabel desc = new JLabel();
        desc.setText("                  Add a Description_");
        desc.setFont(fnt02);

        JProgressBar pbar = new JProgressBar();
        pbar.setOrientation(JProgressBar.HORIZONTAL);
        pbar.setMinimum(0);
        pbar.setMaximum(100);
        pbar.setValue(60);
        pbar.setStringPainted(true);
        pbar.setPreferredSize(new Dimension(700, 40));
        pbar.setBorderPainted(true);
        pbar.setFont(fnt02);
        pbar.setForeground(Color.GREEN);
        pbar.setBackground(Color.WHITE);

        JComboBox cbox = new JComboBox();
        cbox.setFont(fnt02);
        cbox.addItem("Waiting");
        cbox.addItem("Inprogress");
        cbox.addItem("Finished");
        cbox.setBorder(border);

        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == reset){
                    description.setText("");
                }
            }
        });

        title.add(award);

        bar.add(pbar);
        info.add(status);
        info.add(cbox);
        info.add(finish);
        info.add(date);
        text.add(desc);
        des2.add(enter);
        des2.add(reset);
        des1.add(description);
        des1.add(empty03);
        des1.add(des2);
        attbtn.add(empty02);
        attbtn.add(attachment);
        attbtn.add(empty01);
        attbtn.add(save);

        add(title);

        add(bar);
        add(info);
        add(text);
        add(des1);
        add(attbtn);


    }

    public static class MyPanelUI extends PanelUI {
        public void update(Graphics g, JComponent c) {
            if (c.isOpaque()) {
                Graphics2D g2 = (Graphics2D) g;
                //ªÊ÷∆Ω•±‰
                g2.setPaint(new GradientPaint(
                        1000, 40, new Color(198, 198, 198),
                        c.getWidth(), c.getHeight(),
                        new Color(255, 255, 255)
                ));
                g2.fillRect(0, 0, c.getWidth(), c.getHeight());
            }
            paint(g, c);
        }
    }

}

