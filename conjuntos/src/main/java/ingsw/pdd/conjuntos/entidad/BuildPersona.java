package ingsw.pdd.conjuntos.entidad;

import java.util.ArrayList;
import java.util.List;
import ingsw.pdd.conjuntos.impl.*;
import ingsw.pdd.conjuntos.entidad.*;

public class BuildPersona implements IBuild {
		
		private int documento;
		private String 			nombre ;
		private String 			genero;
		private int    			edad;
		private Direccion 		direccion;
		private List<Telefono>		telefonos;
		private List<Contacto>	Contactos;

		private BuildPersona(String nombre, String genero, int edad, Direccion direccion, List<Telefono> telefonos,
			List<Contacto> Contactos) {
			this.nombre = nombre;
			this.genero = genero;
			this.edad = edad;
			this.direccion = direccion;
			this.telefonos = telefonos;
			this.Contactos = Contactos;
		}

		
		public BuildPersona(String nombre,int edad, String genero) {
			
			this.nombre = nombre;
			this.genero = genero;
			this.edad = edad;
		}
		
		public BuildPersona() {
			
		}
		
		
		public BuildPersona(int documento, String nombre, String genero, int edad, Direccion direccion,
				List<Telefono> telefonos, List<Contacto> contactos, Login login) {
			super();
			this.documento = documento;
			this.nombre = nombre;
			this.genero = genero;
			this.edad = edad;
			this.direccion = direccion;
			this.telefonos = telefonos;
			this.Contactos = Contactos;
			
		}


		public String getnombre() {
			return nombre;
		}

		public void setnombre(String nombre) {
			this.nombre = nombre;
		}

		public String getgenero() {
			return genero;
		}

		public void setgenero(String genero) {
			this.genero = genero;
		}

		public int getedad() {
			return edad;
		}

		public void setedad(int edad) {
			this.edad = edad;
		}

		public Direccion getdireccion() {
			return direccion;
		}

		public void setDireccion(Direccion direccion) {
			this.direccion = direccion;
		}

		public List<Telefono> gettelefonos() {
			return telefonos;
		}

		public void settelefonos(List<Telefono> telefonos) {
			this.telefonos = telefonos;
		}

		public List<Contacto> getContactos() {
			return Contactos;
		}

		public void setContactos(List<Contacto> Contactos) {
			this.Contactos = Contactos;
		}

		public String toString() {
			return "BuildPersona{"+ "nombre= "+nombre+" edad= "+ edad +" genero= "+genero+"\ndireccion= "+
		direccion+ "Telefono=" +telefonos+" Contactos= "+Contactos+ '}';
					
		}
		
		
		
		
		public static class BuildPersonaBuilder implements IBuild<BuildPersona>{
			
			private String nombre;
			private int edad;
			
			private String genero; 
			private Direccion	direccion;
		
			private final List<Telefono> telefonos = new ArrayList<>(); 
			private final List<Contacto> Contactos = new ArrayList<>();
			
			public BuildPersonaBuilder() {
				
				
			}
			
			
			public BuildPersonaBuilder setnombre(String nombre) {
				this.nombre=nombre;
				return this;
			}

			public BuildPersonaBuilder setedad(int edad) {
				this.edad=edad;
				return this;
			}

			public BuildPersonaBuilder setgenero(String genero) {
				this.genero=genero;
				return this;
			}


			public BuildPersonaBuilder setdireccion(String  dir,  String ciudad,String pais, String cp) 
			{ direccion= new Direccion(dir, ciudad, pais, cp);
					
					return this;  }
			
			
			
					
					public BuildPersonaBuilder addtelefonos(String TelefonoNumber, String ext,
			
					String TelefonoType) {  telefonos.add(new Telefono(TelefonoNumber, ext, TelefonoType));
					
					return this; }
				
				 public BuildPersonaBuilder addContactos(String nombre, String TelefonoNumber,
				
					String ext, String TelefonoType,String direccion, String city, String country, String cp) {
				Contactos.add(new Contacto(nombre, new Telefono(TelefonoNumber, ext, TelefonoType)
				 ,new Direccion(direccion, city, country, cp)));
					
					return this;}
				 
				 public BuildPersonaBuilder addContactos(String nombre, String TelefonoNumber,
						
						 String ext, String TelefonoType) { Contactos.add(new Contacto(nombre, new Telefono(TelefonoNumber, ext, TelefonoType)));

						 return this;  }


				@Override
				public BuildPersona build() {
					
					return new BuildPersona(nombre, genero, edad, direccion, telefonos, Contactos);
				}

				


				
				 
				 
				
				 }

		@Override
		public BuildPersona build() {
	
			return new BuildPersona(nombre, genero, edad, direccion, telefonos, Contactos);
		}


	

	
		
	}