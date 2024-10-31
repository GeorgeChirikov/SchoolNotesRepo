public class ConcreteElementA implements Element {

    public void accept(Visitor visitor) {
        visitor.visit1(this);
    }
}
