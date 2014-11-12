package com.xml.test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.xml.Person;

public class XmlUnmarshalerTest {
	public static void main(String[] args) throws JAXBException, FileNotFoundException {
		JAXBContext jaxbContext = JAXBContext.newInstance(Person.class);
		Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
		
		FileInputStream inputStream = new FileInputStream("NewFile.xml");
		Person person = (Person) unmarshaller.unmarshal(inputStream);
		System.out.println(person);
		
//		StringReader reader = new StringReader("<?xml version=\"1.0\" encoding=\"UTF-8\"?><Person><firstName>suman1</firstName><lastName>dulam</lastName></Person>");
//		Person person = (Person) unmarshaller.unmarshal(reader);
//		System.out.println(person);
	}
}
