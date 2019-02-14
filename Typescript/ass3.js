var arr_names = [];
var num;
function addTask(task, num) {
    arr_names[arr_names.length] = task;
    console.log("=============NEW TASK===============\n");
    console.log(task + " inserted into the list");
    console.log("Number of item:" + num);
}
function listAllTasks() {
    var index = 0;
    arr_names.forEach(function (element) {
        console.log(arr_names[index]);
        index++;
    });
}
deleteTask;
function deleteTask(task) {
    for (var index = 0; index < arr_names.length; index++) {
        if (arr_names[index] == task) {
            console.log("===========DELETE TASK==========\n");
            console.log(task + " deleted into the list");
            arr_names.splice(index, 1);
            break;
        }
    }
}
addTask("Buy eggs", 1);
addTask("Start working with TypeScript", 1);
addTask("Buy bottle", 3);
addTask("Collect money", 4);
deleteTask("Collect money");
listAllTasks();
