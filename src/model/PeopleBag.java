package model;

import java.io.*;

/**
 * Created by Kitcatski on 11/2/2016.
 */

/** Note to self Eric
 *  When you use a load and save method in a bag, when you make a new method within the bag you must make a new save file
 *  or its not going to work. The save method saves the whole class, not just the array.
 */
public class PeopleBag implements Serializable {
    int nElms;
    Person[] people;

    public PeopleBag() {
        nElms = 0;
        this.people = new Person[500];
    }

    public void writeFile() {
        try {
            FileOutputStream fos = new FileOutputStream("out.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this);
            oos.writeInt(Person.getIdInt());
            oos.flush();

        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    public void add(Person p) {
        people[nElms] = p;
        nElms++;
    }
    public boolean delete(Person value) {
        int j;
        for (j = 0; j < nElms; j++) {
            if (people[j] == value) {
                break;
            }
        }

        if (j == nElms) {
            return false;
        } else {
            for (int k = j; k < nElms - 1; k++) {
                people[k] = people[k + 1];

            }
            nElms--;
            return true;
        }
    }
    public PeopleBag loadFile(){
        try {
            FileInputStream fis = new FileInputStream("out.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            PeopleBag pb = (PeopleBag) ois.readObject();
            Person.setIdInt(ois.readInt());
            return pb;


        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }
    public Person findByID(String id){
        int i;
        for(i = 0; i<nElms; i++){
            if(people[i].getIdNumber().equals(id)) return people[i];

        }
        return null;
    }
    public Person findByUsername(String username){
        int i;
        for(i = 0; i<nElms; i++){
            if(people[i].getUsername().equals(username)) return people[i];
        }
        return null;
    }
    public Person findByPassword(String password){
        int i;
        for(i = 0; i<nElms; i++){
            if(people[i].getPassword().equals(password)) return people[i];
        }
        return null;
    }
    public Person[] getPeople(){
        return people;
    }
    public int getNElms(){
        return nElms;
    }
    public void display(){
        for(int i=0;i<nElms;i++){
            System.out.println(people[i]);
        }
    }
}
