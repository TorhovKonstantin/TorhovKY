package lab10;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class PrimerLinkParserItLearn {
    public static void main(String[] args) {
        String url = "https://itlearn.ru/first-steps";

        try {
            Document doc = Jsoup.connect(url).get();
            Elements links = doc.select("a[href]");
            for (Element link : links){
                System.out.println(link.attr("abs:href")); //указываем абсолютный URL для каждой ссылки
            }

        } catch (Exception e){
            e.printStackTrace();
        }
    }
}
