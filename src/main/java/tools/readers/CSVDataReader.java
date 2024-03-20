package tools.readers;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.io.FileReader;
import java.io.IOException;

public class CSVDataReader {
    // Método para ler uma linha específica de um arquivo CSV
    public static String[] lerLinhaCSV(String csvFile, int numeroLinha) {
        try (FileReader fileReader = new FileReader(csvFile);
             CSVParser csvParser = new CSVParser(fileReader, CSVFormat.DEFAULT)) {
            int linhaAtual = 0;
            csvParser.iterator().next();
            for (CSVRecord record : csvParser) {
                linhaAtual++;
                if (linhaAtual == numeroLinha) {
                    return new String[]{record.get(0), record.get(1)};
                }
            }
        } catch (IOException e) {
            e.fillInStackTrace();
        }
        return new String[]{""};
    }
}