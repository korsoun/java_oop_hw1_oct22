import java.util.*;

public class Person extends AbstractPerson {
    
    private Person dad;
    private Person mom;
    ArrayList<Person> childrens = new ArrayList<Person>();

    public Person(String nameSurn, int ag, int mon, Person dad, Person mom) {
        isAliwe = true;
        nameSurname = nameSurn;
        age = ag;
        money = mon;
        this.dad = dad;
        this.mom = mom;
    }

    public Person(String nameSurn, Person dad, Person mom) {
        isAliwe = true;
        nameSurname = nameSurn;
        age = 0;
        money = 0;
        this.dad = dad;
        this.mom = mom;
    }

    public Person(String nameSurn, int ag, int mon) {
        isAliwe = true;
        nameSurname = nameSurn;
        age = ag;
        money = mon;
    }
    
    public Person(String nameSurn) {
        isAliwe = true;
        nameSurname = nameSurn;
        age = 0;
        money = 0;
    }

    public void showDad (Person son) {
        if(son.dad != null) {
            son.dad.info();
        } else {
            System.out.printf("%s начинает дерево. Посмотреть его предков невозможно.", son.nameSurname);
        }
    }

    public void showDad () {
        if(this.dad != null) {
            this.dad.info();
        } else {
            System.out.printf("%s начинает дерево. Посмотреть его предков невозможно.", this.nameSurname);
        }
    }

    public void showMom (Person son) {
        if(son.mom != null) {
            son.mom.info();
        } else {
            System.out.printf("%s начинает дерево. Посмотреть его предков невозможно.\n", son.nameSurname);
        }
    }

    public void showMom () {
        if(this.mom != null) {
            this.mom.info();
        } else {
            System.out.printf("%s начинает дерево. Посмотреть его предков невозможно.\n", this.nameSurname);
        }
    }

    public void showChildrens() {
        if(this.childrens.size() != 0) {
            for(Integer i = 0; i < this.childrens.size(); i++) {
                System.out.println("  " + this.childrens.get(i).info());
            }
        } else {
            System.out.printf("%s не имеет детей.", this.getName());
        }
    }

    public void showChildrens(Person parent) {
        if(parent.childrens.size() != 0) {
            for(Integer i = 0; i < parent.childrens.size(); i++) {
                System.out.println("  " + parent.childrens.get(i).info());
            }
        } else {
            System.out.printf("%s не имеет детей.", parent.getName());
        }
    }
    
}
