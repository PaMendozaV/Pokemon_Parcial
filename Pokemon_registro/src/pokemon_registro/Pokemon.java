
package pokemon_registro;

public class Pokemon {
    public long ID;
    public String nombre;
    public int nivel;
    public String tipo;
    
    Pokemon(){
        super();
}
    Pokemon(long ID, String nombre, int nivel, String tipo){
   this.ID=ID;
   this. nombre=nombre;
   this.nivel=nivel;
   this.tipo=tipo;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "ID=" + ID + ", nombre=" + nombre + ", nivel=" + nivel + ", tipo=" + tipo + '}';
    }
    
    
}
