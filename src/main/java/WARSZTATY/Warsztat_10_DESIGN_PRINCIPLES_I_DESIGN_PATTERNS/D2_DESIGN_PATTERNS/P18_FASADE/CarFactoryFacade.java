package WARSZTATY.Warsztat_10_DESIGN_PRINCIPLES_I_DESIGN_PATTERNS.D2_DESIGN_PATTERNS.P18_FASADE;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CarFactoryFacade {

    private FrameAssambler frameAssambler;
    private Painter painter;
    private EngineMaker engineMaker;
    private CockpitAssembler cockpitAssembler;
    private DoorMaker doorMaker;
    private SeatsMaker seatsMaker;
    private WheelsProducer wheelsProducer;

    public void produceCar() {
        frameAssambler.assembleFrame();
        painter.paintSkeleton();
        engineMaker.fastenEngine();
        cockpitAssembler.mountCockpit();
        doorMaker.instalDoor();
        seatsMaker.attachSeats();
        wheelsProducer.attacheWeels();
    }
}
