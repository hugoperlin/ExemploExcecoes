public class MainThrows {

    public static void main(String[] args) {

        Pessoa p=null;
        try{
            p = new Pessoa("Teste TEste Teste",18);
        }catch (RuntimeException e){
            e.printStackTrace();
        }

        System.out.println(p);






    }


}
