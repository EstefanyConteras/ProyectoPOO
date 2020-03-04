[1mdiff --git a/Clase.java b/Clase.java[m
[1mindex 43887ea..819112f 100644[m
[1m--- a/Clase.java[m
[1m+++ b/Clase.java[m
[36m@@ -1,4 +1,4 @@[m
[31m-enum Clase {[m
[32m+[m[32mpublic enum Clase {[m
     MAGO,[m
     GUERRERO,[m
     CAZADOR,[m
[1mdiff --git a/Inventario.java b/Inventario.java[m
[1mindex 1a18b89..cc3d3e4 100644[m
[1m--- a/Inventario.java[m
[1m+++ b/Inventario.java[m
[36m@@ -5,5 +5,21 @@[m [mimport java.util.ArrayList;[m
  */[m
 public class Inventario {[m
     public int capacidad;[m
[31m-    public ArrayList<Item> items;[m
[32m+[m[32m    public ArrayList<Item> contenido;[m
[32m+[m
[32m+[m[32m    public void setCapacidad(int capacidad) {[m
[32m+[m[32m        this.capacidad = capacidad;[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m    public int getCapacidad() {[m
[32m+[m[32m        return this.capacidad;[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m    public void setContenido(ArrayList<Item> contenido) {[m
[32m+[m[32m        this.contenido = contenido;[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m    public ArrayList<Item> getContenido() {[m
[32m+[m[32m        return this.contenido;[m
[32m+[m[32m    }[m
 }[m
[1mdiff --git a/Item.java b/Item.java[m
[1mindex 25c346c..a17dde4 100644[m
[1m--- a/Item.java[m
[1m+++ b/Item.java[m
[36m@@ -5,4 +5,28 @@[m [mpublic abstract class Item {[m
     private String nombre;[m
     private String descripcion;[m
     private int costo;[m
[32m+[m
[32m+[m[32m    public void setNombre(String nombre) {[m
[32m+[m[32m        this.nombre = nombre;[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m    public String getNombre() {[m
[32m+[m[32m        return this.nombre;[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m    public void setDescripcion(String descripcion) {[m
[32m+[m[32m        this.descripcion = descripcion;[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m    public String getDescripcion() {[m
[32m+[m[32m        return this.descripcion;[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m    public void setCosto(int costo) {[m
[32m+[m[32m        this.costo = costo;[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m    public int getCosto() {[m
[32m+[m[32m        return this.costo;[m
[32m+[m[32m    }[m
 }[m
[1mdiff --git a/Personaje.java b/Personaje.java[m
[1mindex 7650d11..b78438f 100644[m
[1m--- a/Personaje.java[m
[1m+++ b/Personaje.java[m
[36m@@ -107,11 +107,66 @@[m [mpublic class Personaje {[m
         return this.dineroActual;[m
     }[m
 [m
[31m-    public Personaje(String nombre) {[m
[31m-        this.setNombre(nombre);[m
[32m+[m[32m    public void setNivel(int nivel) {[m
[32m+[m[32m        this.nivel = nivel;[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m    public int getNivel() {[m
[32m+[m[32m        return this.nivel;[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m    public void setEXP(int EXP) {[m
[32m+[m[32m        this.EXP = EXP;[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m    public int getEXP() {[m
[32m+[m[32m        return this.EXP;[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m    public void setItemPrimario(Item itemPrimario) {[m
[32m+[m[32m        this.itemPrimario = itemPrimario;[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m    public Item getItemPrimario() {[m
[32m+[m[32m        return this.itemPrimario;[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m    public void setItemSecundario(Item itemSecundario) {[m
[32m+[m[32m        this.itemSecundario = itemSecundario;[m
[32m+[m[32m    }[m
 [m
[31m-        System.out.println("Personaje creado con nombre " + nombre + ".");[m
[32m+[m[32m    public Item getItemSecundario() {[m
[32m+[m[32m        return this.itemSecundario;[m
     }[m
 [m
[32m+[m[32m    public void setAtaqueFisico(int ataqueFisico) {[m
[32m+[m[32m        this.ataqueFisico = ataqueFisico;[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m    public int getAtaqueFisico() {[m
[32m+[m[32m        return this.ataqueFisico;[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m    public void setAfinidadMagica(int afinidadMagica) {[m
[32m+[m[32m        this.afinidadMagica = afinidadMagica;[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m    public int getAfinidadMagica() {[m
[32m+[m[32m        return this.afinidadMagica;[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m    public void setVestuario(ArrayList<Item> vestuario) {[m
[32m+[m[32m        //Implementar metodo en clase Vestuario para cambiar vestuario completo[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m    public ArrayList<Item> getVestuario() {[m
[32m+[m[32m        return this.vestuario;[m
[32m+[m[32m    }[m
[32m+[m
[32m+[m[32m    public Personaje(String nombre, int vidaMaxima, int estaminaMaxima, int ataqueFisico, int afinidadMagica) {[m
[32m+[m[32m        this.setNombre(nombre);[m
[32m+[m[32m        this.setVidaMaxima(vidaMaxima);[m
[32m+[m[41m        [m
[32m+[m[32m    }[m
 }[m
  [m
\ No newline at end of file[m
