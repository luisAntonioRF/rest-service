package com.luis.app.rest.app.entity;

import java.util.List;

public class Pais {

		private String name;
		private String capital;
		private int population;
		private String flag;
		private List<Languages> languages;
		
		public List<Languages> getLanguages() {
			return languages;
		}
		public void setLanguages(List<Languages> languages) {
			this.languages = languages;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getCapital() {
			return capital;
		}
		public void setCapital(String capital) {
			this.capital = capital;
		}
		public int getPopulation() {
			return population;
		}
		public void setPopulation(int population) {
			this.population = population;
		}
		public String getFlag() {
			return flag;
		}
		public void setFlag(String flag) {
			this.flag = flag;
		}
		@Override
		public String toString() {
			return "Pais [name=" + name + ", capital=" + capital + ", population=" + population + ", flag=" + flag
					+ ", languages=" + languages + "]";
		}
		
		
		
		
}
