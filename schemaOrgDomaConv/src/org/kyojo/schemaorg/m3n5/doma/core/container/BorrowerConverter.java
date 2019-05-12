package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.BORROWER;
import org.kyojo.schemaorg.m3n5.core.Container.Borrower;

@ExternalDomain
public class BorrowerConverter implements DomainConverter<Borrower, String> {

	@Override
	public String fromDomainToValue(Borrower domain) {
		return domain.getNativeValue();
	}

	@Override
	public Borrower fromValueToDomain(String value) {
		return new BORROWER(value);
	}

}
