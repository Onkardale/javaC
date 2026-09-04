package NUMBERS;

public class Inheritance {
    public static void main(String[] args) {
        System.out.println(97*48);
        Changdeo n = new Changdeo();
        n.deva();
        n.Krushna();
    }

}

 abstract  class NanaBhau{ // we can't create object those class because they use abstract keyword

    void Krushna(){
        System.out.println("Krushna Java master");
    }
}
class Changdeo extends NanaBhau{
    void deva(){
        System.out.println("Chemistry Master");
    }
}