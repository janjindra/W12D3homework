package vehicles;

import components.*;

public interface ICarBuild {

    public void carBuild(Battery battery, Breaks breaks, Engine engine, GearBox gearBox, Tyres tyres);

}
