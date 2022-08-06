package Test;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

public class IngestionService {
    FactoryOfSource factoryOfSource =null;

    public IngestionService(FactoryOfSource factoryOfSource){
        this.factoryOfSource = factoryOfSource;
    }
    public void ingestToMyDatabase(String source){
        IngestToDatabase sourceSystemObject = factoryOfSource.getInstanceOfSource(source);
        sourceSystemObject.ingestData();
    }


}
