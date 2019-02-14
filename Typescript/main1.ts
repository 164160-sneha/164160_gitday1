import { TodoItemInterface }from  './interface';
import{Todolist} from './interface';
export class Todo implements TodoItemInterface{
     title: string; 
     status: boolean;
     upadatedAt: Date;
     constructor(title:string){
this.title=title;
this.status=false;
this.upadatedAt=new Date();
     }
    toggleStatus() {
       if(this.status==true){
        this.status=false;
       }
       else {
       this.status=true;
    }
}
}

class todoLIstClass implements Todolist{
    TodoItems: Todo[]= new Array(); 
     addTask(task:Todo) {
        
      this.TodoItems.push(task) ;
    } 
    listAllTasks() {
        
        console.log(this.TodoItems+"updated at"+Date);
    }
    deleteTask(task:Todo) {
        var len=this.TodoItems.indexOf(task,0);
        if(len>-1){
           var removed= this.TodoItems.splice(len,1);
           return "number of elements "+this.TodoItems.length+" removed:"+removed;
        }
        else{
            console.log("Pass correct values!!!!!");
        }
    }


}
var obj=new todoLIstClass();
var todoObj=new Todo("start assignments");
var todoobj1=new Todo("complete assignment at");
obj.addTask(todoObj);
obj.addTask(todoobj1);
obj.listAllTasks();
console.log(obj.deleteTask(todoObj));
obj.listAllTasks();