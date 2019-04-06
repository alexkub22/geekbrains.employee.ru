
public class employee {
    private String nameFIO;
    private String position;
    private String email;
    private String telefon;
    private int cash;
    private int age;

    public employee(String nameFIO, String position, String email, String telefon, int cash, int age) {
        this.nameFIO = nameFIO;
        this.position = position;
        this.email = email;
        this.telefon = telefon;
        this.cash = cash;
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void info(){
        System.out.println(nameFIO +" - "+position+", "+telefon+"-контактный телефон.");
    }
}
