package Test;

public class SourceDataFromLake implements IngestToDatabase{
    @Override
    public void ingestData() {
        System.out.println("reads Data from Lake");
    }
}
