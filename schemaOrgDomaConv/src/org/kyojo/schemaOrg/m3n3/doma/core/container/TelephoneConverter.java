package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.TELEPHONE;
import org.kyojo.schemaOrg.m3n3.core.Container.Telephone;

@ExternalDomain
public class TelephoneConverter implements DomainConverter<Telephone, String> {

	@Override
	public String fromDomainToValue(Telephone domain) {
		return domain.getNativeValue();
	}

	@Override
	public Telephone fromValueToDomain(String value) {
		return new TELEPHONE(value);
	}

}
