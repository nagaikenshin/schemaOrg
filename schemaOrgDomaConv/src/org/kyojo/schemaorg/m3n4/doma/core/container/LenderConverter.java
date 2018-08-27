package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.LENDER;
import org.kyojo.schemaorg.m3n4.core.Container.Lender;

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
