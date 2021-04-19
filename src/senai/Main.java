package senai;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("--- Sistemas de Eventos ---");
		Usuario usuario1 = new Usuario("João");
		Usuario usuario2 = new Usuario("Maria");
		
		System.out.println("--- Evento 1 ---");
		Evento evento1 = new EventoPresencial("Java for Dummies", LocalDate.of(2020, 8, 10), usuario1, "Senai/SC",20);
		evento1.addParticipante(usuario2);
		
		System.out.println("--- Evento 2 ----");
		EventoVirtual evento2 = new EventoVirtual ("PostgreSQL for Dummies", LocalDate.of(2020, 9, 7), usuario2, "http://eventovirtual.orb.br/123");
		evento2.addParticipante(usuario2);
		
		System.out.println("--- Fim ---");
		

	}

}
 