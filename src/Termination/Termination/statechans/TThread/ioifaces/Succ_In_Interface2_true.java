package Termination.Termination.statechans.TThread.ioifaces;

import Termination.Termination.statechans.TThread.EndSocket;

public interface Succ_In_Interface2_true {

	default EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}