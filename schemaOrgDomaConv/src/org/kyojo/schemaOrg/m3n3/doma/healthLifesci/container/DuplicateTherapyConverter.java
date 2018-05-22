package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.DUPLICATE_THERAPY;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.DuplicateTherapy;

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
