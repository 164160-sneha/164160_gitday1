interface Shape{
    color:string
    area():number
    toString()
}

class Circle implements Shape{
    color:string
    radius:number

constructor(color:string,radius:number){
    this.color=color;
    this.radius=radius;
}

    area():number{
        return 3.14*(this.radius*this.radius)
    }
     toString(){
        console.log("shape is circle "+" color is "+this.color+" area is "+this.area())
    } 

}

class Rectangle implements Shape{
    color:string
    width:number
    height:number

constructor(color:string,width:number,height:number){
    this.color=color;
    this.width=width;
    this.height=height;
}

    area():number{
        return this.width*this.height
    }
     toString(){
        console.log("shape is rectangle "+" color is "+this.color+" area is "+this.area())
    } 

}
var cir=new Circle("yellow",4)
cir.area(); 
cir.toString();

var rec=new Rectangle("red",7,5)
rec.area(); 
rec.toString();



