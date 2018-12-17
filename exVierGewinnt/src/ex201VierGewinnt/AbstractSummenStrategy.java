package ex201VierGewinnt;

import java.util.List;

public abstract class AbstractSummenStrategy implements ISummenStrategy{

    protected String name;

    public AbstractSummenStrategy(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    
}
