/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.hdsb.gwss.sevw.ics3u.U7;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import nu.xom.Builder;
import nu.xom.Document;
import nu.xom.Element;
import nu.xom.Elements;
import nu.xom.Serializer;

/**
 *
 * @author Sean
 */
public class U7_Assignment {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Initialising Objects
        File file = new File("AL.STANDINGS(5).xml");
        Builder builder = new Builder();
        Document doc = null;

        //File Builder
        try {
            doc = builder.build(file);
        } catch (Exception e) {
            System.out.println(e);
        }

        //Getting Elements of the file
        Element aL_Team = doc.getRootElement();
        Elements teams = aL_Team.getChildElements();

        //Print for East Division
        System.out.println("American League East");
        System.out.println("----------------------");
        System.out.format("%-10s %11s \n", "Teams", "Record");

        //Initialising int Arrays for Indecies
        for (int i = 0; i < teams.size(); i++) {
            if (teams.get(i).getFirstChildElement("division").getValue().equals("East")) {
                //Output table
                String name = teams.get(i).getFirstChildElement("name").getValue();
                String record = teams.get(i).getFirstChildElement("record").getValue();
                System.out.format("%-10s %11s \n", name, record);
            }
        }
        //Print for Central Division
        System.out.println("");
        System.out.println("American League Cental");
        System.out.println("----------------------");
        System.out.format("%-10s %11s \n", "Teams", "Record");

        //Initialising int Arrays for Indecies
        for (int i = 0; i < teams.size(); i++) {
            if (teams.get(i).getFirstChildElement("division").getValue().equals("Central")) {
                //Output table
                String name = teams.get(i).getFirstChildElement("name").getValue();
                String record = teams.get(i).getFirstChildElement("record").getValue();
                System.out.format("%-10s %11s \n", name, record);
            }
        }

        //Print for West Division
        System.out.println("");
        System.out.println("American League West");
        System.out.println("----------------------");
        System.out.format("%-10s %11s \n", "Teams", "Record");

        //Initialising int Arrays for Indecies
        for (int i = 0; i < teams.size(); i++) {
            if (teams.get(i).getFirstChildElement("division").getValue().equals("West")) {
                //Output table
                String name = teams.get(i).getFirstChildElement("name").getValue();
                String record = teams.get(i).getFirstChildElement("record").getValue();
                System.out.format("%-10s %11s \n", name, record);
            }
        }

        //Pt 2
        //Initialize Objects
        Element aLPt2 = new Element("americanLeagueEast");
        Document aLEast = new Document(aLPt2);
        File file2 = new File("AL.EAST.SANDINGS.Sean.xml");

        //get data to store
        for (int i = 0; i < teams.size(); i++) {
            if (teams.get(i).getFirstChildElement("division").getValue().equals("East")) {
                Element team = new Element("team");
                Element name = new Element("name");
                Element division = new Element("division");
                Element record = new Element("record");

                name.appendChild(teams.get(i).getFirstChildElement("name").getValue());
                division.appendChild(teams.get(i).getFirstChildElement("division").getValue());
                record.appendChild(teams.get(i).getFirstChildElement("record").getValue());

                team.appendChild(name);
                team.appendChild(division);
                team.appendChild(record);
                aLPt2.appendChild(team);
            }
        }

        //File Heirearcy
        //Serialize and Close
        try {
            Serializer serializer = new Serializer(System.out);
            serializer.setIndent(4);
            serializer.setMaxLength(64);
            serializer.write(aLEast);
        } catch (IOException ex) {
            System.err.println(ex);

        }
        try {
            BufferedWriter output = new BufferedWriter(new FileWriter("AL.EAST.SANDINGS.Sean.xml"));
            output.write(aLEast.toXML());
            output.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }

    }

}
