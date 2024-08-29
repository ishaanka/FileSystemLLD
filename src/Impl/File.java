package Impl;

import Interface.INode;

public class File extends INode {
    String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void ls() {
        System.out.println("Opening File --> " + fileName);
    }
}
