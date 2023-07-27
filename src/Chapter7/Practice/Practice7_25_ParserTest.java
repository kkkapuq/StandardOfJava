package Chapter7.Practice;

class Practice7_25_ParserTest {
    public static void main(String[] args) {
        Parseable parser = ParserManager.getParser("XML");
        parser.parse("document.xml");
        parser = ParserManager.getParser("HTML");
        parser.parse("document2.html");

    }
}

class XMLParser implements Parseable {
    public void parse(String fileName) {
        System.out.println(fileName + "- XML parsing completed.");
    }
}

class HTMLParser implements Parseable {
    public void parse(String fileName) {
        System.out.println(fileName + "- HTML parsing completed.");
    }
}

interface Parseable {
    // 구문 분석작업 수행
    void parse(String fileName); //public abstract void parse() 와 동일
}

class ParserManager {
    public static Parseable getParser(String type) {
        if (type.equals("XML")) {
            // 여기 에러
            return new XMLParser();
        } else {
            // 여기 에러
            Parseable p = new HTMLParser();
            return p;
            // return new HTMLParser() 와 동일하다.
        }
    }
}
