package org.kyojo.schemaorg.m3n5.core;

import org.kyojo.schemaorg.CamelizedName;
import org.kyojo.schemaorg.ConstantizedName;
import org.kyojo.schemaorg.JsonLdContext;
import org.kyojo.schemaorg.SampleValue;
import org.kyojo.schemaorg.SchemaOrgComment;
import org.kyojo.schemaorg.SchemaOrgLabel;
import org.kyojo.schemaorg.SchemaOrgURI;

@JsonLdContext("http://schema.org")
@SchemaOrgURI("http://schema.org/MusicReleaseFormatType")
@CamelizedName("musicReleaseFormatType")
@ConstantizedName("MUSIC_RELEASE_FORMAT_TYPE")
public interface MusicReleaseFormatType extends Clazz.MusicReleaseFormatType {

	public String value();

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/CDFormat")
	@SchemaOrgLabel("CDFormat")
	@SchemaOrgComment("CDFormat.")
	@CamelizedName("cdFormat")
	@ConstantizedName("CD_FORMAT")
	@SampleValue("1")
	public interface CDFormat extends MusicReleaseFormatType {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/CassetteFormat")
	@SchemaOrgLabel("CassetteFormat")
	@SchemaOrgComment("CassetteFormat.")
	@CamelizedName("cassetteFormat")
	@ConstantizedName("CASSETTE_FORMAT")
	@SampleValue("2")
	public interface CassetteFormat extends MusicReleaseFormatType {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/DVDFormat")
	@SchemaOrgLabel("DVDFormat")
	@SchemaOrgComment("DVDFormat.")
	@CamelizedName("dvdFormat")
	@ConstantizedName("DVD_FORMAT")
	@SampleValue("3")
	public interface DVDFormat extends MusicReleaseFormatType {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/DigitalAudioTapeFormat")
	@SchemaOrgLabel("DigitalAudioTapeFormat")
	@SchemaOrgComment("DigitalAudioTapeFormat.")
	@CamelizedName("digitalAudioTapeFormat")
	@ConstantizedName("DIGITAL_AUDIO_TAPE_FORMAT")
	@SampleValue("4")
	public interface DigitalAudioTapeFormat extends MusicReleaseFormatType {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/DigitalFormat")
	@SchemaOrgLabel("DigitalFormat")
	@SchemaOrgComment("DigitalFormat.")
	@CamelizedName("digitalFormat")
	@ConstantizedName("DIGITAL_FORMAT")
	@SampleValue("5")
	public interface DigitalFormat extends MusicReleaseFormatType {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/LaserDiscFormat")
	@SchemaOrgLabel("LaserDiscFormat")
	@SchemaOrgComment("LaserDiscFormat.")
	@CamelizedName("laserDiscFormat")
	@ConstantizedName("LASER_DISC_FORMAT")
	@SampleValue("6")
	public interface LaserDiscFormat extends MusicReleaseFormatType {

	}

	@JsonLdContext("http://schema.org")
	@SchemaOrgURI("http://schema.org/VinylFormat")
	@SchemaOrgLabel("VinylFormat")
	@SchemaOrgComment("VinylFormat.")
	@CamelizedName("vinylFormat")
	@ConstantizedName("VINYL_FORMAT")
	@SampleValue("7")
	public interface VinylFormat extends MusicReleaseFormatType {

	}

}
