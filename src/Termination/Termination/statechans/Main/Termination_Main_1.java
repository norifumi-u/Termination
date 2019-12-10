package Termination.Termination.statechans.Main;

import java.io.IOException;
import Termination.Termination.*;
import Termination.Termination.roles.*;
import Termination.Termination.ops.*;
import Termination.Termination.statechans.Main.ioifaces.*;

public final class Termination_Main_1 extends org.scribble.runtime.statechans.OutputSocket<Termination, Main> implements Select_Main_Interface1_shutdownRequest<EndSocket> {
	public static final Termination_Main_1 cast = null;

	protected Termination_Main_1(org.scribble.runtime.session.SessionEndpoint<Termination, Main> se, boolean dummy) {
		super(se);
	}

	public Termination_Main_1(org.scribble.runtime.session.MPSTEndpoint<Termination, Main> se) throws org.scribble.main.ScribRuntimeException {
		super(se);
		se.init();
	}

	public Termination.Termination.statechans.Main.EndSocket send(Interface1 role, shutdownRequest op) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, Termination.shutdownRequest);

		this.se.setCompleted();
		return new EndSocket(this.se, true);
	}
}