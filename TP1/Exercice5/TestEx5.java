import java.nio.file.FileSystems;
import java.nio.file.Path;

class TestEx5 {
    public static void main(String[] args) {
        Path path = FileSystems.getDefault().getPath("").toAbsolutePath();
        FileStatistics fst = new FileStatistics(path + "/TP1/Exercice5/fichier1.txt");
        System.out.println("Char Count  is " + fst.getCharCount());
        System.out.println("Words Count  is " + fst.getWordCount());
        System.out.println("Sentances Count  is " + fst.getSentanceCount());
        System.out.println("Paragraphes Count is " + fst.getParagrapheCount());
        fst.saveCounts("counts.txt");
        System.out.println(fst.getDictionary());
        fst.saveDictionary("dictionnaire.txt");
}
}