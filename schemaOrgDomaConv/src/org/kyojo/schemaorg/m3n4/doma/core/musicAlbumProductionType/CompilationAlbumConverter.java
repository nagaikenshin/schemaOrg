package org.kyojo.schemaorg.m3n4.doma.core.musicAlbumProductionType;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.musicAlbumProductionType.COMPILATION_ALBUM;
import org.kyojo.schemaorg.m3n4.core.MusicAlbumProductionType.CompilationAlbum;

@ExternalDomain
public class CompilationAlbumConverter implements DomainConverter<CompilationAlbum, String> {

	@Override
	public String fromDomainToValue(CompilationAlbum domain) {
		return domain.getNativeValue();
	}

	@Override
	public CompilationAlbum fromValueToDomain(String value) {
		return new COMPILATION_ALBUM(value);
	}

}
