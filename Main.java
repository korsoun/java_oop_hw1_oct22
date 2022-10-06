public class Main {
    public static void main(String[] args) {
        Person Oleg = new Person("Олег Какашкин", 15, 46000);
        Oleg.grow();
        System.out.println(Oleg.info());
        Person Akakiy = new Person("Акакий Акопян", 15, 46000);
        System.out.println(Akakiy.info());
        Akakiy.death();
        System.out.println(Akakiy.info()); 
        Akakiy.grow();    
    }
}