package model;

import java.io.Serializable;

/**
 * Created by Kitcatski on 11/29/2016.
 */
public class TableBag implements Serializable{
    int nElms;
    Table[] table;
    public TableBag(){
        nElms = 0;
        this.table = new Table[100];
    }
    public void add(Table t) {
        table[nElms] = t;
        nElms++;
    }
    public boolean delete(Table value) {
        int j;
        for (j = 0; j < nElms; j++) {
            if (table[j] == value) {
                break;
            }
        }

        if (j == nElms) {
            return false;
        } else {
            for (int k = j; k < nElms - 1; k++) {
                table[k] = table[k + 1];

            }
            nElms--;
            return true;
        }
    }
    public Table findByTableNumber(int tableNumber){
        int i;
        for(i = 0; i<nElms; i++){
            if(table[i].getTableNumber() == (tableNumber))
                return table[i];
        }
        return null;
    }
    public int getNElms(){
        return nElms;
    }
    public void display() {
        for (int i = 0; i < nElms; i++) {
            System.out.println(table[i]);
        }
    }
    public Table[] getTable(){
        return table;
    }

    public void deleteAllTables() {
        table = new Table[100];
        nElms = 0;
    }
}


