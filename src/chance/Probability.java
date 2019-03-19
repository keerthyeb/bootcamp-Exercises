package chance;

class Probability {
    public static final int LOWER_BOUND = 0;
    public static final int UPPER_BOUND = 1;
    private double value;

    Probability(double value) throws ProbabilityException {
        validate(value);
        this.value = value;
    }

    private void validate(double value) throws ProbabilityException {
        if (value < LOWER_BOUND || value > UPPER_BOUND) throw new ProbabilityException();
    }

    public Probability notGetting() throws ProbabilityException {
        return new Probability(UPPER_BOUND - this.value);
    }

    @Override
    public boolean equals(Object probability) {
        if (this == probability) return true;
        if (!(probability instanceof Probability)) return false;
        Probability that = (Probability) probability;
        return Double.compare(that.value, value) == 0;
    }
}
