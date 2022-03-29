package taller3.televisores;

public class TV {
	
	private Marca marca;
	public Control control;
	public int precio;
	public int canal;
	public int volumen;
	public boolean estado;
	private static int numTV;
	
	
	
	public TV(Marca marca, boolean estado) {
		this.marca = marca;
		this.estado = estado;
		this.canal = 1;
		this.precio = 500;
		this.volumen = 1;
		TV.numTV++;
		
	}
	
	public static int getNumTV() {
		return numTV;
	}


	public static void setNumTV(int numTV) {
		TV.numTV = numTV;
	}

	public void turnOn() {
		this.estado = true;
	}
	
	public void turnOff() {
		this.estado = false;
	}
	
	public boolean getEstado() {
		return this.estado;
		
	}
	           
	public void canalUp() {
		
		if(this.estado && this.canal < 120 && this.canal > 1) {
			
			this.canal++;
			
		}
		
		
		
	}
	
	public void canalDown() {
		
		if(this.estado && this.canal < 120 && this.canal > 1) {
					
					this.canal--;
					
				}
		
		
	}
	
	public void volumenUp() {
		
		if(this.estado && this.volumen < 7 && this.volumen > 0) {
			this.volumen++;
		}
		
		
	}
	
	public void volumenDown() {
		if(this.estado && this.volumen < 7 && this.volumen > 0) {
			this.volumen--;
		}
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
			if(this.estado == true && canal <= 120 && canal >= 1) {
				
				this.canal = canal;
						
						
			}
		
	}

	public int getVolumen() {
		return volumen;
	}

	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}

	public Marca getMarca() {
		return marca;
	}

	public void setMarca(Marca marca) {
		this.marca = marca;
	}

	public Control getControl() {
		return control;
	}

	public void setControl(Control control) {
		this.control = control;
	}
	
	
	
	
	
	
	
	

}
