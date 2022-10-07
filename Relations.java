public class Relations {
    
    public static void addChild(Person parent, Person child) {
        parent.childrens.add(child);
    }

    public static void showDad(Person child) {
        if(child.getDad() != null) {
            System.out.println(child.getName() + ": отец " + child.getDad().getName());
        } else {
            System.out.println(child.getName() + ": поле отца не заполнено");
        }
    }

    public static void showMom(Person child) {
        if(child.getMom() != null) {
            System.out.println(child.getName() + ": мать " + child.getMom().getName());
        } else {
            System.out.println(child.getName() + ": поле матери не заполнено");
        }
    }

    public static void showChildrens(Person parent) {
        if(parent.getChildrens().size() > 0) {
            System.out.print(parent.getName() + " дети: ");
            for(int i = 0; i < parent.getChildrens().size(); i++) {
                System.out.print(parent.getChildrens().get(i).getName() + "  ");
            }
            System.out.println();
        }
    }

    public static void showGrandchilds(Person grand) {
        System.out.print(grand.getName() + ": внуки - ");
        if(grand.getChildrens().size() > 0) {
            for(int i = 0; i < grand.getChildrens().size(); i++) {
                if(grand.getChildrens().get(i).getChildrens().size() > 0) {
                    for(int j = 0; j < grand.getChildrens().get(i).getChildrens().size(); j++) {
                        System.out.print(grand.getChildrens().get(i).getChildrens().get(j).getName() + "  ");
                    }
                }
            }
        }
        System.out.println();
    }

    public static void showGrandparents(Person grand) {
        System.out.print(grand.getName() + ": дедушки и бабушки - ");
        if(grand.getDad() != null) {
            if(grand.getDad().getDad() != null) {
                System.out.print(grand.getDad().getDad().getName() + "  ");
            }
            if(grand.getDad().getMom() != null) {
                System.out.print(grand.getDad().getMom().getName() + "  ");
            }
        }
        if(grand.getMom() != null) {
            if(grand.getMom().getDad() != null) {
                System.out.print(grand.getMom().getDad().getName() + "  ");
            }
            if(grand.getMom().getMom() != null) {
                System.out.print(grand.getMom().getMom().getName() + "  ");
            }
        }       
        System.out.println();
    }
}
