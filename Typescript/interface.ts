import {Todo} from './main1';
export interface TodoItemInterface{
    title:string;
    status:boolean;
    upadatedAt:Date;
    toggleStatus();
}

export interface Todolist{
    TodoItems:Todo[];
    addTask(task:Todo);
    listAllTasks();
    deleteTask(task:Todo);
    }
