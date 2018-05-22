package org.kyojo.schemaOrg.m3n3.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaOrg.m3n3.core.impl.LENDER;
import org.kyojo.schemaOrg.m3n3.core.Container.Lender;

@ExternalDomain
public class LenderConverter implements DomainConverter<Lender, String> {

	@Override
	public String fromDomainToValue(Lender domain) {
		return domain.getNativeValue();
	}

	@Override
	public Lender fromValueToDomain(String value) {
		return new LENDER(value);
	}

}
