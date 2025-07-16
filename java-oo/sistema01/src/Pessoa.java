public class Pessoa {
  private  String name;
  private int age;
  private String email;

//Constructors
public Pessoa(){}
public Pessoa(String name, int age, String email){
    this.name = name;
    this.age = age;
    this.email = email;
      
}
//Getters & Setters
public String getName(){
    return name;
}
public int getAge(){
    return age;
}
public String getEmail(){
    return email;
}
public void setName(String name){
    this.name = name;
}
public void setAge(int age){
    this.age = age;
}
public void setEmail(String email){
    this.email = email;
}

//Métodos
public String Greetings(){
    var textGreeting = "Olá Sr(a):" + name +
    " Seja Bem Vindo(a) ao nosso sistema!";
    return textGreeting;
}
public String noFind(){
    return "Infelizmente seus dados estão incorretos\nverifique e volte mais tarde!";
}

}


