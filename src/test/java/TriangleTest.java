import com.tradeshift.triangle.Triangle;
import com.tradeshift.triangle.TriangleException;
import com.tradeshift.triangle.TriangleType;
import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

    @Test(expected = TriangleException.class)
    public void Triangle_ConstructorNegativeASide_ShouldReturnTriangleException() {
        Triangle triangle = new Triangle(-4,4,4);
    }

    @Test(expected = TriangleException.class)
    public void Triangle_ConstructorNegativeBSide_ShouldReturnTriangleException() {
        Triangle triangle = new Triangle(4,-4,4);
    }

    @Test(expected = TriangleException.class)
    public void Triangle_ConstructorNegativeCSide_ShouldReturnTriangleException() {
        Triangle triangle = new Triangle(4,4,-4);
    }

    @Test
    public void Triangle_AllSidesTheSame_ShouldReturnTriangleTypeEquilaterial() {
        Triangle triangle = new Triangle(4,4,4);
        TriangleType type = triangle.getType();
        Assert.assertEquals(TriangleType.EQUILATERAL, type);
    }

    @Test
    public void Triangle_TwoSidesTheSame_ShouldReturnTriangleTypeIsoceles() {
        Triangle triangle = new Triangle(4,4,3);
        TriangleType type = triangle.getType();
        Assert.assertEquals(TriangleType.ISOSCELES, type);
    }

    @Test
    public void Triangle_AllSidesDifferent_ShouldReturnTriangleTypeScalene() {
        Triangle triangle = new Triangle(1,2,3);
        TriangleType type = triangle.getType();
        Assert.assertEquals(TriangleType.SCALENE, type);
    }
}
