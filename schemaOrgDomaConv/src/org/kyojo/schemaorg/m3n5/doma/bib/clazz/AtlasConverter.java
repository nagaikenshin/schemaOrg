package org.kyojo.schemaorg.m3n5.doma.bib.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.bib.impl.ATLAS;
import org.kyojo.schemaorg.m3n5.bib.Clazz.Atlas;

@ExternalDomain
public class AtlasConverter implements DomainConverter<Atlas, String> {

	@Override
	public String fromDomainToValue(Atlas domain) {
		return domain.getNativeValue();
	}

	@Override
	public Atlas fromValueToDomain(String value) {
		return new ATLAS(value);
	}

}
