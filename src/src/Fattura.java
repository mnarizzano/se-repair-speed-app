import java.util.Date;

public class Fattura {
    /** Attributes */
    private int numero;
    private int piva;
    private Date data;
    private double totale;
    
	public Fattura(int numero, int piva, Date data, double totale) {
		super();
		this.numero = numero;
		this.piva = piva;
		this.data = data;
		this.totale = totale;
	}

	public Fattura(int numero, int piva, Date data) {
		super();
		this.numero = numero;
		this.piva = piva;
		this.data = data;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getPiva() {
		return piva;
	}

	public void setPiva(int piva) {
		this.piva = piva;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public double getTotale() {
		return totale;
	}

	public void setTotale(double totale) {
		this.totale = totale;
	}
    
    
    
    
}

