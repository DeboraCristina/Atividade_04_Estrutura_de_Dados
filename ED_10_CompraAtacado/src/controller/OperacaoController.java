package controller;

import br.fatec.QueueObject.QueueObject;
import model.Cliente;

public class OperacaoController
{
    public OperacaoController()
    {
    }

    public void caixa(QueueObject fila)
    {
        float totalCompra;
        Cliente cliente;
        QueueObject filaAux = fila;

        while (!fila.isEmpty())
        {
            try
            {
                cliente = (Cliente) filaAux.remove();
                totalCompra = cliente.getQuantidadePecas() * cliente.getValorPecas();
                System.out.println(cliente.getNome() + ", Valor total = " + totalCompra);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
