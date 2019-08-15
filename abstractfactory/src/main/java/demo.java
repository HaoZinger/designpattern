/**
 *
 *
 * @author Haozhigang
 *
 *  2019年03月08日20:40
 *
 */
public class demo {
    public static void main(String[] args) {
        AbstractCreator creator1 = new Creator1();
        AbstractCreator creator2 = new Creator2();
        AbstractProductA a1 = creator1.createProductA();
        AbstractProductA a2 = creator2.createProductA();
        AbstractProductB b1 = creator1.createProductB();
        AbstractProductB b2 = creator2.createProductB();
        a1.shareMethod();
        a2.shareMethod();
        a1.ownMethod();
        a2.ownMethod();
        b1.shareMethod();
        b2.shareMethod();
        b1.ownMethod();
        b2.ownMethod();
    }
}
