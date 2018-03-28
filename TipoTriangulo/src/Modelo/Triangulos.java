package Modelo;

public class Triangulos extends absPropriedades
{
    
    public Triangulos(Double l1, Double l2, Double l3)
    {
        super(l1, l2, l3);
        Verificar();
    }
    
    private void Verificar()
    {
        if (this.getL1().equals(this.getL2()) &&
                this.getL2().equals(this.getL3()))
            this.setResposta("Triângulo equilátero");
        else
        {
            if (!this.getL1().equals(this.getL2()) &&
                    !this.getL1().equals(this.getL3()) &&
                    !this.getL2().equals(this.getL3()))
                this.setResposta("Triângulo Escaleno");
            else
                this.setResposta("Triângulo Isósceles");
        }
    }
}
