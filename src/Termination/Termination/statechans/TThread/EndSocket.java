package Termination.Termination.statechans.TThread;

import Termination.Termination.*;
import Termination.Termination.roles.*;
import Termination.Termination.statechans.TThread.ioifaces.*;

public final class EndSocket extends org.scribble.runtime.statechans.EndSocket<Termination, TThread> implements Succ_In_Interface2_true {
	public static final EndSocket cast = null;

	protected EndSocket(org.scribble.runtime.session.SessionEndpoint<Termination, TThread> se, boolean dummy) {
		super(se);
	}

	@Override
	public EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}