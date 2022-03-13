package lab4;

public class Author {

    private String name;
    private String email;
    private char gender;


    public Author(String modelName, String modelType, char g ){
        name = modelName;
        email = modelType;
        gender = g;
    }
    //setter
    public void setEmail(String email){

        this.email = email;
    }
    //getters
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public char getGender(){

        return gender;
    }

    @Override
    public String toString(){

        return name + "(" + gender + ")at" +email;
    }

}

