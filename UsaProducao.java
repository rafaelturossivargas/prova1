pacote  br.ulbra.classes ;

importar  java.util.Scanner ;

public  class  UsaProducao 
{
    public  static  void  main ( String [] args )
    {
        Produção prod =  new  Produção ();
        Scanner ler =  new  Scanner ( System . in);
        
        prod . calcular HMS();
        
        Sistema . fora . println(prod . toString());
        
        Sistema . fora . println( " Digite a peça: " );
        prod . setPeca(ler . nextLine());
        Sistema . fora . println( " Digite o valor em segundos: " );
        prod . setSegundos(ler . nextInt());
        
        prod . calcular HMS();
        Sistema . fora . println(prod . toString());
    }
}
