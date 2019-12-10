package Termination.Termination.statechans.Interface2.ioifaces;

import Termination.Termination.roles.*;
import Termination.Termination.ops.*;
import Termination.Termination.statechans.Interface2.*;

public interface Receive_Interface2_TThread_isShutdouwnRequested<__Succ1 extends Succ_In_TThread_isShutdouwnRequested> extends In_TThread_isShutdouwnRequested<__Succ1>, Succ_Out_TThread_false {
	public static final Receive_Interface2_TThread_isShutdouwnRequested<?> cast = null;

	abstract public __Succ1 async(TThread role, isShutdouwnRequested op) throws org.scribble.main.ScribRuntimeException;

	@Override
	default Receive_Interface2_TThread_isShutdouwnRequested<?> to(Receive_Interface2_TThread_isShutdouwnRequested<?> cast) {
		return (Receive_Interface2_TThread_isShutdouwnRequested<?>) this;
	}

	default Termination_Interface2_1 to(Termination_Interface2_1 cast) {
		return (Termination_Interface2_1) this;
	}
}