package Termination.Termination.statechans.Interface2;

import java.io.IOException;
import java.util.concurrent.CompletableFuture;

public class Termination_Interface2_1_Future extends org.scribble.runtime.util.ScribFuture {

	protected Termination_Interface2_1_Future(CompletableFuture<org.scribble.runtime.message.ScribMessage> fut) {
		super(fut);
	}

	public Termination_Interface2_1_Future sync() throws IOException {
		super.get();
		return this;
	}
}