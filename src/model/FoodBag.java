package model;

import java.io.Serializable;

/**
 * Created by Kitcatski on 11/29/2016.
 */
public class FoodBag implements Serializable {
    int nElms;
    Food[] food;

    public FoodBag() {
        nElms = 0;
        this.food = new Food[100];
    }

    public void add(Food f) {
        food[nElms] = f;
        nElms++;
    }

    public boolean delete(Food value) {
        int j;
        for (j = 0; j < nElms; j++) {
            if (food[j] == value) {
                break;
            }
        }

        if (j == nElms) {
            return false;
        } else {
            for (int k = j; k < nElms - 1; k++) {
                food[k] = food[k + 1];

            }
            nElms--;
            return true;
        }
    }

    public Food findByNameOfFood(String nameOfFood) {
        int i;
        for (i = 0; i < nElms; i++) {
            if (food[i].getName() == (nameOfFood))
                return food[i];
        }
        return null;
    }
    public int getNElms(){
        return nElms;
    }
    public void display(){
        for(int i=0;i<nElms;i++){
            System.out.println(food[i]);
        }
}

}
