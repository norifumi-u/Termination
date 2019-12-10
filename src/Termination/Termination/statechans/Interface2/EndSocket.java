package Termination.Termination.statechans.Interface2;

import Termination.Termination.*;
import Termination.Termination.roles.*;
import Termination.Termination.statechans.Interface2.ioifaces.*;

public final class EndSocket extends org.scribble.runtime.statechans.EndSocket<Termination, Interface2> implements Succ_Out_TThread_true {
	public static final EndSocket cast = null;

	protected EndSocket(org.scribble.runtime.session.SessionEndpoint<Termination, Interface2> se, boolean dummy) {
		super(se);
	}

	@Override
	public EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}