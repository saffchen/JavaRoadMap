package jrm;

public class BMW implements TypeAcceptable<EngineType>{

    @Override
    public boolean accept(EngineType type) {
        return EngineType.ELECTRIC == type;
    }
}
