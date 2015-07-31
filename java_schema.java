import javax.xml.validation.SchemaFactory;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.XMLReader;
import java.io.File;


final class Validate {
    public static void main ( String args[] ) throws Exception {
	SAXParserFactory factory = SAXParserFactory.newInstance();
	factory.setValidating(true);
	factory.setNamespaceAware(true);
	SchemaFactory schemaFactory =  SchemaFactory.newInstance("http://www.w3.org/2001/XMLSchema");
	factory.setSchema(schemaFactory.newSchema(new File(args[1])));
	XMLReader xmlReader = factory.newSAXParser().getXMLReader();
	xmlReader.parse(args[0]);
    }
}