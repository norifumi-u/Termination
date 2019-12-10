package Termination.Termination.statechans.Interface1.ioifaces;

import Termination.Termination.statechans.Interface1.EndSocket;

public interface Succ_In_Main_shutdownRequest {

	default EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}