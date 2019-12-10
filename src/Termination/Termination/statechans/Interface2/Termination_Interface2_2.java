package Termination.Termination.statechans.Interface2;

import java.io.IOException;
import Termination.Termination.*;
import Termination.Termination.roles.*;
import Termination.Termination.ops.*;
import Termination.Termination.statechans.Interface2.ioifaces.*;

public final class Termination_Interface2_2 extends org.scribble.runtime.statechans.OutputSocket<Termination, Interface2> implements Select_Interface2_TThread_false__TThread_true<Termination_Interface2_1, EndSocket> {
	public static final Termination_Interface2_2 cast = null;

	protected Termination_Interface2_2(org.scribble.runtime.session.SessionEndpoint<Termination, Interface2> se, boolean dummy) {
		super(se);
	}

	public Termination_Interface2_1 send(TThread role, false op) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, Termination.false);

		return new Termination_Interface2_1(this.se, true);
	}

	public Termination.Termination.statechans.Interface2.EndSocket send(TThread role, true op) throws org.scribble.main.ScribRuntimeException, IOException {
		super.writeScribMessage(role, Termination.true);

		this.se.setCompleted();
		return new EndSocket(this.se, true);
	}
}