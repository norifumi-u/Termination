package Termination.Termination.statechans.TThread.ioifaces;

import Termination.Termination.roles.*;
import Termination.Termination.statechans.TThread.*;

public interface Select_TThread_Interface2_isShutdouwnRequested<__Succ1 extends Succ_Out_Interface2_isShutdouwnRequested> extends Out_Interface2_isShutdouwnRequested<__Succ1>, Succ_In_Interface2_false {
	public static final Select_TThread_Interface2_isShutdouwnRequested<?> cast = null;

	@Override
	default Select_TThread_Interface2_isShutdouwnRequested<?> to(Select_TThread_Interface2_isShutdouwnRequested<?> cast) {
		return (Select_TThread_Interface2_isShutdouwnRequested<?>) this;
	}

	default Termination_TThread_1 to(Termination_TThread_1 cast) {
		return (Termination_TThread_1) this;
	}
}