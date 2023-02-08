public class shoppingsaogoncalo extends shopping {

    public shoppingsaogoncalo (String nomedoshopping,
    String cidadedoshopping,
    String bairrodoshopping,
    String ruadoshopping,
    String numerodoshopping){
        super(nomedoshopping,
        cidadedoshopping,
         bairrodoshopping,
         ruadoshopping,
         numerodoshopping);
    }
   
    public static void main(String[] args) {
    
        shoppingsaogoncalo shoppingsaogoncalo = new  shoppingsaogoncalo ("São Gonçalo Shopping", "São Gonçalo", "Boa Vista, ", "Rod. Niterói Manilha" , "100");
       shoppingsaogoncalo.nomedoshopping();
}
}

