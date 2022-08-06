package Test;

public class SourceDataFromApi implements IngestToDatabase{
    @Override
    public void ingestData() {
        System.out.println("reads data from api");
    }
}
