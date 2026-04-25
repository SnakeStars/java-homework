package task10;

import java.util.Map;

public abstract class PublicTransport implements Vehicle {

    protected String number;
    protected String engine;
    protected boolean isInUse;

    @Override
    public String getVehicleNumber() {
        return number;
    }

    @Override
    public String getVehicleEngine() {
        return engine;
    }

    @Override
    public Boolean isInUse() {
        return isInUse;
    }

    @Override
    public void toggleIsInUse() {
        isInUse = !isInUse;
    }

    public abstract Map<String,String> getCrewComposition();
}
