public class MainThrows {

    public static void main(String[] args) {


        try{
            Pessoa p = new Pessoa("Teste",10);
        }catch (RuntimeException e){
            e.printStackTrace();
        }







    }


}
