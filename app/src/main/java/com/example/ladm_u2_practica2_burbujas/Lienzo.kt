package com.example.ladm_u2_practica2_burbujas

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.view.View

class Lienzo(p:MainActivity): View(p){

     var puntero = p
    var circulo1 = FiguraGeometrica(564,456,75)
    var circulo2 = FiguraGeometrica(198,641,20)
    var circulo3 = FiguraGeometrica(542,1350,200)

    var circulo4 = FiguraGeometrica(251,542,100)
    var circulo5 = FiguraGeometrica(556,951,50)
    var circulo6 = FiguraGeometrica(862,628,150)

    var circulo7 = FiguraGeometrica(100,100,68)
    var circulo8 = FiguraGeometrica(200,200,125)
    var circulo9 = FiguraGeometrica(300,300,90)

    override fun onDraw(c: Canvas){
        super.onDraw(c)
        var paint = Paint()

        paint.color = Color.GREEN
        circulo1.dibujar(c,paint)
        paint.color= Color.RED
        circulo2.dibujar(c,paint)
        paint.color = Color.BLUE
        circulo3.dibujar(c,paint)
        paint.color = Color.YELLOW
        circulo4.dibujar(c,paint)
        paint.color = Color.MAGENTA
        circulo5.dibujar(c,paint)
        paint.color = Color.DKGRAY
        circulo6.dibujar(c,paint)
        paint.color = Color.LTGRAY
        circulo7.dibujar(c,paint)
        paint.color = Color.CYAN
        circulo8.dibujar(c,paint)
        paint.color = Color.GRAY
        circulo9.dibujar(c,paint)




    }

    fun rebotarCirculo(){
        circulo1.rebote(width,height)
        circulo2.rebote(width,height)
        circulo3.rebote(width,height)
        circulo4.rebote(width,height)
        circulo5.rebote(width,height)
        circulo6.rebote(width,height)
        circulo7.rebote(width,height)
        circulo8.rebote(width,height)
        circulo9.rebote(width,height)

        invalidate()
    }

    fun choqueCirculos(){
        circulo1.colision(circulo2,width,height)
        circulo1.colision(circulo3,width,height)

        circulo2.colision(circulo1,width,height)
        circulo2.colision(circulo3,width,height)

        circulo3.colision(circulo1,width,height)
        circulo3.colision(circulo2,width,height)

        invalidate()
    }


}