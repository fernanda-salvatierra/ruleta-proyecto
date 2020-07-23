package Lista;
import Negocio.NodoLC;
import java.awt.Color;

public class ListaCircular {
    private NodoLC pLC;
    public ListaCircular(){
        this.pLC=null;
    }
    public NodoLC getpLC() {
        return pLC;
    }
    public void setpLC(NodoLC pLC) {
        this.pLC = pLC;
    }
    public boolean Vacia(){
        return this.pLC==null ? true : false;
    }
    public void InsertDer(String n,double p){
        int num= Tamanio()+1;
        NodoLC N=new NodoLC(num, n, p);
        if(Vacia()){
            this.pLC=N;
            this.pLC.setrD(this.pLC);
            this.pLC.setrI(this.pLC);
        }else{
            this.pLC.getrD().setrI(N);
            N.setrD(this.pLC.getrD());
            this.pLC.setrD(N);
            N.setrI(this.pLC);
            
            IrDer();
        }
    }
    public void InsertIzq(String n,double p){
        int num = Tamanio()+1;
        NodoLC N=new NodoLC(num, n, p);
        if(Vacia()){
            this.pLC=N;
            this.pLC.setrD(this.pLC);
            this.pLC.setrI(this.pLC);
        }else{
            this.pLC.getrI().setrD(N);
            N.setrI(this.pLC.getrI());
            this.pLC.setrI(N);
            N.setrD(this.pLC);
            
            IrIzq();
        }
    }
    public void Eliminar(){
        if(!Vacia()){
            if(this.pLC.getrD()==this.pLC){
                this.pLC=null;
            }else{
                this.pLC=this.pLC.getrI();
                this.pLC.setrD(this.pLC.getrD().getrD());
                this.pLC.getrD().setrI(this.pLC);
            }
        }
    }
    public void IrIzq(){
            this.pLC=!Vacia()?this.pLC.getrI():this.pLC;
    }
    public void IrDer(){
            this.pLC=!Vacia()?this.pLC.getrD():this.pLC;
    }
    public int Tamanio(){
        int t=0;
        if(!Vacia()){
            NodoLC X= this.pLC;
            do{
                t++;
                X=X.getrD();
            }while(X!=this.pLC);
        }
        return t;
    }
    public void InsertarColor(Color c){
        this.pLC.setC(c);
    }
}