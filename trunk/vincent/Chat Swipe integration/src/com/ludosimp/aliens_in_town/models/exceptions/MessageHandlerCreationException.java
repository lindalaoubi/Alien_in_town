package com.ludosimp.aliens_in_town.models.exceptions;

@SuppressWarnings("serial")
public class MessageHandlerCreationException extends Exception {

	public MessageHandlerCreationException(){
		super("The parameter doesn't respect the format of a Message.");
	}
}
