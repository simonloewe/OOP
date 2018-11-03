/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.hslu.oop.sw11a01;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author lion
 */
public class TextFileWriter {

    String filePath = "/Users/lion/Desktop/WriteInt.txt";

    int number;
    String letters;

    public void write(int number, String letters) {

        this.number = number;
        this.letters = letters;

        try {
            FileOutputStream fos = new FileOutputStream(filePath);

            DataOutputStream dos = new DataOutputStream(fos);

            dos.writeDouble(100);
            dos.writeBytes(letters);

            fos.close();
            dos.close();

        } catch (IOException e) {
            System.out.println("IOException : " + e);
        }

    }

    public void read() {
        try {
            FileInputStream ios = new FileInputStream(filePath);

            DataInputStream dis = new DataInputStream(ios);

            dis.read();

            System.out.println(dis.readDouble());

            dis.close();

        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
    }

}
