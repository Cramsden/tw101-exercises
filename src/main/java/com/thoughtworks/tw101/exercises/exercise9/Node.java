package com.thoughtworks.tw101.exercises.exercise9;

import java.util.ArrayList;
import java.util.List;

public class Node {
    private String name;
    private Node right;
    private Node left;

    public Node(String name) {

        this.name = name;
        right = null;
        left = null;
    }

    public void add(String nameOfNewNode) {
        int compare = name.compareTo(nameOfNewNode);

        if (name == nameOfNewNode) {
            return;
        }
        else if (compare > 0) {
            if (left == null){
                left = new Node(nameOfNewNode);
            }else{
                left.add(nameOfNewNode);
            }
        }
        else if (compare < 0) {
            if (right == null) {
                right = new Node(nameOfNewNode);
            }else {
                right.add(nameOfNewNode);
            }

        }
    }

    public List<String> names() {
        List<String> names = new ArrayList<>();

        if(left == null) {

            names.add(name);

            if(right != null) {
                names.addAll(right.names());
            }
        }
        else if (right == null) {

            if (left != null) {
                names.addAll(left.names());
            }

            names.add(name);
        }
        else {
            names.addAll(left.names());
            names.add(name);
            names.addAll(right.names());
        }



        return names;
    }
}
