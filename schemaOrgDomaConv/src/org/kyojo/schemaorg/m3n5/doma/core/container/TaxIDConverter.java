package org.kyojo.schemaorg.m3n5.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n5.core.impl.TAX_ID;
import org.kyojo.schemaorg.m3n5.core.Container.TaxID;

@ExternalDomain
public class TaxIDConverter implements DomainConverter<TaxID, String> {

	@Override
	public String fromDomainToValue(TaxID domain) {
		return domain.getNativeValue();
	}

	@Override
	public TaxID fromValueToDomain(String value) {
		return new TAX_ID(value);
	}

}
