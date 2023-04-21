package view;

import br.fatec.QueueObject.QueueObject;
import controller.Teste;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        int calls = 0;
        QueueObject priority = new QueueObject();
        QueueObject no_priority = new QueueObject();

        cliMenu(calls, priority, no_priority);

    }

    public static void cliMenu(int calls, QueueObject priority, QueueObject no_priority)
    {
        boolean stop = false;
        Scanner scan = new Scanner(System.in);
        String option = null;
        int password = 0;

        calls = 0;
        while (!stop)
        {
            System.out.print("O que fazer:\n01 - Adicionar Senha" +
                    "\n02 - Chamar Senha" +
                    "\n00 - Sair" +
                    "\n: ");
            option = scan.next();
            switch (option)
            {
                case "0", "00" -> {
                    System.out.println("Sistema finalizado");
                    stop = true;
                }
                case "1", "01" -> {

                    password = 5;
                    System.out.printf("Senha Comum %d adicionada com Sucesso\n", password);
                }
                case "2", "02" -> {
                    password = 8;
                    System.out.printf("Senha %d chamada com Sucesso\n", password);
                }
                default -> System.out.println("Opção errada! Tente novamente!");
            }
        }
    }
}
