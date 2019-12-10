package Termination.Termination.statechans.Interface1;

import Termination.Termination.*;
import Termination.Termination.roles.*;
import Termination.Termination.statechans.Interface1.ioifaces.*;

public final class EndSocket extends org.scribble.runtime.statechans.EndSocket<Termination, Interface1> implements Succ_In_Main_shutdownRequest {
	public static final EndSocket cast = null;

	protected EndSocket(org.scribble.runtime.session.SessionEndpoint<Termination, Interface1> se, boolean dummy) {
		super(se);
	}

	@Override
	public EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}