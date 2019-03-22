package meassurments;

import java.math.BigDecimal;

public class Unit {
    private static final Object LENGTH = new Object();
    static final Unit INCH = new Unit(new BigDecimal(25), Unit.LENGTH);
    static final Unit FEET = new Unit(new BigDecimal(12 * 25), Unit.LENGTH);
    static final Unit MILLIMETER = new Unit(new BigDecimal(1), Unit.LENGTH);
    static final Unit CENTIMETER = new Unit(new BigDecimal(10), Unit.LENGTH);

    private static final Object VOLUME = new Object();
    static final Unit GALLON = new Unit(new BigDecimal(3.78), Unit.VOLUME);
    static final Unit LITER = new Unit(new BigDecimal(1), Unit.VOLUME);

    private final Object type;
    private BigDecimal ratio;


    private Unit(BigDecimal ratio, Object type) {
        this.ratio = ratio;
        this.type = type;
    }

    BigDecimal convertToBaseUnitValue(BigDecimal value) {
        return this.ratio.multiply(value);
    }

    boolean isSameType(Unit unit) {
        return unit.type.equals(this.type);
    }
}
