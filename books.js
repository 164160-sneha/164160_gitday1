const express= require("express");
const app=express();
const bodyParser=require("body-parser");
const mongoose = require("mongoose");

app.use(bodyParser.json());

require("./Book")
const Book=mongoose.model("Book")

mongoose.connect("mongodb://sneha:sneha123@ds161890.mlab.com:61890/booksservice",()=>
    console.log("database is connected")
);

app.get("/",(req,res)=>{
    res.send("this is our main endpoint")
});

app.post("/book",(req,res)=>{
    var newBook={
        title: req.body.title,
        author: req.body.author,
        numberPages: req.body.numberPages,
        publisher: req.body.publisher
    }

    var book=new Book(newBook);

    book.save().then(()=>{
    console.log("new book created")
    }).catch((err)=>{
        if(err){
          throw err;  
        }
    })
    res.send("A new book created with success");
})

app.get("/books",(req,res)=>{
    Book.find().then((books)=>{
       res.json(books)
    }).catch((err)=>{
        if(err){
            throw err;
        }
    })
})

app.get("/book/:id",(req,res)=>{
    Book.findById(req.params.id).then((book)=>{
        if(book){
          res.json(book)  
        }else{
            res.sendStatus(404)
        }


    }).catch((err) =>{
        if(err){
            throw err;
        }
    })
})

app.listen(4000, () => {
    console.log("up and running--this is our book service");
})