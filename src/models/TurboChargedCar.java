package models;

public class TurboChargedCar extends Car {

    private Boolean turbo;
    
    public TurboChargedCar(String registration) {
        super(registration);
    }

    @Override
    public void accelerate() {
        super.accelerate();
        super.accelerate();
        super.accelerate();
        super.accelerate();
        super.accelerate();
    }

    public Boolean getTurbo() {
        return turbo;
    }

    public void setTurbo(Boolean turbo) { 
        this.turbo = turbo;
    }
}
