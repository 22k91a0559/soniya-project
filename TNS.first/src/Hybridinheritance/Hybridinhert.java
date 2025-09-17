package Hybridinheritance;
public class Hybridinhert {
    public static void main(String[] args) {
        Daughter d = new Daughter();
        d.showDaughter();
        d.showMother();
        d.showGrandMother();

        Son s = new Son();
        s.showSon();
        s.showMother();
        s.showGrandMother();
    }
}