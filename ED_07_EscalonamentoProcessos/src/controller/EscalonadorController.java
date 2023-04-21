package controller;

import br.fatec.QueueObject.QueueObject;
import model.Processo;

public class EscalonadorController
{
	public EscalonadorController()
	{
		super();
	}
	
	public void roundRobin(QueueObject filaProcessos)
	{
		Processo processo = null;
		int qntddRetornos;
		
		while (!filaProcessos.isEmpty())
		{
			try {
				processo = (Processo) filaProcessos.remove();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			qntddRetornos = processo.getQntddRetornos();
			
			processo.setQntddRetornos(qntddRetornos - 1);
			
			if (qntddRetornos > 0)
				filaProcessos.insert(processo);
			else
				System.out.println("Processo #" + processo.getNome() + " finalizado!");
		}
		
	}
}
