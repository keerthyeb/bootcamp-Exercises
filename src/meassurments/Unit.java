package meassurments;

import java.math.BigDecimal;

public class Unit {
    public static final Unit FEET = new Unit(new BigDecimal(25));
    public static final Unit INCH = new Unit(new BigDecimal(25 * 12));
    public static final Unit CENTIMETER = new Unit(new BigDecimal(10));
    public static final Unit MILLIMETER = new Unit(new BigDecimal(1));
    private BigDecimal ratio;


    private Unit(BigDecimal ratio) {
        this.ratio = ratio;
    }

    public BigDecimal convertToBaseUnitValue(BigDecimal value) {
        return this.ratio.multiply(value);
    }
}
