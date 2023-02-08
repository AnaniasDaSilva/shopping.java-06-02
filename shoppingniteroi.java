public class shoppingniteroi extends shopping {

    public shoppingniteroi (String nomedoshopping,
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
    
        shoppingniteroi shoppingniteroi = new  shoppingniteroi ("Plaza Shopping", "Niterói", "Centro, ","xv de novembro" , "08");
       shoppingniteroi.nomedoshopping();
}
}
