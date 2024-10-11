package classwork_21.user;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {

    User user;
    final String email = "peter@mail.de"; // ideal email
    final String password = "123456Az!"; // ideal password

    @BeforeEach
    void setUp() {
        user = new User(email,password); // create new 'fresh' object user

    }

    @Test
    void testValidEmail(){
        user.setEmail(email);
        assertEquals("peter@mail.de",user.getEmail());
    }

    @Test
    void setEmailNoAt() { // нет собаки
        String email = "petermail.de"; // wrong email
        user.setEmail(email);
        assertEquals("peter@mail.de",user.getEmail()); //email didn't change
    }

    @Test
    void setEmailNoDot(){ // нет точки
        String email = "peter@mailde"; // wrong email
        user.setEmail(email);
        assertEquals ("peter@mail.de", user.getEmail()); //email didn't change);

    }

    @Test
    void setEmailNoLetter(){ // short
        String email = "peter@maild"; // wrong email
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail());
    }

     @Test
    void setEmailWithPlus(){
        String email = "+peter@mail.de";
        user.setEmail(email);
        assertEquals("peter@mail.de", user.getEmail());
     }

     @Test
     void setEmailMultipleAt(){
         String email = "peter@@mail.de";
         user.setEmail(email);
         assertEquals("peter@mail.de", user.getEmail());
     }

     @Test
     void setEmailDotAtEnd(){
         String email = "peter@@mailde.";
         user.setEmail(email);
         assertEquals("peter@mail.de", user.getEmail());
     }

     @Test
     void  setEmailWhenEmpty(){
         String email = "";
         user.setEmail(email);
         assertEquals("peter@mail.de", user.getEmail());
     }

     @Test
     void setEmailWhenOnlyAt(){
         String email = "@";
         user.setEmail(email);
         assertEquals("peter@mail.de", user.getEmail());
     }

     @Test
     void setEmailWhenSpace(){
         String email = "peter@ mail.de";
         user.setEmail(email);
         assertEquals("peter@mail.de", user.getEmail());
     }

     @Test
     void setEmailWhenDotAfterAt(){
         String email = "peter@.mail.de";
         user.setEmail(email);
         assertEquals("peter@mail.de", user.getEmail());
     }


    @Test
    void setPassword(){

    }
} // end of class