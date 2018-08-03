package com.cg.renderer;

import com.cg.provider.MessageProvider;

public class ConsoleMessageRenderer implements MessageRenderer {

	private MessageProvider provider;

	@Override
	public void render() {
		System.out.println(provider.getMessage() + " on console");		
	}

	@Override
	public void setMessageProvider(MessageProvider provider) {
		this.provider = provider;		
	}
	

}
