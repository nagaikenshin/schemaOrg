package org.kyojo.schemaorg.m3n4.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n4.core.Clazz.GamePlayMode;
import org.kyojo.schemaorg.m3n4.core.Container;
import org.kyojo.schemaorg.m3n4.core.Container.Name;

import org.seasar.doma.Transient;

public class PLAY_MODE implements Container.PlayMode {

	private static final long serialVersionUID = 1L;

	@Transient
	public List<GamePlayMode> gamePlayModeList;

	public PLAY_MODE() {
	}

	public PLAY_MODE(String string) {
		this(new GAME_PLAY_MODE(string));
	}

	public String getString() {
		if(gamePlayModeList == null || gamePlayModeList.size() == 0 || gamePlayModeList.get(0) == null) {
			return null;
		} else {
			Name name = gamePlayModeList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(gamePlayModeList == null) {
			gamePlayModeList = new ArrayList<GamePlayMode>();
		}
		if(gamePlayModeList.size() == 0) {
			gamePlayModeList.add(new GAME_PLAY_MODE(string));
		} else {
			gamePlayModeList.set(0, new GAME_PLAY_MODE(string));
		}
	}

	public PLAY_MODE(GamePlayMode gamePlayMode) {
		gamePlayModeList = new ArrayList<GamePlayMode>();
		gamePlayModeList.add(gamePlayMode);
	}

	@Override
	public GamePlayMode getGamePlayMode() {
		if(gamePlayModeList != null && gamePlayModeList.size() > 0) {
			return gamePlayModeList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setGamePlayMode(GamePlayMode gamePlayMode) {
		if(gamePlayModeList == null) {
			gamePlayModeList = new ArrayList<>();
		}
		if(gamePlayModeList.size() == 0) {
			gamePlayModeList.add(gamePlayMode);
		} else {
			gamePlayModeList.set(0, gamePlayMode);
		}
	}

	@Override
	public List<GamePlayMode> getGamePlayModeList() {
		return gamePlayModeList;
	}

	@Override
	public void setGamePlayModeList(List<GamePlayMode> gamePlayModeList) {
		this.gamePlayModeList = gamePlayModeList;
	}

	@Override
	public boolean hasGamePlayMode() {
		return gamePlayModeList != null && gamePlayModeList.size() > 0 && gamePlayModeList.get(0) != null;
	}

	@Override
	public String getNativeValue() {
		return getString();
	}

	@Override
	public String toString() {
		return SimpleJsonBuilder.toJson(this);
	}

}
