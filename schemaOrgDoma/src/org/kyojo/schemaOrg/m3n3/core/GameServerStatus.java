package org.kyojo.schemaOrg.m3n3.core;

import org.kyojo.schemaOrg.m3n3.CamelizedName;
import org.kyojo.schemaOrg.m3n3.ConstantizedName;
import org.kyojo.schemaOrg.m3n3.JsonLdContext;
import org.kyojo.schemaOrg.m3n3.SampleValue;
import org.kyojo.schemaOrg.m3n3.SchemaOrgComment;
import org.kyojo.schemaOrg.m3n3.SchemaOrgLabel;
import org.kyojo.schemaOrg.m3n3.SchemaOrgURI;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://schema.org/GameServerStatus")
@CamelizedName("gameServerStatus")
@ConstantizedName("GAME_SERVER_STATUS")
public interface GameServerStatus extends Clazz.GameServerStatus {

	public String value();

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/OfflinePermanently")
	@SchemaOrgLabel("OfflinePermanently")
	@SchemaOrgComment(""
			+ "Game server status: OfflinePermanently. Server is offline and not available.")
	@CamelizedName("offlinePermanently")
	@ConstantizedName("OFFLINE_PERMANENTLY")
	@SampleValue("3")
	public interface OfflinePermanently extends GameServerStatus {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/OfflineTemporarily")
	@SchemaOrgLabel("OfflineTemporarily")
	@SchemaOrgComment(""
			+ "Game server status: OfflineTemporarily. Server is offline now but it can be"
			+ " online soon.")
	@CamelizedName("offlineTemporarily")
	@ConstantizedName("OFFLINE_TEMPORARILY")
	@SampleValue("4")
	public interface OfflineTemporarily extends GameServerStatus {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/Online")
	@SchemaOrgLabel("Online")
	@SchemaOrgComment(""
			+ "Game server status: Online. Server is available.")
	@CamelizedName("online")
	@ConstantizedName("ONLINE")
	@SampleValue("1")
	public interface Online extends GameServerStatus {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/OnlineFull")
	@SchemaOrgLabel("OnlineFull")
	@SchemaOrgComment(""
			+ "Game server status: OnlineFull. Server is online but unavailable. The maximum"
			+ " number of players has reached.")
	@CamelizedName("onlineFull")
	@ConstantizedName("ONLINE_FULL")
	@SampleValue("2")
	public interface OnlineFull extends GameServerStatus {

	}

}
