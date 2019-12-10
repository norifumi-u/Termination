package Termination.Termination.statechans.TThread;

import java.io.IOException;
import Termination.Termination.*;
import Termination.Termination.roles.*;
import Termination.Termination.ops.*;
import Termination.Termination.statechans.TThread.ioifaces.*;

public final class Termination_TThread_1 extends org.scribble.runtime.statechans.OutputSocket<Termination, TThread> implements Select_TThread_Interface2_isShutdouwnRequested<Termination_TThread_2> {
	public static final Termination_TThread_1 cast = null;

	protected Termination_TThread_1(org.scribble.runtime.session.SessionEndpoint<Termination, TThread> se, boolean dummy) {
		super(se);
	}

	public Termination_TThread_1(org.scribble.runtime.session.MPSTEndpoint<Termination, TThread> se) throws org.scribble.main.ScribRuntimeException {
		super(se);
		se.init();
	}

	public Termination_TThread_2 send(Interface2 role, isShutdouwnRequested op) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, Termination.isShutdouwnRequested);

		return new Termination_TThread_2(this.se, true);
	}
}