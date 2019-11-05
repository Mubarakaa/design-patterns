package com.mb.design_patterns.behavorial.mediator;

public class TurnOnAllLightsCommand implements Command {

	private Mediator med;

	public TurnOnAllLightsCommand(Mediator mediator) {
		med = mediator;
	}

	@Override
	public void execute() {
		med.turnOnAllLights();
	}

}
