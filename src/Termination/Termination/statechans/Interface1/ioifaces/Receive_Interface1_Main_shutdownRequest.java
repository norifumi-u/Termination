package Termination.Termination.statechans.Interface1.ioifaces;

import Termination.Termination.roles.*;
import Termination.Termination.ops.*;
import Termination.Termination.statechans.Interface1.*;

public interface Receive_Interface1_Main_shutdownRequest<__Succ1 extends Succ_In_Main_shutdownRequest> extends In_Main_shutdownRequest<__Succ1> {
	public static final Receive_Interface1_Main_shutdownRequest<?> cast = null;

	abstract public Termination.Termination.statechans.Interface1.EndSocket async(Main role, shutdownRequest op) throws org.scribble.main.ScribRuntimeException;

	default Termination_Interface1_1 to(Termination_Interface1_1 cast) {
		return (Termination_Interface1_1) this;
	}
}