package Pane;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Kevin on 2015/8/6.
 */
public class main {
    public static void main(String args[]){

        JFrame fr = new JFrame("Award");
        infoPane pan = new infoPane();
        JPanel pn = new JPanel();
        pn.setLayout(null);
        JScrollPane sp=new JScrollPane(pan, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        sp.setBounds(0,0,1012, 601);
        JScrollBar Bar = sp.getVerticalScrollBar();
        Bar.setUnitIncrement(40);
        pn.add(sp);


        direPane dirpane = new direPane();
        JPanel pnLeft = new JPanel();
        pnLeft.setLayout(null);
        JScrollPane sp2 = new JScrollPane(dirpane, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
        JScrollBar Bar2 = sp2.getVerticalScrollBar();
        Bar2.setUnitIncrement(40);
        sp2.setBounds(0, 0, 355, 600);
        sp2.setBackground(Color.BLACK);
        pnLeft.add(sp2);

        Container cont = fr.getContentPane();
        JSplitPane leftRightSplit = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, pnLeft, pn);
        leftRightSplit.setDividerLocation(340);
        JSplitPane upDownSplit = new JSplitPane(JSplitPane.VERTICAL_SPLIT, new JLabel("UP"), leftRightSplit);
        upDownSplit.setDividerLocation(90);
        leftRightSplit.setOneTouchExpandable(true);
        cont.add(upDownSplit);


        String lookAndFeel = UIManager.getSystemLookAndFeelClassName();
        try {
            UIManager.setLookAndFeel(lookAndFeel);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }

        fr.setExtendedState(JFrame.MAXIMIZED_BOTH);
        fr.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        fr.setVisible(true);
    }
}
