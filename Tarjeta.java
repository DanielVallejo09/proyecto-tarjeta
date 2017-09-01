
public class Tarjeta
{
    private float saldo;
    /**
     * En este metodo inicializamos la tarjeta con un credito de 0
     */
    public Tarjeta()
    {
        saldo = 0;
    }
    
    /**
     *En este metodo ingresamos una cantidad a la cuenta de la tarjeta
     *
     */
    public void Depositar(float dinero)
    {
        if (saldo > 0){
            saldo = saldo + dinero;
        }
        
    }
    
    /**
     * Este metodo retira dinero de la tarjeta, revisa que no se saque mas de lo que tiene
     */
    public float retirar(float dinero)
    {
        if(saldo > 0)
       {
            if(saldo>=dinero)
              {
                saldo = saldo - dinero;
                return(dinero);
              }
            else 
                return 0; 
        }
        else
           return 0;
    }
    
    /**
     * Este metodo solo muestra el saldo que tiene
     */
    public void consulta()
    {
        System.out.println(saldo);
       
    }
    
}