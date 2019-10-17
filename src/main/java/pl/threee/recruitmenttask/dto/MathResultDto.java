package pl.threee.recruitmenttask.dto;

public class MathResultDto {
    private double value;

    public MathResultDto(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}
