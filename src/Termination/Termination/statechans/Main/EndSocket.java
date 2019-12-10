package Termination.Termination.statechans.Main;

import Termination.Termination.*;
import Termination.Termination.roles.*;
import Termination.Termination.statechans.Main.ioifaces.*;

public final class EndSocket extends org.scribble.runtime.statechans.EndSocket<Termination, Main> implements Succ_Out_Interface1_shutdownRequest {
	public static final EndSocket cast = null;

	protected EndSocket(org.scribble.runtime.session.SessionEndpoint<Termination, Main> se, boolean dummy) {
		super(se);
	}

	@Override
	public EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}