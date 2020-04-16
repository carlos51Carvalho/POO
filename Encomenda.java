
/**
 * Write a description of class Encomenda here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

import java.util.List;
import java.util.ArrayList;

public class Encomenda
{
   private String codenc;
   private String coduser;
   private String codloja;
   private double peso;
   private ArrayList<LinhaEncomenda> linha;
   
    
    public Encomenda()
    {
        this.codenc = new String();
        this.coduser = new String();
        this.codloja = new String();
        this.peso = 0;
        this.linha = new ArrayList<>();
        
    }
    
    public Encomenda (String e, String u,String l, double y, ArrayList<LinhaEncomenda> li)
    {
        this.codenc = e;
        this.coduser = u;
        this.codloja = l;
        this.peso = y;
        this.setLinha(li);
    }
    
    public Encomenda (Encomenda e)
    {
        this.codenc = e.getCodenc();
        this.coduser = e.getCoduser();
        this.codloja = e.getCodloja();
        this.peso = e.getPeso();
        this.setLinha(e.getLinha());
    }
    
    public String getCodenc()
    {
        return this.codenc;
    }
    
    public String getCoduser()
    {
        return this.coduser;
    }
    
    public String getCodloja()
    {
        return this.codloja;
    }
    
    public double getPeso()
    {
        return this.peso;
    }
    
    public ArrayList<LinhaEncomenda> getLinha()
    {
        ArrayList<LinhaEncomenda> aux = new ArrayList<>();
        for(LinhaEncomenda l : this.linha)
            aux.add(l);
        return aux;
    }
        
    public void setCodenc(String s)
    {
        this.codenc = s;
    }
    
    public void setCoduser(String n)
    {
        this.coduser = n;
    }
    
    public void setCodloja (String l)
    {
        this.codloja =l;
    }
    
    public void setPeso (double l)
    {
        this.peso = l;
    }
    
    public void setLinha (ArrayList<LinhaEncomenda> l)
    {
        this.linha = new ArrayList<>();
        for(LinhaEncomenda li : l)
            this.linha.add(li);
    }
    
    public Encomenda clone()
    {
        return new Encomenda(this);
    }
    
    public boolean equals (Object o)
    {
        if (o == this) return true;
        if (o == null || o.getClass() != this.getClass()) return false;
        Encomenda u = (Encomenda) o;
        return this.codenc.equals(u.getCodenc()) &&
               this.coduser.equals(u.getCoduser()) &&
               this.codloja.equals(u.getCodloja()) &&
               this.peso == u.getPeso() &&
               this.linha.equals(u.getLinha());               
    }
}
