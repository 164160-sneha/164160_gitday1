import {ITodo} from "./todointerface"
class Todo implements ITodo{

    todoList: string[]=[]
   
    addTask(task: string) {
        this.todoList[this.todoList.length]=task
        console.log("=============NEW TASK===============\n");
        console.log(task+ " inserted into the list");
        return 1;
    }


    listAllTasks() {
        
        let index:number=0;
        this.todoList.forEach(element => {
        console.log(this.todoList[index])
        index++
    });
        
    }


    deleteTask(task: string) {
       
        for (let index = 0; index < this.todoList.length; index++) {
    
            if(this.todoList[index]==task){
            
                console.log("===========DELETE TASK==========\n");
                console.log(task+ " deleted into the list");
                this.todoList.splice(index,1)
                
               return 1
                break 
            }
            
        }
      
    }
    
}

    var obj = new Todo();
    obj.addTask("go to temple")
    obj.addTask("Start working with TypeScript")
    obj.addTask("take water bottle")
    obj.addTask("collect money")
    obj.deleteTask("collect money")
    obj.listAllTasks()
    