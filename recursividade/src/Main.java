// criar um método recursivo para cálculo de fatorial até o sentinela

class Main{
                     public static int resultado  = 1;

                    public  static int fatorialRecursivo(int numero){
                            resultado = numero * resultado;
                             if (numero == 1){
                                 
                                 System.out.println(resultado);
                                return resultado;
                            }                             
                            return fatorialRecursivo((numero - 1));
                    }
                    
                    public static void main(String args[]){
                            fatorialRecursivo(3);
                    }
}