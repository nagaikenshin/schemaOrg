package org.kyojo.schemaOrg.m3n3.core;

import org.kyojo.schemaOrg.m3n3.CamelizedName;
import org.kyojo.schemaOrg.m3n3.ConstantizedName;
import org.kyojo.schemaOrg.m3n3.JsonLdContext;
import org.kyojo.schemaOrg.m3n3.SampleValue;
import org.kyojo.schemaOrg.m3n3.SchemaOrgComment;
import org.kyojo.schemaOrg.m3n3.SchemaOrgLabel;
import org.kyojo.schemaOrg.m3n3.SchemaOrgURI;

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
