package model;

import java.io.*;

/**
 * Created by Kitcatski on 11/2/2016.
 */
public class PeopleBag implements Serializable {
    int nElms;
    Person[] people;

    public PeopleBag() {
        nElms = 0;
        this.people = new Person[10];
    }

    public void writeFile() {
        try {
            FileOutputStream fos = new FileOutputStream("out.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this);
            oos.flush();

        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    public void add(Person p) {
        people[nElms] = p;
        nElms++;
    }
    public PeopleBag loadFile(){
        try {
            FileInputStream fis = new FileInputStream("out.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            return (PeopleBag) ois.readObject();

        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
    public void display(){
        for(int i=0;i<nElms;i++){
            System.out.println(people[i]);
        }
    }
}
