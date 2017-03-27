/**
 * Created by jetbrains on 27/03/17.
 */
public class RombTest {    public static void main(String[] args) {
    Obedatel myObedatel = new Obedatel();
    myObedatel.drink();
    myObedatel.eat();

}

}

interface Eating{
    void eat();
}
class Drinker{
    void drink(){
        System.out.println("bulk-bulk");
    }
}

class Eater implements Eating{
    public void eat(){
        System.out.println("nuam-nyam");
    }
}


class Obedatel extends Drinker implements Eating {

    @Override
    public void eat() {
        System.out.println("ochen vkussno");

    }

}