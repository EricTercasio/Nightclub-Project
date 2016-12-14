package model;

/**
 * Created by Kitcatski on 11/2/2016.
 */
public class Demo {
    public static void main(String[] args){
        PeopleBag pb = new PeopleBag();
//        Schedule s1 = new Schedule("1","1","1","1","1","1","1");
//        Owner o1 = new Owner("Eric","Tercasio","Kitcatski","password1234",new HomeAddress("54 Magnolia drive", "Rocky Point","New York","11778"),"631-512-9104","","100k",s1);
//        Manager m1 = new Manager("Dennis","Ak","TheAkinator","password",new HomeAddress("5 The road", "Rocky Point","New York","11778"),"631-222-9404","","50k",s1);
//        pb.add(o1);
//        pb.add(m1);
//        pb.writeFile();
//
////        pb = pb.loadFile();
////        System.out.println(((Customer)pb.findByUsername("DennisIsFat")).getReceipt().getTotal());
////


//
//        pb.display();



        //Customer customer = new Customer("1","2","3","3",new HomeAddress("1","2","2","3"),"2","2");
        //System.out.println(customer.getIdNumber());


        /*System.out.println(pb.findByID("0"));
        System.out.println(pb.findByUsername("Kitcatski"));
        System.out.println(pb.findByID("1"));
        System.out.println(pb.findByUsername("TheAkinator"));
*/
        //System.out.println(pb.findByID("1").getFirstName());
        //System.out.println(pb.findByID("2").getFirstName());
        /* How to instaceOf
        Person o2 = pb.findByID("1");
        if(o2 instanceof Owner) {
            Owner o = (Owner)o2;
            System.out.println(o.getPosition());
        }
        */
        //pb.display();

    }
}
