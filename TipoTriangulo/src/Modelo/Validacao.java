package Modelo;

public class Validacao extends absPropriedades
{
    
    public Validacao(String lado1, String lado2, String lado3)
    {
        super(lado1, lado2, lado3);
        Validar();
    }
    
    private void Validar()
    {
        this.setMensagem("");
        try
        {
            this.setL1(Double.parseDouble(this.getLado1()));
        }
        catch (Exception e)
        {
            this.setMensagem(this.getMensagem() + "Erro no Lado 1 \n");
        }
        try
        {
            this.setL2(Double.parseDouble(this.getLado2()));
        }
        catch (Exception e)
        {
            this.setMensagem(this.getMensagem() + "Erro no Lado 2 \n");
        }
        try
        {
            this.setL3(Double.parseDouble(this.getLado3()));
        }
        catch (Exception e)
        {
            this.setMensagem(this.getMensagem() + "Erro no Lado 3 \n");
        }
        
        if (this.getMensagem().equals(""))
        {
            if (this.getL1() + this.getL2() <= this.getL3() ||
                    this.getL1() + this.getL3() <= this.getL2() ||
                    this.getL2() + this.getL3() <= this.getL1())
            {
                this.setMensagem(this.getMensagem() + "Não é Triângulo \n");
            }
        }
    }
}
