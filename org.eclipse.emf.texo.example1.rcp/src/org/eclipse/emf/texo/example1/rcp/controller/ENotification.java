package org.eclipse.emf.texo.example1.rcp.controller;

import org.eclipse.emf.common.notify.Notification;

public abstract class ENotification implements Notification {

	@Override
	public boolean wasSet() {
		//
		return false;
	}

	@Override
	public boolean isTouch() {
		//
		return false;
	}

	@Override
	public boolean isReset() {
		//
		return false;
	}

	@Override
	public int getPosition() {
		//
		return 0;
	}

	@Override
	public boolean merge(Notification notification) {
		//
		return false;
	}

	@Override
	public boolean getOldBooleanValue() {
		//
		return false;
	}

	@Override
	public boolean getNewBooleanValue() {
		//
		return false;
	}

	@Override
	public byte getOldByteValue() {
		//
		return 0;
	}

	@Override
	public byte getNewByteValue() {
		//
		return 0;
	}

	@Override
	public char getOldCharValue() {
		//
		return 0;
	}

	@Override
	public char getNewCharValue() {
		//
		return 0;
	}

	@Override
	public double getOldDoubleValue() {
		//
		return 0;
	}

	@Override
	public double getNewDoubleValue() {
		//
		return 0;
	}

	@Override
	public float getOldFloatValue() {
		//
		return 0;
	}

	@Override
	public float getNewFloatValue() {
		//
		return 0;
	}

	@Override
	public int getOldIntValue() {
		//
		return 0;
	}

	@Override
	public int getNewIntValue() {
		//
		return 0;
	}

	@Override
	public long getOldLongValue() {
		//
		return 0;
	}

	@Override
	public long getNewLongValue() {
		//
		return 0;
	}

	@Override
	public short getOldShortValue() {
		//
		return 0;
	}

	@Override
	public short getNewShortValue() {
		//
		return 0;
	}

	@Override
	public String getOldStringValue() {
		//
		return null;
	}

	@Override
	public String getNewStringValue() {
		//
		return null;
	}
}