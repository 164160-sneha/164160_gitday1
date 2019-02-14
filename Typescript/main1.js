"use strict";
exports.__esModule = true;
var Todo = /** @class */ (function () {
    function Todo(title) {
        this.title = title;
        this.status = false;
        this.upadatedAt = new Date();
    }
    Todo.prototype.toggleStatus = function () {
        if (this.status == true) {
            this.status = false;
        }
        else {
            this.status = true;
        }
    };
    return Todo;
}());
exports.Todo = Todo;
var todoLIstClass = /** @class */ (function () {
    function todoLIstClass() {
        this.TodoItems = new Array();
    }
    todoLIstClass.prototype.addTask = function (task) {
        this.TodoItems.push(task);
    };
    todoLIstClass.prototype.listAllTasks = function () {
        console.log(this.TodoItems);
    };
    todoLIstClass.prototype.deleteTask = function (task) {
        var len = this.TodoItems.indexOf(task, 0);
        if (len > -1) {
            var removed = this.TodoItems.splice(len, 1);
            return "number of elements " + this.TodoItems.length + " removed:" + removed;
        }
        else {
            console.log("Pass correct values!!!!!");
        }
    };
    return todoLIstClass;
}());
var obj = new todoLIstClass();
var todoObj = new Todo("start assignments");
var todoobj1 = new Todo("fkgjhcomplete assignment at");
obj.addTask(todoObj);
obj.addTask(todoobj1);
obj.listAllTasks();
console.log(obj.deleteTask(todoObj));
obj.listAllTasks();
