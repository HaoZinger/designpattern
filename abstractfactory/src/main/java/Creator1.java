/**
 *
 *
 * @author Haozhigang
 *
 *  2019年03月08日19:56
 *
 */
public class Creator1 extends AbstractCreator{
    @Override
    public ProductA1 createProductA() {
        return new ProductA1();
    }

    @Override
    public ProductB1 createProductB() {
        return new ProductB1();
    }

}
