import java.util.*;

public class Person extends AbstractPerson implements Adult, Child{
    
    private Person dad;
    private Person mom;
    ArrayList<Person> childrens = new ArrayList<Person>();

    // С 10-й по 40-ю строки конструкторы.
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

    // С 43-й по 53-ю строки геттеры для родителей и детей.
    public Person getMom() {
        return this.mom;
    }

    public Person getDad() { 
        return this.dad;
    }

    public ArrayList<Person> getChildrens() {
        return this.childrens;
    }

    // Реализация методов, импортированных из интерфейсов.
    @Override
    public void makeMoney() {
        if(this.getLiveCondition()) {
            if(this.age > 18) {
                this.money += 100;
                System.out.println(this.getName() + " поработал. Денег: " + this.getFinCondition());
            } else {
                System.out.println(this.nameSurname + ": ошибка заработка. Ребенку не предложат трудовой договор.");
            }
        } else {
            System.out.println(this.nameSurname + ": ошибка заработка. Статус - умер.");
        }
    }

    @Override
    public void askMoney(Person parent, int sum) {
        if(this.getLiveCondition()) {
            if(this.getAge() < 18) {
                if(parent.getFinCondition() > sum) {
                    parent.setFinCondition(parent.getFinCondition() - sum);
                    this.setFinCondition(this.getFinCondition() + sum);
                    System.out.println(this.getName() + " просит денег у " + parent.getName() + ". Теперь денег у них соответственно " + this.getFinCondition() + " и " + parent.getFinCondition());
                } else {
                    System.out.println(this.getName() + " просит денег у " + parent.getName() + ". Отказ, нет таких денег.");
                }
            }
            if(this.getAge() >= 18 && this.getAge() < 23) {
                if(parent.getFinCondition() > sum) {
                    parent.setFinCondition(parent.getFinCondition() - sum/2);
                    this.setFinCondition(this.getFinCondition() + sum/2);
                    System.out.println(this.getName() + " просит денег у " + parent.getName() + ". Окей, но дитятко большое, пусть немножко подзаработает само. Теперь денег у них соответственно " + this.getFinCondition() + " и " + parent.getFinCondition());
                } else {
                    System.out.println(this.getName() + " просит денег у " + parent.getName() + ". Отказ, нет таких денег. Можно, кстати, подзаработать самостоятельно.");
                }
            }
            if(this.getAge() >= 23) {
                System.out.println(this.getName() + " просит денег у " + parent.getName() + ". Отказ. Пора зарабатывать самостоятельно.");
            }
            
        } else {
            System.out.println(this.getName() + ": ошибка коммуникации. Потусторонние голоса.");
        }
    }
    
}
