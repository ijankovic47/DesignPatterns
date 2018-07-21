package structural.facade;

public class HomeTheaterFacade {

	private PopcornPopper popper;
	private TheaterLights lights;
	private Projector projector;
	private DvdPlayer dvdPlayer;
	
	public HomeTheaterFacade(PopcornPopper popper, TheaterLights lights, Projector projector,
			DvdPlayer dvdPlayer) {

		this.popper=popper;
		this.lights=lights;
		this.projector=projector;
		this.dvdPlayer=dvdPlayer;
	}
	
	public void watchMovie(String movie) {
		
		popper.on();
		popper.pop();
		lights.dim();
		projector.on();
		projector.wideScreenMode();
		dvdPlayer.play(movie);
	}
	
	
}
