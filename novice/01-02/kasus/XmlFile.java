import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class XmlFile {
    public static void main(String[] args){
	try{
			
	   // Step 1 : Membuat objek dokumen builder
			
	   DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
	   DocumentBuilder documentBuilder = docBuilderFactory.newDocumentBuilder();
	 
	   // Step 2 : Membuat element root
	   Document document = documentBuilder.newDocument();
	   Element rootElement = document.createElement("karyawan");
	   document.appendChild(rootElement);
	 
	   // Step 3 : Membuat element Programmer
	   Element programmer = document.createElement("programmer");
	   rootElement.appendChild(programmer);
	 
			
	   // Step 4 : Membuat atribut NIK buat programmer
	   Attr attr = document.createAttribute("nik");
	   attr.setValue("20081090");
	   programmer.setAttributeNode(attr);
	 
	   // Step 5 : Membuat element-element lainnya yg dibutuhkan 
	   // Membuat element Nama
	   Element nama = document.createElement("nama");
	   nama.appendChild(document.createTextNode("Nursalim"));
	   programmer.appendChild(nama);
	 
	   // Membuat element Jenis Kelamin
	   Element gender = document.createElement("gender");
	   gender.appendChild(document.createTextNode("Laki-Laki"));
	   programmer.appendChild(gender);
	 
	   // Membuat element Tempat Lahir
	   Element tempatLahir = document.createElement("alamat");
	   tempatLahir.appendChild(document.createTextNode("Brebes"));
	   programmer.appendChild(tempatLahir);
	 
	   // Membuat elemen keahlian
	   Element keahlian = document.createElement("keahlian");
	   keahlian.appendChild(document.createTextNode("Java"));
	   programmer.appendChild(keahlian);
	 
	   // Menulis isi atau konten ke file
	   TransformerFactory transformerFactory = TransformerFactory.newInstance();
	   Transformer transformer = transformerFactory.newTransformer();
	   DOMSource source = new DOMSource(document);
	   StreamResult result = new StreamResult(new File("D:\\xml\\programmer.xml"));
	 
	   // Jika output melalui konsole
	   // StreamResult result = new StreamResult(System.out);
	 
	   transformer.transform(source, result);
	 
	   System.out.println("File XML berhasil dibuat !");
	}catch(ParserConfigurationException ex){
	   ex.printStackTrace();
	}catch(TransformerException ex){
	   ex.printStackTrace();
	}
    }
}
