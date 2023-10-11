public class Estatica {
    public static String conect_db = "https://jdbc:3660:mydatabase/java";
    private static String pass_db = "root";

    private String user_db = "root";
    private String user;
    private String pass;

    
    public Estatica(String user, String pass) {
        this.user = user;
        this.pass = pass;
    }


    public void conectar(){
        if (this.user == this.user_db  && this.pass == pass_db){
            System.out.println("Conexión a la Base de Datos ....");
            System.out.println(conect_db);
        }else{
            System.out.println(" Error: no se pudo conectar a la base de datos");
        }
    }


    public static String getPass_db() {
        return pass_db;
    }


    public static void setPass_db(String pass_db) {
        Estatica.pass_db = pass_db;
    }


    public String getUser_db() {
        return user_db;
    }


    public void setUser_db(String user_db) {
        this.user_db = user_db;
    }


    public String getUser() {
        return user;
    }


    public void setUser(String user) {
        this.user = user;
    }


    public String getPass() {
        return pass;
    }


    public void setPass(String pass) {
        this.pass = pass;
    }

    
    public static void main(String[] args) {
        Estatica c1 = new Estatica("root", "root");
        Estatica c2 = new Estatica("root", "root");
        System.out.println(c1.user);
        System.out.println(c2.user);
        
        Estatica.pass_db="sudo_root";
        
        System.out.println(Estatica.pass_db);
        System.out.println(Estatica.pass_db);
    }
}
