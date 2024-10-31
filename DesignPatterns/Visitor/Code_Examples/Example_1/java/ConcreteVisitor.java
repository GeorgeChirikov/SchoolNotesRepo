import org.example.Visitor;

public class ConcreteVisitor implements Visitor {

    @Override
    public void visit1(Element element) {
        System.out.println("ConcreteVisitor visited " + element.getClass().getSimpleName());
    }
}
