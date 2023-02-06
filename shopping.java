public class shopping {

String nomedoshopping;
String cidadedoshopping;
String bairrodoshopping;
String ruadoshopping;
String numerodoshopping;

public shopping (
String nomedoshopping,
String cidadedoshopping,
String bairrodoshopping,
String ruadoshopping,
String numerodoshopping
){
   this.nomedoshopping = nomedoshopping;
   this.cidadedoshopping = cidadedoshopping;
   this.bairrodoshopping = bairrodoshopping;
   this.ruadoshopping = ruadoshopping;
   this.numerodoshopping = numerodoshopping;
   
}

public void nomedoshopping(){

        System.out.println("nomedoshopping :" + nomedoshopping);
        System.out.println("cidadedoshopping :" + cidadedoshopping);
        System.out.println("bairrodoshopping :" + bairrodoshopping );
        System.out.println("ruadoshopping :" + ruadoshopping);
        System.out.println("numerodoshopping ;" + numerodoshopping);

    }
    public static void main(String[] args) {
    
        shopping shopping = new  shopping ("Norte shopping", "Rio de Janeiro", "Del Castilho, ","Av.Dom Hélder Câmara" , "1313");
       shopping.nomedoshopping();
}   

}


