package model;

/**
 * Created by Kitcatski on 11/2/2016.
 */
public class Demo {
    public static void main(String[] args){
        Schedule s1 = new Schedule("1","1","1","1","1","1","1");
        Manager m1 = new Manager("Eric","Tercasio","Lovage","password1234",1,new HomeAddress("54 Magnolia drive", "Rocky Point","New York","11778"),"631-512-9104","Manager","50k",s1);
        //System.out.println(m1.toString());
        //System.out.println(m1.getPassword());
        PeopleBag pb = new PeopleBag();
        pb.add(m1);
        pb.writeFile();
        pb = pb.loadFile();
        pb.display();

    }
}
