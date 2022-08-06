package Test;

public class FactoryOfSource {
    public IngestToDatabase getInstanceOfSource(String source){
        IngestToDatabase sourceSystemObject=null;
        if(source.equalsIgnoreCase("API")) sourceSystemObject = new SourceDataFromApi();
        else if(source.equalsIgnoreCase("FILE")) sourceSystemObject = new SourceDataFromFile();
        else if (source.equalsIgnoreCase("DATALAKE")) sourceSystemObject = new SourceDataFromLake();
        return sourceSystemObject;
    }
}
