package org.kyojo.schemaorg.m3n3.core;

import org.kyojo.schemaorg.CamelizedName;
import org.kyojo.schemaorg.ConstantizedName;
import org.kyojo.schemaorg.JsonLdContext;
import org.kyojo.schemaorg.SampleValue;
import org.kyojo.schemaorg.SchemaOrgComment;
import org.kyojo.schemaorg.SchemaOrgLabel;
import org.kyojo.schemaorg.SchemaOrgURI;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://schema.org/GamePlayMode")
@CamelizedName("gamePlayMode")
@ConstantizedName("GAME_PLAY_MODE")
public interface GamePlayMode extends Clazz.GamePlayMode {

	public String value();

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/CoOp")
	@SchemaOrgLabel("CoOp")
	@SchemaOrgComment(""
			+ "Play mode: CoOp. Co-operative games, where you play on the same team with"
			+ " friends.")
	@CamelizedName("coOp")
	@ConstantizedName("CO_OP")
	@SampleValue("1")
	public interface CoOp extends GamePlayMode {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MultiPlayer")
	@SchemaOrgLabel("MultiPlayer")
	@SchemaOrgComment(""
			+ "Play mode: MultiPlayer. Requiring or allowing multiple human players to play"
			+ " simultaneously.")
	@CamelizedName("multiPlayer")
	@ConstantizedName("MULTI_PLAYER")
	@SampleValue("2")
	public interface MultiPlayer extends GamePlayMode {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/SinglePlayer")
	@SchemaOrgLabel("SinglePlayer")
	@SchemaOrgComment(""
			+ "Play mode: SinglePlayer. Which is played by a lone player.")
	@CamelizedName("singlePlayer")
	@ConstantizedName("SINGLE_PLAYER")
	@SampleValue("3")
	public interface SinglePlayer extends GamePlayMode {

	}

}
