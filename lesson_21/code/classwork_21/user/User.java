package classwork_21.user;

public class User {

    private String email;
    private String password;

// constructor
    public User(String email, String password) { // устанавливаем нужную нам логику, вручеую меняя this на методы:
        setEmail(email); // вызываем методы для проверки
        setPassword(password); // вызываем методы для проверки
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) { // проверяем проходит введенный имейл валидацию или нет
      if (isEmailValid(email)){
          this.email = email;
    }else{
          System.out.println(email + " is NOT valid.");
      }
    }

    private boolean isEmailValid(String email) {
        int indexAt = email.indexOf('@'); // index where @ placed
        if(indexAt == -1 || indexAt != email.lastIndexOf('@')){
            return false;
        }
        if(email.indexOf('.', indexAt) == -1){
            return false;
        }
        if(email.lastIndexOf('.') >= email.length() - 2) {
            return false;
        }
        for (int i = 0; i < email.length(); i++) {
            char c = email.charAt(i);
            if(!(Character.isAlphabetic(c) || Character.isDigit(c) || c == '_' || c == '-' || c == '.' || c == '@')){
                return false; // ± / |\
            }
        }
        return true;

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }




} // end of class
