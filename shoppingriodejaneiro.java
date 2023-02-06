public class shoppingriodejaneiro extends shopping {

    public shoppingriodejaneiro (String nomedoshopping,
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
    
        shoppingriodejaneiro shoppingriodejaneiro = new  shoppingriodejaneiro ("Norte shopping", "Rio de Janeiro", "Del Castilho, ","Av.Dom Hélder Câmara" , "1313");
       shoppingriodejaneiro.nomedoshopping();
}
}