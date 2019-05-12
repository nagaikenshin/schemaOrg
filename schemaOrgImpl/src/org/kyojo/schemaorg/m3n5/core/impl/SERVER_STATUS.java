package org.kyojo.schemaorg.m3n5.core.impl;

import java.util.ArrayList;
import java.util.List;

import org.kyojo.schemaorg.SimpleJsonBuilder;
import org.kyojo.schemaorg.m3n5.core.Clazz.GameServerStatus;
import org.kyojo.schemaorg.m3n5.core.Container;
import org.kyojo.schemaorg.m3n5.core.Container.Name;

public class SERVER_STATUS implements Container.ServerStatus {

	private static final long serialVersionUID = 1L;

	public List<GameServerStatus> gameServerStatusList;

	public SERVER_STATUS() {
	}

	public SERVER_STATUS(String string) {
		this(new GAME_SERVER_STATUS(string));
	}

	public String getString() {
		if(gameServerStatusList == null || gameServerStatusList.size() == 0 || gameServerStatusList.get(0) == null) {
			return null;
		} else {
			Name name = gameServerStatusList.get(0).getName();
			if(name == null || name.getTextList() == null || name.getTextList().size() == 0 || name.getTextList().get(0) == null) {
				return null;
			} else {
				return name.getTextList().get(0).getString();
			}
		}
	}

	public void setString(String string) {
		if(gameServerStatusList == null) {
			gameServerStatusList = new ArrayList<GameServerStatus>();
		}
		if(gameServerStatusList.size() == 0) {
			gameServerStatusList.add(new GAME_SERVER_STATUS(string));
		} else {
			gameServerStatusList.set(0, new GAME_SERVER_STATUS(string));
		}
	}

	public SERVER_STATUS(GameServerStatus gameServerStatus) {
		gameServerStatusList = new ArrayList<GameServerStatus>();
		gameServerStatusList.add(gameServerStatus);
	}

	@Override
	public GameServerStatus getGameServerStatus() {
		if(gameServerStatusList != null && gameServerStatusList.size() > 0) {
			return gameServerStatusList.get(0);
		} else {
			return null;
		}
	}

	@Override
	public void setGameServerStatus(GameServerStatus gameServerStatus) {
		if(gameServerStatusList == null) {
			gameServerStatusList = new ArrayList<>();
		}
		if(gameServerStatusList.size() == 0) {
			gameServerStatusList.add(gameServerStatus);
		} else {
			gameServerStatusList.set(0, gameServerStatus);
		}
	}

	@Override
	public List<GameServerStatus> getGameServerStatusList() {
		return gameServerStatusList;
	}

	@Override
	public void setGameServerStatusList(List<GameServerStatus> gameServerStatusList) {
		this.gameServerStatusList = gameServerStatusList;
	}

	@Override
	public boolean hasGameServerStatus() {
		return gameServerStatusList != null && gameServerStatusList.size() > 0 && gameServerStatusList.get(0) != null;
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
