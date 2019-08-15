/**
 *
 *
 * @author Haozhigang
 *
 *  2019年03月08日20:38
 *
 */
public class Creator2 extends AbstractCreator {
    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
