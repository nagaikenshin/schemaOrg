package org.kyojo.schemaOrg.m3n3.doma.bib.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.bib.impl.VARIANT_COVER;
import org.kyojo.schemaOrg.m3n3.bib.Container.VariantCover;

@ExternalDomain
public class VariantCoverConverter implements DomainConverter<VariantCover, String> {

	@Override
	public String fromDomainToValue(VariantCover domain) {
		return domain.getNativeValue();
	}

	@Override
	public VariantCover fromValueToDomain(String value) {
		return new VARIANT_COVER(value);
	}

}
