package com.calix.code.widget;

import javax.swing.tree.DefaultMutableTreeNode;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by calix on 16-10-26
 */
public class FileNode extends DefaultMutableTreeNode {

    public FileNode(String name) {
        super(name);
        setName(name);
    }

    private String name;

    private List<FileNode> children = new ArrayList<FileNode>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<FileNode> getChildren() {
        return children;
    }

    public void setChildren(List<FileNode> children) {
        this.children = children;
    }

    public boolean hasChildren() {
        return children.size() > 0;
    }



    @Override
    public String toString() {
        return getName();
    }
}
