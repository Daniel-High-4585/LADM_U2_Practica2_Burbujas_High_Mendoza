package com.example.ladm_u2_practica2_burbujas

import android.graphics.Canvas
import android.graphics.Paint
import kotlin.random.Random

class FiguraGeometrica() {

    var x = 0f
    var y = 0f
    var radio = 0f
    var ancho = 0f
    var alto = 0f

    var incX = 5f
    var incY = 5f

    //-----------------------------------------------------------

    constructor(x:Int,y:Int,radio:Int):this(){
        this.x = x.toFloat()
        this.y = y.toFloat()
        this.radio = radio.toFloat()
        alto =  this.radio*2
        ancho = this.radio*2
        incX = incX*(50/this.radio)
        incY = incX*(50/this.radio)
        if(Random.nextInt(-1..1)==-1){
            incX = incX*-1
        }
        if(Random.nextInt(-1..1)==-1){
            incY = incY*-1
        }
    }//----------------------------------------------------------

    fun Random.nextInt(range: IntRange): Int {
        return range.start + nextInt(range.last - range.start)
    }


    fun dibujar(c: Canvas, p: Paint){
        c.drawCircle(x+radio, y+radio , radio ,p)

    }//---------------------------------------------------------

    fun estaEnArea(posX:Float,posY:Float):Boolean{
        if(posX>= x && posX <= x+ancho){
            if(posY >= y && posY <=y+alto) {
                return true
            }
        }
        return false
    }//---------------------------------------------------------

    fun rebote(ancho:Int, alto:Int){
        x+= incX
        if(x<= -100||x>=ancho){
            incX*=-1
        }
        y+=incY
        if(y<=-100||y>=alto){
            incY*=-1
        }
    }//------------------------------------------------------------


}

