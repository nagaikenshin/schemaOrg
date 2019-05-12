package org.kyojo.schemaorg.m3n5.doma.bib.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.bib.impl.VARIANT_COVER;
import org.kyojo.schemaorg.m3n5.bib.Container.VariantCover;

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
