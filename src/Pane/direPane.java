package Pane;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import java.awt.*;

/**
 * Created by Kevin on 2015/8/8.
 */
public class direPane extends JPanel {
    public direPane(){
        setSize(new Dimension(500, 600));
        IconNode top=new IconNode(new ImageIcon("C:\\Users\\Kevin\\Pictures\\Project\\2.0\\Logo\\badges\\ChiefScouts\\ChiefScoutsAward.png"),"Chief Scouts Award");

        IconNode root1=new IconNode(new ImageIcon("C:\\Users\\Kevin\\Pictures\\Project\\2.0\\Logo\\badges\\ChiefScouts\\VoyageurScoutAward.png"),"VoyaguerAward");
        IconNode root2=new IconNode(new ImageIcon("C:\\Users\\Kevin\\Pictures\\Project\\2.0\\Logo\\badges\\ChiefScouts\\PathfinderScoutAward.png"),"PathfinderAward");

        root1.add(new IconNode(new ImageIcon("C:\\Users\\Kevin\\Pictures\\Project\\2.0\\Logo\\badges\\Pathfinder\\Pathfinder_Citizenship.png"),"Pathfinder_Citizenship"));
        root1.add(new IconNode(new ImageIcon("C:\\Users\\Kevin\\Pictures\\Project\\2.0\\Logo\\badges\\Pathfinder\\Pathfinder_OutdoorSkills.png"), "Pathfinder_OutdoorSkills"));
        root1.add(new IconNode(new ImageIcon("C:\\Users\\Kevin\\Pictures\\Project\\2.0\\Logo\\badges\\Pathfinder\\Pathfinder_Citizenship.png"),"Pathfinder_Citizenship"));
        root1.add(new IconNode(new ImageIcon("C:\\Users\\Kevin\\Pictures\\Project\\2.0\\Logo\\badges\\Pathfinder\\Pathfinder_PersonalDevelopment.png"), "Pathfinder_PersonalDevelopment"));

        root2.add(new IconNode(new ImageIcon("C:\\Users\\Kevin\\Pictures\\Project\\2.0\\Logo\\badges\\Voyageur\\Voyageur_Citizenship.png"),"Voyageur_Citizenship"));
        root2.add(new IconNode(new ImageIcon("C:\\Users\\Kevin\\Pictures\\Project\\2.0\\Logo\\badges\\Voyageur\\Voyageur_Leadership.png"),"Voyageur_Leadership"));
        root2.add(new IconNode(new ImageIcon("C:\\Users\\Kevin\\Pictures\\Project\\2.0\\Logo\\badges\\Voyageur\\Voyageur_OurdoorSkill.png"),"Voyageur_OurdoorSkill"));
        root2.add(new IconNode(new ImageIcon("C:\\Users\\Kevin\\Pictures\\Project\\2.0\\Logo\\badges\\Voyageur\\Voyageur_PersonalDevelopment.png"),"Voyageur_PersonalDevelopment"));

        IconNode Root=new IconNode(null,null);//������ڵ�
        top.add(root1);
        top.add(root2);
        Root.add(top);//��������ڵ�
        JTree tree = new JTree(Root);//������
        tree.expandRow(1);
        tree.setCellRenderer(new IconNodeRenderer()); //���õ�Ԫ������

        this.add(tree);
    }
}
