public class MainOutOfBounds {

    public static void main(String[] args) {

        //...
        int[] vetor = new int[]{1,2,3,4};

        try{
            for(int i=0;i<=4;i++){
                System.out.println("vetor[4]:"+vetor[i]);
            }
        }catch (IndexOutOfBoundsException e){
            System.out.println("Posição do vetor inválida!!"+e.getMessage());
        }

        System.out.println("Fim...");
    }

}
