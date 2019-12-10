package Termination.Termination.statechans.TThread.ioifaces;

import Termination.Termination.roles.*;
import Termination.Termination.statechans.TThread.*;

public interface Branch_TThread_Interface2_false__Interface2_true<__Succ1 extends Succ_In_Interface2_false, __Succ2 extends Succ_In_Interface2_true> extends Succ_Out_Interface2_isShutdouwnRequested {
	public static final Branch_TThread_Interface2_false__Interface2_true<?, ?> cast = null;

	abstract Case_TThread_Interface2_false__Interface2_true<__Succ1, __Succ2> branch(Interface2 role) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract void branch(Interface2 role, Handle_TThread_Interface2_false__Interface2_true<__Succ1, __Succ2> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	abstract void handle(Interface2 role, Handle_TThread_Interface2_false__Interface2_true<Succ_In_Interface2_false, Succ_In_Interface2_true> handler) throws org.scribble.main.ScribRuntimeException, java.io.IOException, ClassNotFoundException;

	@Override
	default Branch_TThread_Interface2_false__Interface2_true<?, ?> to(Branch_TThread_Interface2_false__Interface2_true<?, ?> cast) {
		return (Branch_TThread_Interface2_false__Interface2_true<?, ?>) this;
	}

	default Termination_TThread_2 to(Termination_TThread_2 cast) {
		return (Termination_TThread_2) this;
	}

public enum Branch_TThread_Interface2_false__Interface2_true_Enum implements org.scribble.runtime.session.OpEnum {
	false, true
}
}