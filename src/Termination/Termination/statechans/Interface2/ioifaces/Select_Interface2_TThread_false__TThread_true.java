package Termination.Termination.statechans.Interface2.ioifaces;

import Termination.Termination.roles.*;
import Termination.Termination.statechans.Interface2.*;

public interface Select_Interface2_TThread_false__TThread_true<__Succ1 extends Succ_Out_TThread_false, __Succ2 extends Succ_Out_TThread_true> extends Out_TThread_false<__Succ1>, Out_TThread_true<__Succ2>, Succ_In_TThread_isShutdouwnRequested {
	public static final Select_Interface2_TThread_false__TThread_true<?, ?> cast = null;

	@Override
	default Select_Interface2_TThread_false__TThread_true<?, ?> to(Select_Interface2_TThread_false__TThread_true<?, ?> cast) {
		return (Select_Interface2_TThread_false__TThread_true<?, ?>) this;
	}

	default Termination_Interface2_2 to(Termination_Interface2_2 cast) {
		return (Termination_Interface2_2) this;
	}
}