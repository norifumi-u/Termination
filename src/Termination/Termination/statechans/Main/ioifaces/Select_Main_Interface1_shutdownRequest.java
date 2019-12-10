package Termination.Termination.statechans.Main.ioifaces;

import Termination.Termination.roles.*;
import Termination.Termination.statechans.Main.*;

public interface Select_Main_Interface1_shutdownRequest<__Succ1 extends Succ_Out_Interface1_shutdownRequest> extends Out_Interface1_shutdownRequest<__Succ1> {
	public static final Select_Main_Interface1_shutdownRequest<?> cast = null;

	default Termination_Main_1 to(Termination_Main_1 cast) {
		return (Termination_Main_1) this;
	}
}