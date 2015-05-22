/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.sevw.ics3u.U7;

import java.io.IOException;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Serializer;

/**
 *
 * @author Sean
 */
public class XMLExample {

    /**
     * @param args the command line arguments
     */
    
    static final String ELEMENT_CODE="Code";
    static final String ELEMENT_DESC="Discription";
    static final String ELEMENT_TEACH="Teacher";
    static final String ELEMENT_BOARD="SchoolBoard";
    
    public static void main(String[] args) {

        
        Element course = new Element("Course");
        Document courseData = new Document(course);
        
        Element code = new Element(ELEMENT_CODE);
        code.appendChild("12345");
        Element description = new Element(ELEMENT_DESC);
        description.appendChild("Computer Science");
        Element teacher = new Element(ELEMENT_TEACH);
        teacher.appendChild("Muir");
        Element schoolBoard = new Element(ELEMENT_BOARD);
        schoolBoard.appendChild("HDSb");
        
        course.appendChild(code);
        course.appendChild(description);
        course.appendChild(teacher);
        course.appendChild(schoolBoard);
        //Serializer
                try {
            Serializer serializer = new Serializer(System.out);
            serializer.setIndent(4);
            serializer.setMaxLength(64);
            serializer.write(courseData);
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }

}
