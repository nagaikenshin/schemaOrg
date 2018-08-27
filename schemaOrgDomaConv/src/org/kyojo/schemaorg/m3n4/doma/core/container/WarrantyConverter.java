package org.kyojo.schemaorg.m3n4.doma.core.container;

import org.seasar.doma.ExternalDomain;
import org.seasar.doma.jdbc.domain.DomainConverter;

import org.kyojo.schemaorg.m3n4.core.impl.WARRANTY;
import org.kyojo.schemaorg.m3n4.core.Container.Warranty;

@ExternalDomain
public class WarrantyConverter implements DomainConverter<Warranty, String> {

	@Override
	public String fromDomainToValue(Warranty domain) {
		return domain.getNativeValue();
	}

	@Override
	public Warranty fromValueToDomain(String value) {
		return new WARRANTY(value);
	}

}
