package structural.facade;

public class Main {

	public static void main(String[] args) {
		
		HomeTheaterFacade htf=new HomeTheaterFacade(new PopcornPopper(), new TheaterLights(), new Projector(), new DvdPlayer());
		htf.watchMovie("2001: A Space Odyssey");
	}

}
