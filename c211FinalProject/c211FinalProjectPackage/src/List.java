/*
/ Contributor: Amber Baker
/ Date: 12/2/2024
/ Class: C211 Final Project
/ Description: List Object will hold nodes (games) and allow for insertion and removal of nodes. 
/
 */
package com.c211docoolstuff.c211finalproject2; 

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class List {

    Node head;
    int length;
    static List gamesLibrary = new List(); 
    
    // default constructor
    public List() {
        this.head = null;
    } // close default constructor

    // non-default constructor
    public List(Node head) {
        this.head = head;
    } // close non-default constructor

    // case 1
    public String displayGameDetails(Node temp) {
        // will display all nodes stored in the list
        String output = temp.game.toString();
        return output; 
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
    public Node rentGame(Node temp) {

        temp.game.setNumRented(temp.game.getNumRented() + 1);
        temp.game.setNumAvail(temp.game.getNumAvail() - 1);
        return temp;
    } // close rentGame

    // case 4
    public Node returnGame(Node temp) {
        temp.game.setNumRented(temp.game.getNumRented() - 1);
        temp.game.setNumAvail(temp.game.getNumAvail() + 1);
        return temp;
    } // close returnGame

    public void addNode(Node n) {
        Node temp = head;
        if (temp == null) {
            head = n;
        } else {
            while (temp != null) {
                temp = temp.next;
            }
            temp = n;

        }
    }

    public void gameFiles() {
        Node temp = head;
        Filewriter writer = new Filewriter("gameData");
        while (temp != null) {
            writer.write(gamesLibrary.displayGameDetails(temp));
            writer.write("\n");
            temp = temp.next;
        }
    }
    
    public void writeLibrary() {
        //creating game objects 
        ImageObject inquisitionImage = new ImageObject("\"C:\\Users\\AMBER\\Documents\\C211DoCoolStuff\\C211DoCoolStuff\\c211FinalProject\\src\\main\\java\\com\\c211docoolstuff\\c211finalproject\\photos\\inquisition.jpg\"");
        Game inquisition = new Game("Dragon Age: Inquisition", "Action role-playing", "XBOX, Playstation, Windows",
                2014, 5, 0, 5.00, inquisitionImage);
        Node inq = new Node(inquisition);
        gamesLibrary.addNode(inq);
        
        gamesLibrary.gameFiles();
    }

} // close class
