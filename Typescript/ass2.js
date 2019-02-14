var Circle = /** @class */ (function () {
    function Circle(color, radius) {
        this.color = color;
        this.radius = radius;
    }
    Circle.prototype.area = function () {
        return 3.14 * (this.radius * this.radius);
    };
    Circle.prototype.toString = function () {
        console.log("shape is circle " + " color is " + this.color + " area is " + this.area());
    };
    return Circle;
}());
var Rectangle = /** @class */ (function () {
    function Rectangle(color, width, height) {
        this.color = color;
        this.width = width;
        this.height = height;
    }
    Rectangle.prototype.area = function () {
        return this.width * this.height;
    };
    Rectangle.prototype.toString = function () {
        console.log("shape is rectangle " + " color is " + this.color + " area is " + this.area());
    };
    return Rectangle;
}());
var cir = new Circle("yellow", 4);
cir.area();
cir.toString();
var rec = new Rectangle("red", 7, 5);
rec.area();
rec.toString();
