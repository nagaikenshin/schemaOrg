package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.clazz;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.DIETARY_SUPPLEMENT;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Clazz.DietarySupplement;

@ExternalDomain
public class DietarySupplementConverter implements DomainConverter<DietarySupplement, String> {

	@Override
	public String fromDomainToValue(DietarySupplement domain) {
		return domain.getNativeValue();
	}

	@Override
	public DietarySupplement fromValueToDomain(String value) {
		return new DIETARY_SUPPLEMENT(value);
	}

}
