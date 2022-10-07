public class Main {
    public static void main(String[] args) {
        Person Adam = new Person("Адам Иванов", 87, 50000);
        Person Eva = new Person("Ева Иванова", 86, 50000);
        Person Mikhail = new Person("Михаил Иванов", 51, 50000, Adam, Eva);
        Relations.addChild(Adam, Mikhail);
        Relations.addChild(Eva, Mikhail);
        Person Kristina = new Person("Кристина Петрова", 53, 50000);
        Person Alina = new Person("Алина Иванова", 28, 50000, Mikhail, Kristina);
        Person Viktor = new Person("Виктор Иванов", 28, 50000, Mikhail, Kristina);
        Relations.addChild(Mikhail, Alina);
        Relations.addChild(Mikhail, Viktor);
        Relations.addChild(Kristina, Alina);
        Relations.addChild(Kristina, Viktor);
        Person Kirill = new Person("Кирилл Сергеев", 56, 50000);
        Person Olga = new Person("Ольга Дмитриева", 54, 50000);
        Person Viktoriya = new Person("Виктория Сергеева", 25, 50000, Kirill, Olga);
        Relations.addChild(Kirill, Viktoriya);
        Relations.addChild(Olga, Viktoriya);
        Person Maksim = new Person("Максим Иванов", 7, 9, Viktor, Viktoriya);
        Relations.addChild(Viktor, Maksim);
        Relations.addChild(Viktoriya, Maksim);
        Relations.showChildrens(Mikhail);
        Relations.showChildrens(Kristina);
        Relations.showDad(Mikhail);
        Relations.showMom(Viktoriya);

        Maksim.makeMoney();
        Relations.showChildrens(Viktor);
        Relations.showGrandchilds(Mikhail);
        Relations.showGrandparents(Maksim);

        Maksim.askMoney(Viktor, 200);
        Viktor.askMoney(Mikhail, 2000);
        Viktor.makeMoney();
    }
}