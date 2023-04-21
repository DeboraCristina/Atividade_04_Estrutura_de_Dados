package view;

import br.fatec.QueueObject.QueueObject;
import controller.EscalonadorController;
import model.Processo;

public class Main
{
	public static void fazerFilaProcessos(String[] filaProcessos, QueueObject novafila)
	{
		for (String elem : filaProcessos)
		{
			Processo processo = new Processo();
			processo.setNome(elem.split(";")[0]);;
			processo.setQntddRetornos(Integer.parseInt(elem.split(";")[1]));
			novafila.insert(processo);
		}
	}
	
	public static void main(String[] args) {
		QueueObject fila = new QueueObject();
		EscalonadorController escalonador = new EscalonadorController();
		
		String[] processos = {
				"notepad.exe;14","write.exe;35","chrome.exe;27","acrobat.exe;52",
				"firefox.exe;18","word.exe;25"
		};
		
		fazerFilaProcessos(processos, fila);
		
		escalonador.roundRobin(fila);
	}
}
