var fs=require('fs');


var data = fs.readFileSync('newFile.txt', 'utf8').split(' ');
var c=0;
for(var i=0;i<data.length;i++){

    if(data[i]=='Jhon'){
        c++;
      
    }
  
}

console.log(c);
console.log(data);