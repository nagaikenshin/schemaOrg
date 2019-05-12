package org.kyojo.schemaorg.m3n5.doma.bib.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.bib.impl.COVER_ART;
import org.kyojo.schemaorg.m3n5.bib.Clazz.CoverArt;

@ExternalDomain
public class CoverArtConverter implements DomainConverter<CoverArt, String> {

	@Override
	public String fromDomainToValue(CoverArt domain) {
		return domain.getNativeValue();
	}

	@Override
	public CoverArt fromValueToDomain(String value) {
		return new COVER_ART(value);
	}

}
