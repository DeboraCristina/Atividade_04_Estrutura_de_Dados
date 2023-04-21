package view;

import br.fatec.QueueObject.QueueObject;
import controller.OperacaoController;
import model.Cliente;

public class Main
{
    static int ramdomInt(int min, int max)
    {
        int ramdom;
        max = (max + 1) - min;
        ramdom = (int)((Math.random() * max) + min);
        return ramdom;
    }

    public static void main(String[] args)
    {
        OperacaoController op = new OperacaoController();
        QueueObject fila = new QueueObject();

        for (int i = 1; i <= 20; i++)
        {
            Cliente c = new Cliente();
            c.setNome("Cliente " + i);
            c.setQuantidadePecas(ramdomInt(20, 50));
            c.setValorPecas(ramdomInt(5, 100));
            fila.insert(c);
        }

        //fila.list();

        op.caixa(fila);

    }
}
