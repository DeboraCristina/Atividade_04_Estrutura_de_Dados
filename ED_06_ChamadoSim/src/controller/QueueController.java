package controller;

import br.fatec.QueueObject.QueueObject;
import model.Client;

public class QueueController
{
    public QueueObject addPassword(QueueObject queue, int lastPassword, String name)
    {
        Client newClient = new Client();

        newClient.setNumber(lastPassword + 1);
        newClient.setName(name);
        queue.insert(newClient);
        return queue;
    }
}
