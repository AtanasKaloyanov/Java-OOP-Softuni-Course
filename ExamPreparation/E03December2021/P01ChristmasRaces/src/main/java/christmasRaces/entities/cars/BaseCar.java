package christmasRaces.entities.cars;

import christmasRaces.common.ExceptionMessages;

public abstract class BaseCar implements Car{
    private String model;
    private int horsePower;
    private double cubicCentimeters;

    public BaseCar(String model, int horsePower, double cubicCentimeters) {
        setModel(model);
        setHorsePower(horsePower);
        setCubicCentimeters(cubicCentimeters);
    }

    public void setModel(String model) {
        if (model.trim().isEmpty() || model.length() < 4) {
             throw new IllegalArgumentException(String.format(ExceptionMessages.INVALID_MODEL, model, 4));
        }
        this.model = model;
    }

    public void setHorsePower(int horsePower) {
        if (!isHorsePoweInRange()) {
            throw new IllegalArgumentException(String.format(ExceptionMessages.INVALID_HORSE_POWER, horsePower));
        }

        this.horsePower = horsePower;
    }

    public void setCubicCentimeters(double cubicCentimeters) {
        this.cubicCentimeters = cubicCentimeters;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getHorsePower() {
        return horsePower;
    }

    @Override
    public double getCubicCentimeters() {
        return cubicCentimeters;
    }

    @Override
    public double calculateRacePoints(int laps) {
        //cubic centimeters / horsepower * laps
        return this.cubicCentimeters / this.horsePower * laps;
    }

    public abstract boolean isHorsePoweInRange();
}
