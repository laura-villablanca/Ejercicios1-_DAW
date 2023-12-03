package org.villablanca.accidentes;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.StringTokenizer;

public class AccidenteTrafico implements Comparable<AccidenteTrafico> {
	private String numExpediente;
	private LocalDate fecha;
	private LocalTime hora;
	private String localizacion;
	private String numero;
	private String codigoDistrito;
	private String distrito;
	private String tipo_accidente;
	private String estadoMeteorologico;
	private String tipoVehiculo;
	private TipoPersona tipoPersona;
	private String tramoEdad;
	private String sexo;
	private Lesividad lesividad;
	private boolean positivoDroga;
	private boolean positivoAlcohol;
	
	public AccidenteTrafico() {
		
	}

	public String getNumExpediente() {
		return numExpediente;
	}

	public void setNumExpediente(String numExpediente) {
		this.numExpediente = numExpediente;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		DateTimeFormatter formateoFecha = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		this.fecha = LocalDate.parse(fecha, formateoFecha);
	}
	
	public void setFechaConString(String fecha) {
		StringTokenizer st = new StringTokenizer(fecha, "/");
		String dia, mes, year;
		dia = st.nextToken();
		mes = st.nextToken();
		year = st.nextToken();
		this.fecha = LocalDate.of(Integer.parseInt(year), Integer.parseInt(mes), Integer.parseInt(dia));
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setHora(String hora) {
		DateTimeFormatter formateadorHora = DateTimeFormatter.ofPattern("HH:mm:ss"); 
		this.hora = LocalTime.parse(hora, formateadorHora);
	}

	public String getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getCodigoDistrito() {
		return codigoDistrito;
	}

	public void setCodigoDistrito(String codigoDistrito) {
		this.codigoDistrito = codigoDistrito;
	}

	public String getDistrito() {
		return distrito;
	}

	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}

	public String getTipo_accidente() {
		return tipo_accidente;
	}

	public void setTipo_accidente(String tipo_accidente) {
		
		switch(tipo_accidente) {
		case "Alcance":
			//this.tipo_accidente = String.ALCANCE;
			break;
		}
	}

	public String getEstadoMeteorologico() {
		return estadoMeteorologico;
	}

	public void setEstadoMeteorologico(String estadoMeteorologico) {
		this.estadoMeteorologico = estadoMeteorologico;
	}

	public String getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(String tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	public TipoPersona getTipoPersona() {
		return tipoPersona;
	}

	public void setTipoPersona(String tipoPersona) {
		switch(tipoPersona) {
		case "Pasajero":
			this.tipoPersona = TipoPersona.VIAJERO;
		}
	}

	public String getTramoEdad() {
		return tramoEdad;
	}

	public void setTramoEdad(String tramoEdad) {
		this.tramoEdad = tramoEdad;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Lesividad getLesividad() {
		return lesividad;
	}

	public void setLesividad(String codigo) {
		switch(codigo) {
		case "01", "1", "02", "2", "05", "5", "07", "7":
			this.lesividad = Lesividad.LEVE;
			break;
		case "3", "03":
			this.lesividad = Lesividad.GRAVE;
			break;
		case "4", "04":
			this.lesividad = Lesividad.FALLECIDO;
			break;
		case "14":
			this.lesividad = Lesividad.SIN_ASISTENCIA;
			break;
		case "77":
			this.lesividad = Lesividad.DESCONOCIDO;
			break;
		default:
			this.lesividad = Lesividad.SIN_ASISTENCIA;
			break;
		}
	}
	
	public void setPositivoDrogas(boolean positivoDrogas) {
		this.positivoDroga = positivoDrogas;
	}
	
	public void setPositivoAlcohol(boolean positivoAlcohol) {
		this.positivoAlcohol =  positivoAlcohol;
	}
	
	public boolean isPositivoAlcohol() {
		return positivoAlcohol;
	}
	
	public boolean isPositivoDrogas() {
		return positivoDroga;
	}

	@Override
	public String toString() {
		return "AccidenteTrafico [numExpediente=" + numExpediente + ", fecha=" + fecha + ", hora=" + hora
				+ ", localizacion=" + localizacion + ", numero=" + numero + ", codigoDistrito=" + codigoDistrito
				+ ", distrito=" + distrito + ", tipo_accidente=" + tipo_accidente + ", estadoMeteorologico="
				+ estadoMeteorologico + ", tipoVehiculo=" + tipoVehiculo + ", tipoPersona=" + tipoPersona
				+ ", tramoEdad=" + tramoEdad + ", sexo=" + sexo + ", lesividad=" + lesividad + ", positivoDroga="
				+ positivoDroga + ", positivoAlcohol=" + positivoAlcohol + "]";
	}

	@Override
	public int compareTo(AccidenteTrafico o) {
		// TODO Auto-generated method stub
		return this.getFecha().compareTo(o.getFecha());
	}
	
	
	
	

}
