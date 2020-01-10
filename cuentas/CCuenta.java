package cuentas;
/**
 * @author 		chipi
 * @version 	1.0
 * @see 		Castells_Garcia_Adrian_Tarea_ED04.docx
 * @since 		07-01-2020
 * */
public class CCuenta {


    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipo;
    /**
     * Metodo que devuelve el nombre
     * @return		Devuelve el nombre
     * @since 		1.0
     * */
    public String getNombre() {
		return nombre;
	}
    /**
     * Metodo que cambia el nombre
     * @param		nombre Nombre de la persona de la cuenta
     * @since 		1.0
     * */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
     * Metodo que devuelve la cuenta bancaria
     * @return		Devuelve la cuenta de la persona
     * @since 		1.0
     * */
	public String getCuenta() {
		return cuenta;
	}

	/**
     * Metodo que cambia el valor del numero de cuenta
     * @param		cuenta Cambia elvalor del numero de cuenta
     * @since 		1.0
     * */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
     * Metodo que devuelve el saldo de la cuenta bancaria
     * @return		Devuelve el saldo de la cuenta bancaria
     * @since 		1.0
     * */
	public double getSaldo() {
		return saldo;
	}


	/**
     * Metodo que cambia el valor del saldo del numero de cuenta
     * @param		saldo Cambia el valor del saldo del numero de cuenta
     * @since 		1.0
     * */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
     * Metodo que devuelve el tipo de la cuenta bancaria
     * @return		Devuelve el tipo de la cuenta bancaria
     * @since 		1.0
     * */
	public double getTipo() {
		return tipo;
	}

	/**
     * Metodo que cambia el tipo del numero de cuenta
     * @param		tipo Cambia el tipo del numero de cuenta
     * @since 		1.0
     * */
	public void setTipo(double tipo) {
		this.tipo = tipo;
	}
	
	/**
     * Metodo Constructor CCuenta
     * <p> Crea un objeto Cuenta vacio</p>
     * @since 		1.0
     * */
    public CCuenta()
    {
    }
    /**
     * Metodo Constructor CCuenta con parametros
     * <p> Crea un objeto Cuenta con parametros</p>
     * @param		nom Nombre del propietario de la cuenta
     * @param		cue Numero de cuenta bancaria
     * @param		sal Saldo de la cuenta bancaria
     * @param		tipo Tipo de cuenta bancaria
     * @since 		1.0
     * */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
    /**
     * Metodo que devuelve el saldo actual de la cuenta bancaria
     * @return		Devuelve el valor del saldo actual de la cuenta bancaria
     * @since 		1.0
     * */
    public double estado()
    {
        return saldo;
    }
    /**
     * Metodo que permite ingresar cierta cantidad
     * @param		cantidad Cantidad a ingresar en la cuenta bancaria
     * @exception	Se lanza cuando el valor cantidad sea menor a 0
     * @throws		Salta mensaje No se puede ingresar una cantidad negativa
     * @since 		1.0
     * */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0) {
            throw new Exception("No se puede ingresar una cantidad negativa");
        }else {
        	saldo = saldo + cantidad;
        }
    }
    /**
     * Metodo que permite retirar cierta cantidad de dinero
     * @param		cantidad Cantidad a retirar en la cuenta bancaria
     * @exception	Se lanza cuando el valor cantidad sea menor o igual a 0
     * @throws		Salta mensaje No se puede retirar una cantidad negativa
     * @exception	Se lanza cuando el valor actual de la cuenta sea menor a la cantidad a ingresar
     * @throws		Salta mensaje No se hay suficiente saldo
     * @since 		1.0
     * */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0) {
            throw new Exception ("No se puede retirar una cantidad negativa");
        }
        if (estado()< cantidad) {
            throw new Exception ("No se hay suficiente saldo");
    }saldo = saldo - cantidad;
    }
}
