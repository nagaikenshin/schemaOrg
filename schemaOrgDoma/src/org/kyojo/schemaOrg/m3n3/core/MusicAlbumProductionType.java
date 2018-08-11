package org.kyojo.schemaOrg.m3n3.core;

import org.kyojo.schemaOrg.CamelizedName;
import org.kyojo.schemaOrg.ConstantizedName;
import org.kyojo.schemaOrg.JsonLdContext;
import org.kyojo.schemaOrg.SampleValue;
import org.kyojo.schemaOrg.SchemaOrgComment;
import org.kyojo.schemaOrg.SchemaOrgLabel;
import org.kyojo.schemaOrg.SchemaOrgURI;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://schema.org/MusicAlbumProductionType")
@CamelizedName("musicAlbumProductionType")
@ConstantizedName("MUSIC_ALBUM_PRODUCTION_TYPE")
public interface MusicAlbumProductionType extends Clazz.MusicAlbumProductionType {

	public String value();

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/CompilationAlbum")
	@SchemaOrgLabel("CompilationAlbum")
	@SchemaOrgComment("CompilationAlbum.")
	@CamelizedName("compilationAlbum")
	@ConstantizedName("COMPILATION_ALBUM")
	@SampleValue("1")
	public interface CompilationAlbum extends MusicAlbumProductionType {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/DJMixAlbum")
	@SchemaOrgLabel("DJMixAlbum")
	@SchemaOrgComment("DJMixAlbum.")
	@CamelizedName("djMixAlbum")
	@ConstantizedName("DJ_MIX_ALBUM")
	@SampleValue("2")
	public interface DJMixAlbum extends MusicAlbumProductionType {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/DemoAlbum")
	@SchemaOrgLabel("DemoAlbum")
	@SchemaOrgComment("DemoAlbum.")
	@CamelizedName("demoAlbum")
	@ConstantizedName("DEMO_ALBUM")
	@SampleValue("3")
	public interface DemoAlbum extends MusicAlbumProductionType {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/LiveAlbum")
	@SchemaOrgLabel("LiveAlbum")
	@SchemaOrgComment("LiveAlbum.")
	@CamelizedName("liveAlbum")
	@ConstantizedName("LIVE_ALBUM")
	@SampleValue("4")
	public interface LiveAlbum extends MusicAlbumProductionType {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/MixtapeAlbum")
	@SchemaOrgLabel("MixtapeAlbum")
	@SchemaOrgComment("MixtapeAlbum.")
	@CamelizedName("mixtapeAlbum")
	@ConstantizedName("MIXTAPE_ALBUM")
	@SampleValue("5")
	public interface MixtapeAlbum extends MusicAlbumProductionType {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/RemixAlbum")
	@SchemaOrgLabel("RemixAlbum")
	@SchemaOrgComment("RemixAlbum.")
	@CamelizedName("remixAlbum")
	@ConstantizedName("REMIX_ALBUM")
	@SampleValue("6")
	public interface RemixAlbum extends MusicAlbumProductionType {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/SoundtrackAlbum")
	@SchemaOrgLabel("SoundtrackAlbum")
	@SchemaOrgComment("SoundtrackAlbum.")
	@CamelizedName("soundtrackAlbum")
	@ConstantizedName("SOUNDTRACK_ALBUM")
	@SampleValue("7")
	public interface SoundtrackAlbum extends MusicAlbumProductionType {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/SpokenWordAlbum")
	@SchemaOrgLabel("SpokenWordAlbum")
	@SchemaOrgComment("SpokenWordAlbum.")
	@CamelizedName("spokenWordAlbum")
	@ConstantizedName("SPOKEN_WORD_ALBUM")
	@SampleValue("8")
	public interface SpokenWordAlbum extends MusicAlbumProductionType {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/StudioAlbum")
	@SchemaOrgLabel("StudioAlbum")
	@SchemaOrgComment("StudioAlbum.")
	@CamelizedName("studioAlbum")
	@ConstantizedName("STUDIO_ALBUM")
	@SampleValue("9")
	public interface StudioAlbum extends MusicAlbumProductionType {

	}

}
