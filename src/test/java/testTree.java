import org.junit.Test;

public class testTree {
    @Test
    public void testHeightMoreThan4(){

        tree newtree = new tree(5);
        newtree.growAtree();

    }

    @Test
    public void testHightLessThan4(){
        tree newtree = new tree(3);
        newtree.growAtree();
    }
}
