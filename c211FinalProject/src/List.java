/*
/ Contributor: Amber Baker
/ Date: 12/2/2024
/ Class: C211 Final Project
/ Description: List Object will hold nodes (games) and allow for insertion and removal of nodes. 
/
 */
package com.c211docoolstuff.c211finalproject;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class List {

    Node head;
    int length;

    // default constructor
    public List() {
        this.head = null;
    } // close default constructor

    // non-default constructor
    public List(Node head) {
        this.head = head;
    } // close non-default constructor

    // case 1
    

    public void displayGameDetails(Node temp) {
        // will display all nodes stored in the list
        temp.game.toString();
    } // close displayGames

    // case 2 
    public Node searchGames(String title) {
        // will traverse the list and return the referenced game object if found
        Node temp = head;
        Node found = null;

        while (temp != null) {
            if (temp.game.getTitle().equals(title)) {
                found = temp;
                break;
            }
            temp = temp.next;
        } // close while 
        return found;
    } // close searchGames

    // case 3 
    public Node rentGame(String title) {
        Node temp = searchGames(title);

        if (temp == null) {
            return null;
        } else {
            temp.game.setNumRented(temp.game.getNumRented() + 1);
        }
        temp.game.setNumAvail(temp.game.getNumAvail() - 1);
        return null;
    } // close rentGame

    // case 4
    public Node returnGame(String title) {
        Node temp = searchGames(title);
        temp.game.setNumRented(temp.game.getNumRented() - 1);
        temp.game.setNumAvail(temp.game.getNumAvail() + 1);
        return null;
    } // close returnGame

    public void write(Node newNode) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("games.txt"));
            writer.write(newNode.toString());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void addNode(Node n) {
        Node temp = head;
        if (temp == null) {
            head = n;
        } else {
            while (temp != null) {
                temp = temp.next;
            }
        }
        temp = n;
        write(n);

    }

} // close class
