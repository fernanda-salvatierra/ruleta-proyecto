package Negocio;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import javax.swing.JPanel;
public class Dibujar {
    Font myFont = new Font ("Courier New", 1, 20);
    private JPanel J;
    private Graphics g;
    public Dibujar(JPanel JP){
        this.J = JP;
        this.g = JP.getGraphics();
        this.g.setFont(myFont);
    }
    public void DElem(int x,int y, int w, int h, int ai, int af){
        g.fillArc(x, y, w, h, ai, af);
        g.setColor(Color.BLACK);
        g.drawArc(x, y, w, h, ai, af);
    }
    public void Color(Color c){
        g.setColor(c);
    }
    public void MostrarCuanto(String N,double p){
        g.setColor(Color.white);
        g.fillRect(490, 500, 390, 100);
        g.setColor(Color.black);
        g.drawString("Usted a conseguido: "+N, 500, 550);
        g.drawString("Valor del premio: $ "+p, 500, 580);
    }
    public void Puntero(){
        g.setColor(new Color(255,215,0));
        g.fillArc(250, 40, 100, 100, 60, 60);
        
    }
}
