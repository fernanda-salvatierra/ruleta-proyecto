package Negocio;
import Lista.ListaCircular;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;
public class Funciones extends Thread {
    private JPanel JP;
    private Graphics G;
    private Dibujar D;
    private ListaCircular lc;
    private int x0,y0,w,h;
    public Funciones(JPanel pn,ListaCircular lc){
        this.JP = pn;
        this.G = JP.getGraphics();
        this.lc = lc;
        D = new Dibujar(JP);
        x0=50;
        y0=50;
        w=500;
        h=500;
    }
    public void mSleep(){try{sleep(400);}catch(Exception e){}}
    public void Sleep(){try{sleep(800);}catch(Exception e){}}
    public void Sleep(int s){try{sleep(1200/s);}catch(Exception e){}}
    public void vacio(){
        G.setColor(Color.white);
        G.fillRect(x0, y0, JP.getWidth(), JP.getHeight());
    }
    public void DibRul(){
        G.setColor(Color.white);
        G.fillRect(x0, y0, w, h);
        NodoLC X=this.lc.getpLC();
        int T=lc.Tamanio();
        for(int j=0;j<T;j++){
            D.Color(X.getC());
            D.Color(X.getC());
            D.DElem(x0, y0, w, h, 90+(360*j-180)/T, 360/T);
            X=X.getrD();
        }
        D.Puntero();
    }
    public void GirarR(ListaCircular lc){
        Random r = new Random();
        int ale= r.nextInt(lc.Tamanio())+1;
        int ale2= ale;
        int tiempo=3*lc.Tamanio()+ale;
        //3 GIROS 
        for (int i = 0; i < lc.Tamanio()*3; i++) {
            lc.IrIzq();
            Sleep(tiempo);
            tiempo--;
            DibRul();
        }
        //ULTIMOS MOVIMIENTOS
        while(ale2>0){
            lc.IrIzq();
            Sleep(tiempo);
            tiempo--;
            DibRul();
            ale2--;
        }
        //DibRul();
        this.D.MostrarCuanto(lc.getpLC().getNombre(),lc.getpLC().getPrecio());
    }
}
