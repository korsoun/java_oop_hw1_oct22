abstract class AbstractPerson {
    Boolean isAliwe;
    String nameSurname;
    int age;
    int money;

    public String getName(AbstractPerson person) {
        return person.nameSurname;
    }

    public String getName() {
        return this.nameSurname;
    }

    public int getAge(AbstractPerson person) {
        return person.age;
    }

    public int getAge() {
        return this.age;
    }

    public int getFinCondition(AbstractPerson person) {
        return person.money;
    }

    public int getFinCondition() {
        return this.money;
    }

    public Boolean getLiveCondition (AbstractPerson person) {
        return person.isAliwe;
    }

    public Boolean getLiveCondition() {
        return this.isAliwe;
    }

    public String info() {
        if(this.isAliwe) {
            return "Имя, фамилия: " + this.getName() + ", возраст: " + this.getAge() + ", богатство: " + this.getFinCondition() + ".";
        }
        else {
            return "К сожалению, " + this.getName() + " умер.";
        }
    }

    public void grow() {
        if(this.isAliwe == true) {
            this.age++;
        } else {
            System.out.printf("%s умер. Оставьте его в покое.", this.nameSurname);
        }
    } 

    public void death() {
        this.isAliwe = false;
    }
}
