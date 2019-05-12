package org.kyojo.schemaorg.m3n5.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.healthLifesci.impl.DUPLICATE_THERAPY;
import org.kyojo.schemaorg.m3n5.healthLifesci.Container.DuplicateTherapy;

@ExternalDomain
public class DuplicateTherapyConverter implements DomainConverter<DuplicateTherapy, String> {

	@Override
	public String fromDomainToValue(DuplicateTherapy domain) {
		return domain.getNativeValue();
	}

	@Override
	public DuplicateTherapy fromValueToDomain(String value) {
		return new DUPLICATE_THERAPY(value);
	}

}
