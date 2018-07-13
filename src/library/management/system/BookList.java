/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.system;

import com.sun.mail.imap.protocol.ID;

/**
 *
 * @author hamma
 */
class BookList {
private String BookID;
private String Name;
private String Edition;
private String Publisher;
private String Price;
private String Pages;

    public String getBookID() {
        return BookID;
    }

    public String getName() {
        return Name;
    }

    public String getEdition() {
        return Edition;
    }

    public String getPublisher() {
        return Publisher;
    }

    public String getPrice() {
        return Price;
    }

    public String getPages() {
        return Pages;
    }
    BookList(String string, String string0, String string1, String string2, String string3, String string4, String string5) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
        BookID=string0;
        Name=string1;
        Edition=string2;
        Publisher=string3;
        Price=string4;
        Pages=string5;
    
    }
    
}
