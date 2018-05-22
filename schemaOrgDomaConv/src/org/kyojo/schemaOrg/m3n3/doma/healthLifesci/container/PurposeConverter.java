package org.kyojo.schemaOrg.m3n3.doma.healthLifesci.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.healthLifesci.impl.PURPOSE;
import org.kyojo.schemaOrg.m3n3.healthLifesci.Container.Purpose;

@ExternalDomain
public class PurposeConverter implements DomainConverter<Purpose, String> {

	@Override
	public String fromDomainToValue(Purpose domain) {
		return domain.getNativeValue();
	}

	@Override
	public Purpose fromValueToDomain(String value) {
		return new PURPOSE(value);
	}

}
