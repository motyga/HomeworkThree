package modal

open class Shape(var x:Double, var y:Double) {

    open var area: Double = 0.0
    get() = field

    open var perimetr: Double = 0.0
    get() = field
}

class Circle(x:Double, y:Double, var radius:Double): Shape(x,y) {

    override var area: Double = Math.PI * radius * radius
        get() = field

    override var perimetr: Double = 2 * Math.PI * radius
        get() = field
}

class Triangle(x:Double, y:Double, var a:Double, var b:Double, var c:Double): Shape(x,y) {

    override var perimetr: Double = a + b + c
        get() = field

    private val halfP = perimetr / 2

    override var area: Double = Math.sqrt(halfP * (halfP - a) * (halfP - b) * (halfP - c))
        get() = field

    fun isTriangle() : Boolean {
        var retVal = false

        if ((a + b) >= c && (a + c) >= b && (c + b) >= a)
            retVal = true

        return retVal
    }
}

class Rectangle(x:Double, y:Double, var width:Double, var height:Double) : Shape(x, y) {

    override var perimetr: Double = 2 * width + 2 * height
        get() = field

    override var area: Double = width * height
        get() = field
}
