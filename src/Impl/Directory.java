package Impl;

import Interface.INode;

import java.util.ArrayList;
import java.util.List;

public class Directory extends INode {
    String name;
    List<INode> children;

    public Directory(String name) {
        this.name = name;
        children = new ArrayList<>();
    }

    public void addDirectoryOrFile(INode child) {
        children.add(child);
    }

    @Override
    public void ls() {
        System.out.println("Opening Directory --> " + name);
        for(INode child : children) {
            child.ls();
        }
    }
}
