package Pane;

/**
 * Created by Kevin on 2015/8/10.
 */

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import java.awt.*;

public class IconNodeRenderer extends DefaultTreeCellRenderer {
    //��д�÷���
    public Component getTreeCellRendererComponent(JTree tree, Object
            value,boolean sel,boolean expanded, boolean leaf, int row,boolean hasFocus)
    {
        super.getTreeCellRendererComponent(tree, value, sel, expanded,
                leaf,row, hasFocus); //���ø���ĸ÷���
        Icon icon = ((IconNode) value).getIcon();//�ӽڵ��ȡͼƬ
        String txt=((IconNode) value).getText(); //�ӽڵ��ȡ�ı�
        setIcon(icon);//����ͼƬ
        setText(txt);//�����ı�
        return this;
    }
}

//����ڵ���
class IconNode extends DefaultMutableTreeNode
{
    protected Icon icon;
    protected String txt;
    //ֻ�����ı��Ľڵ㹹��
    public IconNode(String txt)
    {
        super();
        this.txt=txt;
    }
    //�����ı���ͼƬ�Ľڵ㹹��
    public IconNode(Icon icon,String txt)
    {
        super();
        this.icon = icon;
        this.txt = txt;
    }
    public void setIcon(Icon icon)
    {
        this.icon = icon;
    }
    public Icon getIcon()
    {
        return icon;
    }
    public void setText(String txt)
    {
        this.txt=txt;
    }
    public String getText()
    {
        return txt;
    }
}