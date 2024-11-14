package taller3.televisores;

public class TV {
	private Marca marca;
	private int canal;
	private int precio;
	boolean estado;
	private int volumen;
	private Control control;
	private static int numTV = 0;
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		this.canal =1;
		this.volumen = 1;
		this.precio = 500;
		numTV++;
	}
	public Marca getMarca() {
		return marca;
	}
	public void setMarca(Marca nmarca) {
		marca = nmarca;
	}
	public int getCanal() {
		return canal;
	}
	public void setCanal(int ncanal) {
		if(ncanal >=1 && ncanal <= 120) {
		canal = ncanal;
		}
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int nprecio) {
		precio = nprecio;
	}
	public int getVolumen() {
		return volumen;
	}
	public void setVolumen(int nvol) {
		if(nvol <= 7 && nvol >= 0 ) {
		volumen = nvol;
		}
	}
	public void setControl(Control ncontrol) {
		control = ncontrol;
	}
	public Control getControl() {
		return control;
	}
	public static void setNumTV(int nuevnum) {
		numTV = nuevnum;
	}
	public static int getNumTV() {
		return numTV;
	}
	public void turnOn(){	
		estado = true;
	}
	public void turnOff() {
		estado = false;
	}
	public boolean getEstado() {
		return estado;
	}
	public boolean canalUp() {
		if ((canal <120) && estado == true) {
		canal++;
		return true;
		}
		else {
			return false;
		}
	}
	public boolean canalDown() {
		if ((canal > 1 ) && estado == true) {
		canal--;
		return true;
		}
		else {
			return false;
		}
	}
	public boolean volumenUp() {
		if ((volumen <7) && estado == true) {
		volumen++;
		return true;
		}
		else {
			return false;
		}
	}
	public boolean volumenDown() {
		if ((volumen > 0) && estado == true) {
		volumen--;
		return true;
		}
		else{
			return false;
		}
	}
}
// Sergio Morales