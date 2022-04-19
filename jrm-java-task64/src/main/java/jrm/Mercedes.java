package jrm;

public class Mercedes implements TypeAcceptable<EngineType>{
    @Override
    public boolean accept(EngineType type) {
        return EngineType.ELECTRIC == type || EngineType.PETROL == type;
    }
}
