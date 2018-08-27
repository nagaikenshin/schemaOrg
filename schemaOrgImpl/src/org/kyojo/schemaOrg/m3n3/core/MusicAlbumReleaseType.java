package org.kyojo.schemaorg.m3n3.core;

import org.kyojo.schemaorg.CamelizedName;
import org.kyojo.schemaorg.ConstantizedName;
import org.kyojo.schemaorg.JsonLdContext;
import org.kyojo.schemaorg.SampleValue;
import org.kyojo.schemaorg.SchemaOrgComment;
import org.kyojo.schemaorg.SchemaOrgLabel;
import org.kyojo.schemaorg.SchemaOrgURI;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://schema.org/MusicAlbumReleaseType")
@CamelizedName("musicAlbumReleaseType")
@ConstantizedName("MUSIC_ALBUM_RELEASE_TYPE")
public interface MusicAlbumReleaseType extends Clazz.MusicAlbumReleaseType {

	public String value();

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/AlbumRelease")
	@SchemaOrgLabel("AlbumRelease")
	@SchemaOrgComment("AlbumRelease.")
	@CamelizedName("albumRelease")
	@ConstantizedName("ALBUM_RELEASE")
	@SampleValue("1")
	public interface AlbumRelease extends MusicAlbumReleaseType {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/BroadcastRelease")
	@SchemaOrgLabel("BroadcastRelease")
	@SchemaOrgComment("BroadcastRelease.")
	@CamelizedName("broadcastRelease")
	@ConstantizedName("BROADCAST_RELEASE")
	@SampleValue("2")
	public interface BroadcastRelease extends MusicAlbumReleaseType {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/EPRelease")
	@SchemaOrgLabel("EPRelease")
	@SchemaOrgComment("EPRelease.")
	@CamelizedName("epRelease")
	@ConstantizedName("EP_RELEASE")
	@SampleValue("3")
	public interface EPRelease extends MusicAlbumReleaseType {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/SingleRelease")
	@SchemaOrgLabel("SingleRelease")
	@SchemaOrgComment("SingleRelease.")
	@CamelizedName("singleRelease")
	@ConstantizedName("SINGLE_RELEASE")
	@SampleValue("4")
	public interface SingleRelease extends MusicAlbumReleaseType {

	}

}
