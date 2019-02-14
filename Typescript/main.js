"use strict";
exports.__esModule = true;
var Todo = /** @class */ (function () {
    function Todo() {
        this.todoList = [];
    }
    Todo.prototype.addTask = function (task) {
        this.todoList[this.todoList.length] = task;
        console.log("=============NEW TASK===============\n");
        console.log(task + " inserted into the list");
        return 1;
    };
    Todo.prototype.listAllTasks = function () {
        var _this = this;
        var index = 0;
        this.todoList.forEach(function (element) {
            console.log(_this.todoList[index]);
            index++;
        });
    };
    Todo.prototype.deleteTask = function (task) {
        for (var index = 0; index < this.todoList.length; index++) {
            if (this.todoList[index] == task) {
                console.log("===========DELETE TASK==========\n");
                console.log(task + " deleted into the list");
                this.todoList.splice(index, 1);
                return 1;
                break;
            }
        }
    };
    return Todo;
}());
var obj = new Todo();
obj.addTask("go to temple");
obj.addTask("Start working with TypeScript");
obj.addTask("take water bottle");
obj.addTask("collect money");
obj.deleteTask("collect money");
obj.listAllTasks();
