package com.vrchadi.kanban;

import com.vrchadi.kanban.model.Task;
import com.vrchadi.kanban.service.TaskService;

public class App {
    public static void main(String[] args) {
        TaskService service = new TaskService();

        service.addTask(new Task("Estudar Java", "Revisar conceitos de orientação a objetos", "To Do"));
        service.addTask(new Task("Modelar Kanban", "Criar estrutura de classes", "Doing"));
        service.addTask(new Task("Finalizar README", "Documentar o projeto", "Done"));

        System.out.println("📋 Tarefas no Kanban:");
        service.getAllTasks().forEach(task ->
                System.out.println("• " + task.getTitle() + " [" + task.getStatus() + "]")
        );
    }
}