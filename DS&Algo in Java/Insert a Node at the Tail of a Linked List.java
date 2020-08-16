//In this we have to return only head and also do not use stdout/console

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;

        public SinglyLinkedList() {
            this.head = null;
        }
      
    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }

    // Complete the insertNodeAtTail function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
     // ***********************************************Start***********************************************************//
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data){
        

        SinglyLinkedListNode toadd = new SinglyLinkedListNode(data);

       SinglyLinkedListNode temp = head;
        if(temp == null)
        {
           head = toadd;
           return head;
        }
        
        while(temp.next!=null)
        {
            temp = temp.next;
        }
        temp.next = toadd;
        
        return head;

    }
    //*********************************************END**************************************************************//
    private static final Scanner scanner = new Scanner(System.in);
