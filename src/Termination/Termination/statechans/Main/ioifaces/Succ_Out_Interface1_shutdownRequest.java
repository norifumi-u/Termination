package Termination.Termination.statechans.Main.ioifaces;

import Termination.Termination.statechans.Main.EndSocket;

public interface Succ_Out_Interface1_shutdownRequest {

	default EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}