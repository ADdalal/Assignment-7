
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XML_Parser 
{
	
	public static void main(String[] args) 
	{
	DocumentBuilderFactory	Factory = DocumentBuilderFactory.newInstance();
	try 
	  {
		DocumentBuilder builder = Factory.newDocumentBuilder();
		Document doc = builder.parse("input.xml");
		NodeList personlist = doc.getElementsByTagName("Person");
		for(int i=0; i<personlist.getLength();i++ )
			{
			Node p= (Node) personlist.item(i);
			if (p.getNodeType()==Node.ELEMENT_NODE)
			   {
				Element person = (Element) p;
				NodeList namelist = person.getChildNodes();
				System.out.println("person->");
				for(int j =0; j<namelist.getLength(); j++)
				   {
					Node n = (Node) namelist.item(j);
					
					   if(n.getNodeType()== Node.ELEMENT_NODE) 
					  {
						Element name = (Element) n;
						if (name.getTagName()!="Address")
					    System.out.println(name.getTagName()+ " -> " + name.getTextContent());
					  }
					
				   }
			   }
			}
		System.out.println("Address->");
		NodeList addresslist = doc.getElementsByTagName("Address");
		for(int i=0; i<addresslist.getLength();i++ )
			{
			Node p= (Node) addresslist.item(i);
			if (p.getNodeType()==Node.ELEMENT_NODE)
			   {
				Element address = (Element) p;
				NodeList namelist = address.getChildNodes();
				for(int j =0; j<namelist.getLength(); j++)
				   {
					Node n = (Node) namelist.item(j);
					if(n.getNodeType()== Node.ELEMENT_NODE)
					  {
						Element name = (Element) n;
					    System.out.println(name.getTagName()+ " -> " + name.getTextContent());
					    
					  }
					
				   }
			   }
			}
	  }
	catch (ParserConfigurationException e) 
	 {
		
		e.printStackTrace();
	 } 
	catch (SAXException e) 
	 {
		e.printStackTrace();
	 } 
	catch (IOException e) 
	{
		e.printStackTrace();
	}
}

}
