pacote  br.ulbra.classes ;

 classe  publica Produção 
{
    privada  String peca;
    privado  int segundos;
    privado  int segundos;
    privado  int minuto;
    privado  int hora;
    
    
 produção publica ()
{
    isso . peca =  " Teclado " ;
    isso . segundos =  100 ;
}

    public  String  getPeca ()
    {
        voltar peca;
    }

    public  void  setPeca ( String  peca )
    {
        isso . peca = peca;
    }

    public  int  getSegundo ()
    {
        retorno segundos;
    }

    public  void  setSegundo ( int  segundo )
    {
        isso . segundo = segundo;
    }

    public  int  getSegundos ()
    {
        retorno segundos;
    }

    public  void  setSegundos ( int  segundos )
    {
        
        if (segundos >=  0 )
        {
        isso . segundos = segundos;
        }
        outro
        {
        isso . segundos =  100 ;
        }
        
    }

    public  int  get Minuto ()
    {
        retorno minuto;
    }

    public  void  setMinuto ( int  minuto )
    {
        isso . minuto = minuto;
    }

    public  int  getHora ()
    {
        volta hora;
    }

    public  void  setHora ( int  hora )
    {
        isso . hora = hora;
    }
    
    public  void  calcularHMS ()
    {
       isso . segundos = segundos;
       isso . minuto = segundos /  60 ;
       isso . hora = segundos /  3600 ;
       
       while (minuto >= 60 )
       {
           minuto -= 60 ;
       }
       enquanto (segundo >= 60 )
       {
           segundos -= 60 ;
       }
       
    }

    @Sobrepor
    public  String  toString ()
    {
        return  " A peça= "  +  this . getPeca() +  " , que levou um total de = "  +  this . getSegundos() +  " segundos, "
        +  isso . getHora() +  " : "  +  this . getMinuto() +  " : "  +  this . getSegundo() +  " para ficar pronta!!! " ;
    }
    
}
