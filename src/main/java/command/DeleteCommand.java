package command;

import storage.Storage;
import tasks.Task;
import tasks.TaskList;
import ui.Ui;

public class DeleteCommand extends Command{
    private int index;
    public DeleteCommand(int index){
        assert index > -1: "Index should not be negative";
        this.index = index;
    }
    public String execute(TaskList taskList, Storage storage, Ui ui){
        Task task = taskList.get(index);
        taskList.deleteTask(index);
        storage.updateFile(taskList);
        return ui.deleteTaskMsg(task, taskList.getSize());
    };
}