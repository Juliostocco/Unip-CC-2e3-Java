package Modelo;

import javax.swing.JOptionPane;

public class Controle
{
    private String num1;
    private String num2;
    private String operacao;
    private String resposta;
    private String mensagem;

    public Controle(String num1, String num2, String operacao)
    {
        this.num1 = num1;
        this.num2 = num2;
        this.operacao = operacao;
        calcular();
    }
    
    public void calcular()
    {
        this.mensagem = "";
        Double n1 = 0.0, n2 = 0.0, resultado = 0.0;
        try
        {
            n1 = Double.parseDouble(this.num1);
            n2 = Double.parseDouble(this.num2); 
            if (this.operacao.equals("+"))
                resultado = n1 + n2;
            if (this.operacao.equals("-"))
                resultado = n1 - n2;
            if (this.operacao.equals("*"))
                resultado = n1 * n2;
            this.resposta = resultado.toString();
            if (this.operacao.equals("/"))
            {
                if (n2 == 0)
                    this.mensagem = "Divisão por 0";
                else
                {
                    resultado = n1 / n2;
                    this.resposta = resultado.toString();
                }
            }
            
        }
        catch(NumberFormatException e)
        {
            this.mensagem = "Erro de conversão";
        }
    }

    public String getResposta()
    {
        return resposta;
    }

    public String getMensagem()
    {
        return mensagem;
    }
    
    
}
