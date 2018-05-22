package org.kyojo.schemaOrg.m3n3.doma.bib.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.bib.impl.ATLAS;
import org.kyojo.schemaOrg.m3n3.bib.Clazz.Atlas;

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
