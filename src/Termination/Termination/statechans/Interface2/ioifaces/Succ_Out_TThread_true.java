package Termination.Termination.statechans.Interface2.ioifaces;

import Termination.Termination.statechans.Interface2.EndSocket;

public interface Succ_Out_TThread_true {

	default EndSocket to(EndSocket cast) {
		return (EndSocket) this;
	}
}